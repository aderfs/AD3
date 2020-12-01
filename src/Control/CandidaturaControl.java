package Control;

import Model.Candidatura;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class CandidaturaControl {

    private final Candidatura candidatura;

    public CandidaturaControl() {
        this.candidatura = new Candidatura();
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

    //Load
    public Candidatura LoadCandidatura(int id) {
        candidatura.dadosCandidatura(id);
        return null;
    }

    //Read
    public ArrayList getListacandidaturas() {
        return candidatura.getListacandidaturas();
    }

    @SuppressWarnings("unchecked")
    public String[][] getMatrizCandidatura() {

        ArrayList<Candidatura> listacandidaturas = candidatura.getListacandidaturas();
        int tamanho = listacandidaturas.size();

        String MatrizCandidatura[][] = new String[tamanho][3];
        for (int i = 0; i < tamanho; i++) {

            MatrizCandidatura[i][0] = listacandidaturas.get(i).getID_candidatura() + "";
//            JOptionPane.showMessageDialog(null, MatrizCandidatura[i][0]);
            MatrizCandidatura[i][1] = listacandidaturas.get(i).getCurriculo_ID_curriculo() + "";
//            JOptionPane.showMessageDialog(null, MatrizCandidatura[i][1]);
            MatrizCandidatura[i][2] = listacandidaturas.get(i).getVaga_ID_vaga() + "";
//            JOptionPane.showMessageDialog(null, MatrizCandidatura[i][2]);

        }

        return MatrizCandidatura;
    }
}
