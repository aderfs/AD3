package Control;

import Model.Candidatura;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class CandidaturaControl {

    private final Candidatura candidatura;
    //atributo para facilitar mudancas no nome do model

    public CandidaturaControl() {
        this.candidatura = new Candidatura(); //instancia a classe model Candidatura
    }

    //Create
    public boolean CadastrarCandidatura(int curriculo, int vaga) throws SQLException {

        int id = 0; //BD possui auto increment
        Candidatura objeto = new Candidatura(id, curriculo, vaga);
        if (candidatura.InserirCandidatura(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    //Update
    public boolean EditarCandidatura(int id, int curriculo, int vaga) {
        Candidatura objeto = new Candidatura(id, curriculo, vaga);
        if (candidatura.AtualizarCandidatura(id, objeto)) {
            return true;
        } else {
            return false;
        }
    }

    //Delete
    public boolean ApagarCandidatura(int id) {
        if (candidatura.DeletarCandidatura(id)) {
            return true;
        } else {
            return false;
        }
    }
  
    //Read
    public ArrayList getListacandidaturas() { //carrega a lista de candidaturas
        return candidatura.getListacandidaturas();
    }

    @SuppressWarnings("unchecked")
    public String[][] getMatrizCandidatura() { //carrega uma matriz com todos os dados organizados

        ArrayList<Candidatura> listacandidaturas = candidatura.getListacandidaturas();
        int tamanho = listacandidaturas.size();

        String MatrizCandidatura[][] = new String[tamanho][3];
        for (int i = 0; i < tamanho; i++) { //traduz a matriz para uma lista valida na VIEW

            MatrizCandidatura[i][0] = listacandidaturas.get(i).getID_candidatura() + "";
            MatrizCandidatura[i][1] = listacandidaturas.get(i).getCurriculo_ID_curriculo() + "";
            MatrizCandidatura[i][2] = listacandidaturas.get(i).getVaga_ID_vaga() + "";

        }

        return MatrizCandidatura;
    }
}
