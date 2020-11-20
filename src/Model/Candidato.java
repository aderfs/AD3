package Model;


public class Candidato extends Usuario {
    
    private int IDcandidato;
    private String CPF;
    private String RG;
    private int idade;

    public Candidato() {
    }

    public Candidato(int IDcandidato, String CPF, String RG, int idade) {
        this.IDcandidato = IDcandidato;
        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
    }

    public Candidato(int IDcandidato, String CPF, String RG, int idade, String nome) {
        super(nome);
        this.IDcandidato = IDcandidato;
        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
    }

    public int getIDcandidato() {
        return IDcandidato;
    }

    public void setIDcandidato(int IDcandidato) {
        this.IDcandidato = IDcandidato;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean login() {
        return super.login(); 
    }

    @Override
    public boolean cadastro() {
        return super.cadastro(); 
    }
    
    
    
    
    
    
    
    
    
    
    
}
