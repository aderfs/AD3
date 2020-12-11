package Control;

import Model.Curriculo;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class CurriculoControl {

    private final Curriculo curriculo;
    //atributo para facilitar mudancas no nome do model

    public CurriculoControl() {
        this.curriculo = new Curriculo(); //instancia a classe model Curriculo
    }

    //create
    public boolean CadastrarCurriculo(String Nome, String Curriculo, String CPF, String RG, int Idade) throws SQLException {

        int id = 0; //BD possui auto increment
        Curriculo objeto = new Curriculo(id, Nome, Curriculo, CPF, RG, Idade);
        if (curriculo.InserirCurriculo(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    //update
    public boolean EditarCurriculo(int id, String Nome, String Curriculo, String CPF, String RG, int Idade) {

        Curriculo objeto = new Curriculo(id, Nome, Curriculo, CPF, RG, Idade);
        if (curriculo.AtualizarCurriculo(objeto)) {
            return true;
        } else {
            return false;
        }
    }

    //delete
    public boolean DeletarCurriculo(int id) {

        if (curriculo.DeletarCurriculo(id)) {
            return true;
        } else {
            return false;
        }

    }

    //read
    public ArrayList getListacurriculos() { //lista dos curriculos
        return curriculo.getListacurriculos();
    }

    @SuppressWarnings("unchecked")
    public String[][] getMatrizCurriculo() { //matriz organizada dos curriculos

        ArrayList<Curriculo> listacurriculos = curriculo.getListacurriculos();
        int tamanho = listacurriculos.size();

        String MatrizCurriculo[][] = new String[tamanho][6];
        for (int i = 0; i < tamanho; i++) { //traduz a matriz para uma lista valida na VIEW
            MatrizCurriculo[i][0] = listacurriculos.get(i).getID_curriculo() + "";
            MatrizCurriculo[i][1] = listacurriculos.get(i).getNome();
            MatrizCurriculo[i][2] = listacurriculos.get(i).getCurriculo();
            MatrizCurriculo[i][3] = listacurriculos.get(i).getCPF();
            MatrizCurriculo[i][4] = listacurriculos.get(i).getRG();
            MatrizCurriculo[i][5] = listacurriculos.get(i).getIdade() + "";

        }

        return MatrizCurriculo;
    }

}
