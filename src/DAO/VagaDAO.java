package DAO;

import Model.Vaga;
import java.util.*;
import java.sql.*;

public class VagaDAO {

    public static ArrayList<Vaga> ListaVaga = new ArrayList<Vaga>();

    //construtor vazio
    public VagaDAO() {
    }

    //Conectar no BD
    public Connection getConexao() {

        Connection connection = null;

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "db_vaga";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "rootpass";

            connection = DriverManager.getConnection(url, user, password);

            //pra saber quando o banco de dados está conectado
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

            //tratametento de exceções
        } catch (ClassNotFoundException e) {
            System.out.println("O driver não foi encontrado.");
            return null;

        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            return null;
        }
    }

    //Mostrar a lista de vagas atualizada
    public ArrayList getListavagas() {

        ListaVaga.clear(); //Limpar lista antiga de vagas

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_vaga");   //seleciona todo o bd
            while (res.next()) {

                int id = res.getInt("ID_vaga");  //parametros
                String Des = res.getString("Descricaovaga");
                String Pre = res.getString("Prerequisito");
                String Especi = res.getString("Especificacoes");
                String Cont = res.getString("Contato");

                Vaga objeto = new Vaga(id, Des, Pre, Especi, Cont);   //instancia de vaga com os parametros

                ListaVaga.add(objeto);  //adicionar os parametros a ListaVaga pela instancia de vaga
            }

            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Nao foi possivel obter a lista atualizada!");
        }

        return ListaVaga;  //retorna o ArrayList com a lista atualizada de vaga
    }

    //Adicionar curriculo novo através de um objeto
    public boolean InserirVagas(Vaga objeto) {
        String sql = "INSERT INTO tb_vaga(ID_vaga,Descricaovaga,Prerequisito,Especificacoes,Contato) VALUES(?,?,?,?,?)";  //

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getID_vaga());
            stmt.setString(2, objeto.getDescricaovaga());
            stmt.setString(3, objeto.getPrerequisito());
            stmt.setString(4, objeto.getEspecificacoes());
            stmt.setString(5, objeto.getContato());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    //Deletar vaga através do ID
    public boolean DeletarVagas(int ID_vaga) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_vaga WHERE id = " + ID_vaga);
            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Nao foi possivel deletar a vaga");
        }

        return true;
    }

    //Atualizar uma vaga através de um objeto Vaga
    public boolean AtualizarVagas(Vaga objeto) {

        String sql = "UPDATE tb_vaga set Descricaovaga = ? ,Prerequisito = ? ,Especificacoes = ? ,Contato = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getDescricaovaga());
            stmt.setString(2, objeto.getPrerequisito());
            stmt.setString(3, objeto.getEspecificacoes());
            stmt.setString(4, objeto.getContato());
            stmt.setInt(5, objeto.getID_vaga());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    //Mostrar todos os dados do curriculo através do ID
    public Vaga DadosVagas(int ID_vaga) {

        Vaga objeto = new Vaga();
        objeto.setID_vaga(ID_vaga);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * id FROM tb_vaga WHERE id = " + ID_vaga);
            res.next();

            objeto.setDescricaovaga(res.getString("Descricaovaga"));
            objeto.setPrerequisito(res.getString("Prerequisito"));
            objeto.setEspecificacoes(res.getString("Especificacoes"));
            objeto.setContato(res.getString("Contato"));

            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Não foi possível mostrar os dados!");
        }
        return objeto;
    }

}
