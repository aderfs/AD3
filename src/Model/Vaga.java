
package Model;
import java.util.*;
import java.sql.*;


public class Vaga {
    
    public static int ID_vaga;
    private String Descricaovaga;
    private String Prerequisito;
    private String Especificacoes;
    private String Contato;

    public Vaga() {
    }

    public Vaga(int ID_vaga, String Descricaovaga, String Prerequisito, String Especificacoes, String Contato) {
        this.ID_vaga = ID_vaga;
        this.Descricaovaga = Descricaovaga;
        this.Prerequisito = Prerequisito;
        this.Especificacoes = Especificacoes;
        this.Contato = Contato;
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
        return dao.getListavagas();
    }

    public boolean InserirVagas(Vagas objeto) {
        dao.InserirVagas(objeto);
        return true;
    }

    public boolean DeletarVagas(int ID_vagas) {
        dao.DeletarVagas(ID_vagas);
        return true;
    }

    public boolean AtualizarVagas(Vagas objeto) {
        dao.AtualizarVagas(objeto);
        return true;
    }

    public Curriculo dadosVagas(int ID_vagas) {
        dao.dadosVagas(ID_vagas);
        return null;
    }

    public int maiorID_vagas() throws SQLException {
        return dao.maiorID_vagas();
    }
    
    
    
    
}
