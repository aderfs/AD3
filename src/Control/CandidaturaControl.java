package Control;

import Model.Candidatura;
import java.sql.*;
import java.util.*;


public class CandidaturaControl {
    
    private Candidatura candidatura;

    public CandidaturaControl(Candidatura candidatura) {
        this.candidatura = new Candidatura();
    }
    
    public boolean CadastrarCandidatura(int curriculo, int vaga) throws SQLException {
        
        int id = candidatura.maiorID_candidatura() + 1; 
        Candidatura objeto = new Candidatura(id, curriculo, vaga);
        if(candidatura.InserirCandidatura(objeto)){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean EditarCandidatura(int id, int curriculo, int vaga) {
        Candidatura objeto = new Candidatura(id, curriculo, vaga);
        if(candidatura.AtualizarCandidatura(objeto)){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean ApagarCandidatura(int id) {
        if(candidatura.DeletarCandidatura(id)){
            return true;
        }else{
            return false;
        }
    }
    
    
    public Candidatura LoadCandidatura(int id) {
        candidatura.DadosCandidatura(id);
        return null;
    }
    
     
    public ArrayList getListacandidaturas() {
        return candidatura.getListacandidaturas();
    }
    
    
    @SuppressWarnings("unchecked")
    public String[][] getMatrizCandidatura() {
    
        ArrayList<Candidatura> listacandidaturas = candidatura.getListacandidaturas();
        int tamanho = listacandidaturas.size();
        
        
        String MatrizCandidatura[][] = new String[tamanho][5];
        for (int i = 0; i < tamanho; i++) {
            MatrizCandidatura[i][0] = listacandidaturas.get(i).getID_candidatura() + "";
            MatrizCandidatura[i][1] = listacandidaturas.get(i).getcurriculo() + "";
            MatrizCandidatura[i][2] = listacandidaturas.get(i).getvaga() + "";
         
            
        }
        
        return MatrizCandidatura;
    }   
}

    
    
    

