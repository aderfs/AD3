package Model;


public class Vaga extends Empresa {
    
    private String descricaovaga;
    private String prerequisito;
    private String especificacoes;
    private String contato;

    public Vaga() {
    }

    public Vaga(String descricaovaga, String prerequisito, String especificacoes, String contato) {
        this.descricaovaga = descricaovaga;
        this.prerequisito = prerequisito;
        this.especificacoes = especificacoes;
        this.contato = contato;
    }

    public Vaga(String descricaovaga, String prerequisito, String especificacoes, String contato, int IDempresa, String CNPJ, String CEP, String endereco, String nome) {
        super(IDempresa, CNPJ, CEP, endereco, nome);
        this.descricaovaga = descricaovaga;
        this.prerequisito = prerequisito;
        this.especificacoes = especificacoes;
        this.contato = contato;
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
    
    
    
    
    
    
}
