package Control;

import Model.Aluno;
import java.util.ArrayList;

public class AlunoControl {
    
    private final Aluno control;
    
    public AlunoControl() {
        this.control = new Aluno();
    }
    
    public boolean Cadastrar(String curso, int fase, String nome, int idade) {
        
        int id = control.maiorID() + 1;
        
        Aluno objeto = new Aluno(curso, fase, id, nome, idade);
        
        if(control.InsertAlunoBD(objeto)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Editar(String curso, int fase, int id, String nome, int idade) {
        
        Aluno objeto = new Aluno(curso, fase, id, nome, idade);
        
        if(control.UpdateAlunoBD(id, objeto)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Apagar(int id) {
        
        if(control.DeleteAlunoBD(id)){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList getMinhaLista() {
        return control.getMinhaLista();
    }
    
}
