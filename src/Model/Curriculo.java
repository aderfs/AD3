package Model;
import java.util.*;
import java.sql.*;


public class Curriculo {
    
    public static int ID_curriculo;
    private String Nome;
    private String Curriculo;
    private String CPF;
    private String RG;
    private int Idade;

    public Curriculo() {
    }

    public Curriculo(int ID_curriculo, String Nome, String Curriculo, String CPF, String RG, int Idade) {
        this.ID_curriculo = ID_curriculo;
        this.Nome = Nome;
        this.Curriculo = Curriculo;
        this.CPF = CPF;
        this.RG = RG;
        this.Idade = Idade;
    }

    public int getID_curriculo() {
        return ID_curriculo;
    }

    public void setID_candidato(int ID_curriculo) {
        this.ID_curriculo = ID_curriculo;
    }
    
    public String getNome() {
        return Nome;
    }
    
    public void setNome() {
        this.Nome = Nome;
    }

    public String getCurriculo() {
        return Curriculo;
    }

    public void setCurriculo(String Curriculo) {
        this.Curriculo = Curriculo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    public ArrayList getListacurriculos() {
        return dao.getListacurriculos();
    }

    public boolean InserirCurriculo(Curriculo objeto) {
        dao.InserirCurriculo(objeto);
        return true;
    }

    public boolean DeletarCurriculo(int ID_curriculo) {
        dao.DeletarCurriculo(ID_curriculo);
        return true;
    }

    public boolean AtualizarCurriculo(Curriculo objeto) {
        dao.AtualizarCurriculo(objeto);
        return true;
    }

    public Curriculo dadosCurriculo(int ID_curriculo) {
        dao.dadosCurriculo(ID_curriculo);
        return null;
    }

    public int maiorID_curriculo() throws SQLException {
        return dao.maiorID_curriculo();
    }
    
}
