package DAO;

import Model.Curriculo;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class CurriculoDAO { //PQ SEM AUTO INCREMENT N FUNCIONA? E PQ PRECISA DO MAIOR ID COM AUTOINCREMENT?
                            //PQ TODOS OS IDS NO GERENCIAR CURRICULO SAO IGUAIS? ESSE É O PROBLEMA P APAGAR? VEREMOS NO PROXIMO EP DE AULA DE PROGRAMAÇÃO

    public static ArrayList<Curriculo> ListaCurriculo = new ArrayList<Curriculo>();

    //Construtor Vazio
    public CurriculoDAO() {
    }

//    public int maiorID() throws SQLException {
//
//        int maiorID = 0;
//        try {
//            Statement stmt = this.getConexao().createStatement();
//            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_curriculo");
//            res.next();
//            maiorID = res.getInt("id");
//
//            stmt.close();
//
//        } catch (SQLException ex) {
//        }
//
//        return maiorID;
//    }

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
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

            //tratametento de exceções
        } catch (ClassNotFoundException e) {
            System.out.println("O driver não foi encontrado.");
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possível conectar");
            return null;
        }
    }

    //Mostrar a lista de curriculos atualizada
    public ArrayList getListacurriculos() {

        ListaCurriculo.clear(); //Limpar lista antiga de currículos

        try {
            Statement stmt = this.getConexao().createStatement();              //conecta ao bd
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_curriculo");   //seleciona todo o bd
            while (res.next()) {

                int id = res.getInt("ID_curriculo");  //parametros
//                JOptionPane.showMessageDialog(null, id);
                String nome = res.getString("Nome");
                String curriculo = res.getString("Curriculo");
                String CPF = res.getString("CPF");
                String RG = res.getString("RG");
                int idade = res.getInt("Idade");

                Curriculo objeto = new Curriculo(id, nome, curriculo, CPF, RG, idade);   //instancia de curriculo com os parametros

                ListaCurriculo.add(objeto);  //adicionar os parâmetros a ListaCurriculo pela instância de Curriculo
            }

            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Não foi possível obter a lista atualizada!");
        }

        return ListaCurriculo;  //retorna o ArrayList com a lista atualizada de curriculo
    }

    //Criar um curriculo novo através de um objeto diretamente no BD
    public boolean InserirCurriculo(Curriculo objeto) {
        String sql = "INSERT INTO tb_curriculo(ID_curriculo,Nome,Curriculo,CPF,RG,Idade) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);     //conecta ao bd e prepara o Statement com os valores da String sql

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
//            JOptionPane.showMessageDialog(null, ID_curriculo);
            stmt.executeUpdate("DELETE FROM tb_curriculo WHERE ID_curriculo = " + ID_curriculo);
            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Nao foi possivel deletar o curriculo");
        }

        return true;
    }

    //Atualizar o curriculo através de um objeto Curriculo
    public boolean AtualizarCurriculo(Curriculo objeto) {

        String sql = "UPDATE tb_curriculo set Nome = ? ,Curriculo = ? ,CPF = ? ,RG = ?, Idade = ? WHERE ID_curriculo = ?";

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
        objeto.setID_curriculo(ID_curriculo);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * id FROM tb_curriculo WHERE id = " + ID_curriculo);
            res.next();

            objeto.setNome(res.getString("Nome"));
            objeto.setCurriculo(res.getString("Curriculo"));
            objeto.setCPF(res.getString("CPF"));
            objeto.setRG(res.getString("RG"));
            objeto.setIdade(res.getInt("Idade"));

            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Não foi possível mostrar os dados!");
        }
        return objeto;
    }

}
