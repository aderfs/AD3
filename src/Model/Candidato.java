package Model;


public class Candidato extends Usuario {
    
    private int ID_candidato;
    private String CPF;
    private String RG;
    private int idade;
    private String Curriculo; //arrumar todo a classe curriculo nesse coiso

    public Candidato() {
    }

    public Candidato(int ID_candidato, String CPF, String RG, int idade) {
        this.ID_candidato = ID_candidato;
        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
    }

    public Candidato(int ID_candidato, String CPF, String RG, int idade, String nome) {
        super(nome);
        this.ID_candidato = ID_candidato;
        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
    }

    public int getID_candidato() {
        return ID_candidato;
    }

    public void setID_candidato(int ID_candidato) {
        this.ID_candidato = ID_candidato;
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
    public boolean cadastro() {
        return super.cadastro(); 
    }
    
    @Override
    public boolean gerenciar(){
        return super.gerenciar();
    }
    
    
}
