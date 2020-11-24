package Control;

import Model.Vaga;
import java.util.*;
import java.sql.*;

public class VagaControl {
   
   private final Vaga control;
   
   public VagaControl() {
       this.control = new Vaga();
   }
   
   //create
   public boolean CastrarVaga(String Descricaovaga, String Prerequisito, String Especificacoes, String Contato) {
      
      int ID_vaga = control.maiorID_Vaga() + 1;
      Vaga objeto = new Vaga(ID_vaga, DescricaoVaga, Prerequisito, Especificacoes, Contato);
      
      if(control.InserirVagas(objeto)){
         return true;
      }else{
         return false;
      }
   }
   
   //Update
   public boolean EditarVaga(int ID_vaga, String Descricaovaga, String Prerequisito, String Especificacoes, String Contato) {
      Vaga objeto = new Vaga(ID_vaga, DescricaoVaga, Prerequisito, Especificacoes, Contato);
      if(control.AtualizarVagas(ID_vaga, objeto){
        return true;
      }else{
        return false;
      }
   }
   
   //Delete
   public boolean ApagarVaga(ind ID_vaga){
      if(control.DeletarVagas(ID_vaga){
        return true;
      }else{
        return false;
      }
    }
    
   //Read
   public ArrayList getListaVagas()
      return control.getListaVagas();
   }
   
   
   
   
}