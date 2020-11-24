package Model;

import java.util.*;
import DAO.AlunoDAO;


public class Aluno extends Pessoa {
    
    private String curso;
    private int fase;

    public Aluno() {
    }

    public Aluno(String curso, int fase) {
        this.curso = curso;
        this.fase = fase;
    }

    public Aluno(String curso, int fase, int id, String nome, int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    public ArrayList getMinhaLista() {
        return AlunoDAO.MinhaLista;
    }
    
    public boolean InsertAlunoBD(Aluno objeto) {
        AlunoDAO.MinhaLista.add(objeto);
        return true;
    }
    
    public boolean DeleteAlunoBD(int id) {
        int indice = this.procuraIndice(id);
        AlunoDAO.MinhaLista.remove(indice);
        return true;
    }
    
    public boolean UpdateAlunoBD(int id, Aluno objeto) {
        int indice = this.procuraIndice(id);
        return true;
    }
    
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AlunoDAO.MinhaLista.size(); i++) {
            if (AlunoDAO.MinhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    
    public int maiorID(){
        return AlunoDAO.maiorID();
    }
    
}
