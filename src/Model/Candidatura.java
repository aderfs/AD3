package Model;

import java.util.*;
import java.sql.*;
import DAO.CandidaturaDAO;

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
        return DAO.getListacandidaturas();
    }

    public boolean InserirCandidatura(Candidatura objeto) {
        DAO.InserirCandidatura(objeto);
        return true;
    }

    public boolean DeletarCandidatura(int ID_candidatura) {
        DAO.DeletarCandidatura(ID_candidatura);
        return true;
    }

    public boolean AtualizarCandidatura(int id,Candidatura objeto) {
        DAO.AtualizarCurriculo(objeto);
        return true;
    }

    public Curriculo dadosCandidatura(int ID_candidatura) {
        DAO.dadosCandidatura(ID_candidatura);
        return null;
    }
 
 
}
