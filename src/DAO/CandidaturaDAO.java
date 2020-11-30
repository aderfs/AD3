package DAO;

import Model.Candidatura;
import java.util.*;
import java.sql.*;

public class CandidaturaDAO {

    public static ArrayList<Candidatura> ListaCandidatura = new ArrayList<Candidatura>();

    public CandidaturaDAO() {
    }

    //Conectar no BD
    public Connection getConexao() {

        Connection connection = null;

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "db_candidatura";
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

    //Mostrar a lista de candidaturas atualizada
    public ArrayList getListacandidaturas() {

        ListaCandidatura.clear(); //Limpar lista antiga de candidaturas

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_candidatura");   //seleciona todo o bd
            while (res.next()) {

                int id = res.getInt("ID_candidatura");  //parametros
                int idc = res.getInt("Curriculo_ID_curriculo");
                int idv = res.getInt("Vaga_ID_vaga");

                Candidatura objeto = new Candidatura(id, idc, idv);   //instancia de curriculo com os parametros

                ListaCandidatura.add(objeto);  //adicionar os parametros a ListaCurriculo pela instancia de curriculo
            }

            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Não foi possivel obter a lista atualizada!");
        }

        return ListaCandidatura;  //retorna o ArrayList com a lista atualizada de curriculo
    }

    //Adicionar uma candidatura nova através de um objeto
    public boolean InserirCandidatura(Candidatura objeto) {
        String sql = "INSERT INTO tb_candidatura(ID_candidatura,Curriculo_ID_curriculo,Vaga_ID_vaga) VALUES(?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getID_candidatura());
            stmt.setInt(2, objeto.getCurriculo_ID_curriculo());
            stmt.setInt(3, objeto.getVaga_ID_vaga());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    //Deletar currículo através do ID
    public boolean DeletarCandidatura(int ID_candidatura) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_candidatura WHERE ID_candidatura = " + ID_candidatura);
            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Não foi possível deletar o currículo");
        }

        return true;
    }

    //Atualizar a candidatura através de um objeto Candidatura
    public boolean AtualizarCandidatura(Candidatura objeto) {

        String sql = "UPDATE tb_candidatura set ID_candidatura = ? ,Curriculo_ID_curriculo = ? ,Vaga_ID_vaga = ? WHERE ID_candidatura = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getID_candidatura());
            stmt.setInt(2, objeto.getCurriculo_ID_curriculo());
            stmt.setInt(3, objeto.getVaga_ID_vaga());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    
    //Mostrar todos os dados da candidatura através do ID
    public Candidatura dadosCandidatura(int ID_candidatura) {

        Candidatura objeto = new Candidatura();
        objeto.setID_candidatura(ID_candidatura);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * id FROM tb_candidatura WHERE ID_candidatura = " + ID_candidatura);
            res.next();

            objeto.setCurriculo_ID_curriculo(res.getInt("Curriculo_ID_curriculo"));
            objeto.setVaga_ID_vaga(res.getInt("Vaga_ID_vaga"));

            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Não foi possível mostrar os dados!");
        }
        return objeto;
    }

}
