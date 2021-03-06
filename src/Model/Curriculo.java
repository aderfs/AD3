package Model;

import java.util.*;
import java.sql.*;
import DAO.CurriculoDAO;

public class Curriculo {

    public int ID_curriculo;
    private String Nome;
    private String Curriculo;
    private String CPF;
    private String RG;
    private int Idade;
    private final CurriculoDAO DAO; //facilita mudancas de nome na classe DAO

    public Curriculo() {
        this.DAO = new CurriculoDAO(); //instancia a classe CurriculoDAO
    }

    public Curriculo(int ID_curriculo, String Nome, String Curriculo, String CPF, String RG, int Idade) {
        this.ID_curriculo = ID_curriculo;
        this.Nome = Nome;
        this.Curriculo = Curriculo;
        this.CPF = CPF;
        this.RG = RG;
        this.Idade = Idade;
        this.DAO = new CurriculoDAO(); //instancia a classe CurriculoDAO
    }

    public int getID_curriculo() {
        return ID_curriculo;
    }

    public void setID_curriculo(int ID_curriculo) {
        this.ID_curriculo = ID_curriculo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
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

    //Read
    public ArrayList getListacurriculos() {
        return DAO.getListacurriculos();
    }

    //Create
    public boolean InserirCurriculo(Curriculo objeto) {
        DAO.InserirCurriculo(objeto);
        return true;
    }

    //Delete
    public boolean DeletarCurriculo(int ID_curriculo) {
        DAO.DeletarCurriculo(ID_curriculo);
        return true;
    }

    //Update
    public boolean AtualizarCurriculo(Curriculo objeto) {
        DAO.AtualizarCurriculo(objeto);
        return true;
    }

    //Read
    public Curriculo dadosCurriculo(int ID_curriculo) {
        DAO.dadosCurriculo(ID_curriculo);
        return null;
    }

}
