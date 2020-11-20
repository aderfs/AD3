package Model;


public class Vaga extends Empresa {
    
    private int ID_Vaga;
    private String descricaovaga;
    private String prerequisito;
    private String especificacoes;
    private String contato;

    public Vaga() {
    }

    public Vaga(int ID_Vaga, String descricaovaga, String prerequisito, String especificacoes, String contato) {
        this.ID_Vaga = ID_Vaga;
        this.descricaovaga = descricaovaga;
        this.prerequisito = prerequisito;
        this.especificacoes = especificacoes;
        this.contato = contato;
    }

    public Vaga(int ID_Vaga,String descricaovaga, String prerequisito, String especificacoes, String contato, int IDempresa, String CNPJ, String CEP, String endereco, String nome) {
        super(IDempresa, CNPJ, CEP, endereco, nome);
        this.ID_Vaga = ID_Vaga;
        this.descricaovaga = descricaovaga;
        this.prerequisito = prerequisito;
        this.especificacoes = especificacoes;
        this.contato = contato;
    }
    
    public String getID_Vaga() {
        return ID_Vaga;
    }
    
    public void ID_Vaga(int ID_Vaga) {
        this.ID_Vaga = ID_Vaga;
    }

    public String getDescricaovaga() {
        return descricaovaga;
    }

    public void setDescricaovaga(String descricaovaga) {
        this.descricaovaga = descricaovaga;
    }

    public String getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(String prerequisito) {
        this.prerequisito = prerequisito;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public boolean Cadastro_Vaga() {
        return true; //adicionar o codigo o cadastro de uma vaga
    }
    
    public boolean Gerenciar_Vaga() {
        return true; //adicionar o codigo o gerenciamento de uma vaga
    }
    
    
    
    
}
