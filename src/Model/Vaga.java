package Model;
import java.util.*;
import java.sql.*;
import DAO.VagaDAO;


public class Vaga {
    
    public static int ID_vaga;
    private String Descricaovaga;
    private String Prerequisito;
    private String Especificacoes;
    private String Contato;
    private final VagaDAO dao;

    public Vaga() {
        this.dao = new VagaDAO();
    }

    public Vaga(int ID_vaga, String Descricaovaga, String Prerequisito, String Especificacoes, String Contato) {
        this.ID_vaga = ID_vaga;
        this.Descricaovaga = Descricaovaga;
        this.Prerequisito = Prerequisito;
        this.Especificacoes = Especificacoes;
        this.Contato = Contato;
        this.dao = new VagaDAO();
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

     public ArrayList getListavagas() {
        return DAO.getListavagas();
    }

    public boolean InserirVagas(Vaga objeto) {
        DAO.InserirVagas(objeto);
        return true;
    }

    public boolean DeletarVagas(int ID_vaga) {
        DAO.DeletarVagas(ID_vaga);
        return true;
    }

    public boolean AtualizarVagas(int id,Vaga objeto) {
        DAO.AtualizarVagas(objeto);
        return true;
    }

    public Curriculo DadosVagas(int ID_vaga) {
        DAO.DadosVagas(ID_vaga);
        return null;
    }
}
