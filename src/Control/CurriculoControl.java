package Control;

import Model.Curriculo;
import java.sql.*;
import java.util.*;


public class CurriculoControl {
    
    private final Curriculo curriculo;
    
    public CurriculoControl() {
        this.curriculo = new Curriculo();
    }
    
    public boolean CurriculoControl(String Nome, String Curriculo, String CPF, String RG, int Idade) throws SQLException {
        
         int id = curriculo.maiorID_curriculo() + 1;
         Curriculo objeto = new Curriculo(id, Nome, Curriculo, CPF, RG, Idade);
         if(curriculo.InserirCurriculo(objeto)) {
             return true;
         }else{
             return false;
         }
    }
    
    public boolean EditarCurriculo(int id, String Nome, String Curriculo, String CPF, String RG, int Idade) {
        
        Curriculo objeto = new Curriculo(id, Nome, Curriculo, CPF, RG, Idade);
        if(curriculo.AtualizarCurriculo(objeto)){
            return true;
        }else{
            return false;
        }
    }
    
    public Curriculo LoadCurriculo(int id) {
        curriculo.DadosCurriculo(id);
        return null;
    }
    
     
    public ArrayList getListacurriculos() {
        return curriculo.getListacurriculos();
    }
    
    
    @SuppressWarnings("unchecked")
    public String[][] getMatrizCurriculo() {
    
        ArrayList<Curriculo> listacurriculos = curriculo.getListacurriculos();
        int tamanho = listacurriculos.size();
        
        
        String MatrizCurriculo[][] = new String[tamanho][5];
        for (int i = 0; i < tamanho; i++) {
            MatrizCurriculo[i][0] = listacurriculos.get(i).getID_curriculo() + "";
            MatrizCurriculo[i][1] = listacurriculos.get(i).getCurriculo();
            MatrizCurriculo[i][2] = listacurriculos.get(i).getNome();
            MatrizCurriculo[i][3] = listacurriculos.get(i).getCPF();
            MatrizCurriculo[i][4] = listacurriculos.get(i).getRG();
            MatrizCurriculo[i][5] = listacurriculos.get(i).getIdade() + "";
         
            
        }
        
        return MatrizCurriculo;
    }
    
}
    

