package Model;


public abstract class Usuario {
    
    private String nome;
    

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
    public boolean cadastro() {
        return true;
    }

    public boolean gerenciar(){
        return true;
    }
}
