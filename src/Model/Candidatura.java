package Model;
import java.util.*;
import java.sql.*;

public class Candidatura {
    
    private int ID_candidatura;
    private int Curriculo_ID_curriculo;
    private int Vaga_ID_vaga;

    public Candidatura() {
    }

    public Candidatura(int ID_candidatura, int Curriculo_ID_curriculo, int Vaga_ID_vaga) {
        this.ID_candidatura = ID_candidatura;
        this.Curriculo_ID_curriculo = Curriculo_ID_curriculo;
        this.Vaga_ID_vaga = Vaga_ID_vaga;
    }

    public int getID_candidatura() {
        return ID_candidatura;
    }

    public void setID_candidatura(int ID_candidatura) {
        this.ID_candidatura = ID_candidatura;
    }

    public int getCurriculo_ID_curriculo() {
        return Curriculo_ID_curriculo;
    }

    public void setCurriculo_ID_curriculo(int Curriculo_ID_curriculo) {
        this.Curriculo_ID_curriculo = Curriculo_ID_curriculo;
    }

    public int getVaga_ID_vaga() {
        return Vaga_ID_vaga;
    }

    public void setVaga_ID_vaga(int Vaga_ID_vaga) {
        this.Vaga_ID_vaga = Vaga_ID_vaga;
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
