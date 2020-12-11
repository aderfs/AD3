package Model;
import java.util.*;
import java.sql.*;
import DAO.VagaDAO;


public class Vaga {
    
    public int ID_vaga;
    private String Descricaovaga;
    private String Prerequisito;
    private String Especificacoes;
    private String Contato;
    private final VagaDAO DAO; //facilita a mudança de nome de classe no DAO

    public Vaga() {
        this.DAO = new VagaDAO(); //instancia a classe VagaDAO
    }

    public Vaga(int ID_vaga, String Descricaovaga, String Prerequisito, String Especificacoes, String Contato) {
        this.ID_vaga = ID_vaga;
        this.Descricaovaga = Descricaovaga;
        this.Prerequisito = Prerequisito;
        this.Especificacoes = Especificacoes;
        this.Contato = Contato;
        this.DAO = new VagaDAO(); //instancia a classe VagaDAO
    }

    public int getID_vaga() {
        return ID_vaga;
    }

    public void setID_vaga(int ID_vaga) {
        this.ID_vaga = ID_vaga;
    }

    public String getDescricaovaga() {
        return Descricaovaga;
    }

    public void setDescricaovaga(String Descricaovaga) {
        this.Descricaovaga = Descricaovaga;
    }

    public String getPrerequisito() {
        return Prerequisito;
    }

    public void setPrerequisito(String Prerequisito) {
        this.Prerequisito = Prerequisito;
    }

    public String getEspecificacoes() {
        return Especificacoes;
    }

    public void setEspecificacoes(String Especificacoes) {
        this.Especificacoes = Especificacoes;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }

    //READ
     public ArrayList getListavagas() {
        return DAO.getListavagas();
    }

    //Create
    public boolean InserirVagas(Vaga objeto) {
        DAO.InserirVagas(objeto);
        return true;
    }

    //Delete
    public boolean DeletarVagas(int ID_vaga) {
        DAO.DeletarVagas(ID_vaga);
        return true;
    }

    //Update
    public boolean AtualizarVagas(int id,Vaga objeto) {
        DAO.AtualizarVagas(objeto);
        return true;
    }

    //Read
    public Curriculo DadosVagas(int ID_vaga) {
        DAO.DadosVagas(ID_vaga);
        return null;
    }
}
