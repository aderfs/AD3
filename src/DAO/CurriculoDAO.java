package DAO;

import Model.Curriculo;
import java.util.*;
import java.sql.*;

public class CurriculoDAO {

    public static ArrayList<Curriculo> ListaCurriculo = new ArrayList<Curriculo>();

    //Construtor Vazio
    public CurriculoDAO() {
    }

    //Conectar no BD
    public Connection getConexao() {

        Connection connection = null;

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "db_curriculo";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "rootpass";

            connection = DriverManager.getConnection(url, user, password);

            //pra saber quando o banco de dados está conectado
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: N�O CONECTADO!");
            }

            return connection;

            //tratametento de exceções
        } catch (ClassNotFoundException e) {
            System.out.println("O driver nao foi encontrado.");
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar");
            return null;
        }
    }

    //Mostrar a lista de curriculos atualizada
    public ArrayList getListacurriculos() {

        ListaCurriculo.clear(); //Limpar lista antiga de curriculos

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_curriculo");   //seleciona todo o bd
            while (res.next()) {

                int id = res.getInt("ID_curriculo");  //parametros
                String nome = res.getString("Nome");
                String curriculo = res.getString("Curriculo");
                String CPF = res.getString("CPF");
                String RG = res.getString("RG");
                int idade = res.getInt("Idade");

                Curriculo objeto = new Curriculo(id, nome, curriculo, CPF, RG, idade);   //instancia de curriculo com os parametros

                ListaCurriculo.add(objeto);  //adicionar os parametros a ListaCurriculo pela instancia de curriculo
            }

            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Nao foi possivel obter a lista atualizada!");
        }

        return ListaCurriculo;  //retorna o ArrayList com a lista atualizada de curriculo
    }

    //Adicionar curriculo novo através de um objeto
    public boolean InserirCurriculo(Curriculo objeto) {
        String sql = "INSERT INTO tb_curriculo(ID_curriculo,Nome,Curriculo,CPF,RG,Idade) VALUES(?,?,?,?,?,?)";  //

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getID_curriculo());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getCurriculo());
            stmt.setString(4, objeto.getCPF());
            stmt.setString(5, objeto.getRG());
            stmt.setInt(6, objeto.getIdade());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    //Deletar curriculo através do ID
    public boolean DeletarCurriculo(int ID_curriculo) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_curriculo WHERE id = " + ID_curriculo);
            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Nao foi possivel deletar o aluno");
        }

        return true;
    }

    //Atualizar o curriculo através de um objeto Curriculo
    public boolean AtualizarCurriculo(Curriculo objeto) {

        String sql = "UPDATE tb_curriculo set Nome = ? ,Curriculo = ? ,CPF = ? ,RG = ?, Idade = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getCurriculo());
            stmt.setString(3, objeto.getCPF());
            stmt.setString(4, objeto.getRG());
            stmt.setInt(5, objeto.getIdade());
            stmt.setInt(6, objeto.getID_curriculo());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    //Mostrar todos os dados do curriculo através do ID
    public Curriculo dadosCurriculo(int ID_curriculo) {

        Curriculo objeto = new Curriculo();
        objeto.setId(ID_curriculo);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * id FROM tb_alunos WHERE id = " + ID_curriculo);
            res.next();

            objeto.setNome = res.getString("Nome");
            objeto.setCurriculo = res.getString("Curriculo");
            objeto.setCPF = res.getString("CPF");
            objeto.setRG = res.getString("RG");
            objeto.setIdade = res.getInt("Idade");

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }

}