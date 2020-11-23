package Model;
import java.util.*;
import java.sql.*;

public class Candidatura {
    
    private int ID_candidatura;
    private int Curriculo;
    private int Vaga;

    public Candidatura() {
    }

    public Candidatura(int ID_candidatura, int Curriculo, int Vaga) {
        this.ID_candidatura = ID_candidatura;
        this.Curriculo = Curriculo;
        this.Vaga = Vaga;
    }

    public int getID_candidatura() {
        return ID_candidatura;
    }

    public void setID_candidatura(int ID_candidatura) {
        this.ID_candidatura = ID_candidatura;
    }

    public int getCurriculo() {
        return Curriculo;
    }

    public void setCurriculo(int Curriculo) {
        this.Curriculo = Curriculo;
    }

    public int getVaga() {
        return Vaga;
    }

    public void setVaga(int Vaga) {
        this.Vaga = Vaga;
    }
    
     public ArrayList getListacandidaturas() {
        return dao.getListacandidaturas();
    }

    public boolean InserirCandidatura(Candidatura objeto) {
        dao.InserirCandidatura(objeto);
        return true;
    }

    public boolean DeletarCandidatura(int ID_candidatura) {
        dao.DeletarCandidatura(ID_candidatura);
        return true;
    }

    public boolean AtualizarCandidatura(Candidatura objeto) {
        dao.AtualizarCurriculo(objeto);
        return true;
    }

    public Curriculo dadosCandidatura(int ID_candidatura) {
        dao.dadosCandidatura(ID_candidatura);
        return null;
    }

    public int maiorID_candidatura() throws SQLException {
        return dao.maiorID_candidatura();
    }
    
 
}
