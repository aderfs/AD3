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
    
     
    public ArrayList getListacandidaturas() {
        return curriculo.getListacurriculos();
    }
    
    
    @SuppressWarnings("unchecked")
    public String[][] getMatrizCandidatura() {
    
        ArrayList<Curriculo> listacurriculos = curriculo.getListacurriculos();
        int tamanho = listacurriculos.size();
        
        
        String MatrizCandidatura[][] = new String[tamanho][5];
        for (int i = 0; i < tamanho; i++) {
            MatrizCandidatura[i][0] = listacurriculos.get(i).getID_curriculo() + "";
            MatrizCandidatura[i][1] = listacurriculos.get(i).getCurriculo();
            MatrizCandidatura[i][2] = listacurriculos.get(i).getNome();
            MatrizCandidatura[i][3] = listacurriculos.get(i).getCPF();
            MatrizCandidatura[i][4] = listacurriculos.get(i).getRG();
            MatrizCandidatura[i][5] = listacurriculos.get(i).getIdade() + "";
         
            
        }
        
        return MatrizCandidatura;
    }
    
}
    

