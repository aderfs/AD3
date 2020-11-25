package Control;

import Model.Vaga;
import java.util.*;
import java.sql.*;

public class VagaControl {
   
   private final Vaga vaga; 
   //atributo para facilitar mudancas no nome do model
   
   public VagaControl() {
       this.vaga = new Vaga();
       //contrutor que facilita mudancas na camada model sem afetar tanto o control
   }
   
   //create
   public boolean CastrarVaga(String Descricaovaga, String Prerequisito, String Especificacoes, String Contato)throws SQLException {
      
      int id = 0; //BD possui auto increment
      Vaga objeto = new Vaga(id, Descricaovaga, Prerequisito, Especificacoes, Contato);
      
      if(vaga.InserirVagas(objeto)){
         return true;
      }else{
         return false;
      }
   }
   
   //Update
   public boolean EditarVaga(int id, String Descricaovaga, String Prerequisito, String Especificacoes, String Contato) {
      Vaga objeto = new Vaga(id, Descricaovaga, Prerequisito, Especificacoes, Contato);
      if(vaga.AtualizarVagas(id, objeto)){
        return true;
      }else{
        return false;
      }
   }
   
   //Delete
   public boolean ApagarVaga(int id){
      if(vaga.DeletarVagas(id)){
        return true;
      }else{
        return false;
      }
    }
    
   //Read
   public ArrayList getListaVagas() {
       return vaga.getListavagas();
   }
   
   
   
   
}
