package Control;

import Model.Vaga;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class VagaControl {

    private final Vaga vaga;
    //atributo para facilitar mudancas no nome do model

    public VagaControl() {
        this.vaga = new Vaga(); //instancia a classe model Vaga
    }

    //create
    public boolean CastrarVaga(String Descricaovaga, String Prerequisito, String Especificacoes, String Contato) throws SQLException {

        int id = 0; //BD possui auto increment
        Vaga objeto = new Vaga(id, Descricaovaga, Prerequisito, Especificacoes, Contato);

        if (vaga.InserirVagas(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    //Update
    public boolean EditarVaga(int id, String Descricaovaga, String Prerequisito, String Especificacoes, String Contato) {
        Vaga objeto = new Vaga(id, Descricaovaga, Prerequisito, Especificacoes, Contato);
        if (vaga.AtualizarVagas(id, objeto)) {
            return true;
        } else {
            return false;
        }
    }

    //Delete
    public boolean ApagarVaga(int id) {
        if (vaga.DeletarVagas(id)) {
            return true;
        } else {
            return false;
        }
    }

    //Read
    public ArrayList getListaVagas() {
        return vaga.getListavagas();
    }

    @SuppressWarnings("unchecked")
    public String[][] getMatrizVaga() { //carrega uma matriz com todas as vagas organizadas

        ArrayList<Vaga> listavaga = vaga.getListavagas();
        int tamanho = listavaga.size();

        String MatrizVaga[][] = new String[tamanho][5];
        for (int i = 0; i < tamanho; i++) { //traduz a matriz para uma lista valida na view
            MatrizVaga[i][0] = listavaga.get(i).getID_vaga() + "";
            MatrizVaga[i][1] = listavaga.get(i).getDescricaovaga();
            MatrizVaga[i][2] = listavaga.get(i).getPrerequisito();
            MatrizVaga[i][3] = listavaga.get(i).getEspecificacoes();
            MatrizVaga[i][4] = listavaga.get(i).getContato();

        }

        return MatrizVaga;
    }

}
