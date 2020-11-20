package Model;


public class Empresa extends Usuario {
    
    private int IDempresa;
    private String CNPJ;
    private String CEP;
    private String endereco;

    public Empresa() {
    }
    
  
    public Empresa(int IDempresa, String CNPJ, String CEP, String endereco) {
        this.IDempresa = IDempresa;
        this.CNPJ = CNPJ;
        this.CEP = CEP;
        this.endereco = endereco;
    }

    public Empresa(int IDempresa, String CNPJ, String CEP, String endereco, String nome) {
        super(nome);
        this.IDempresa = IDempresa;
        this.CNPJ = CNPJ;
        this.CEP = CEP;
        this.endereco = endereco;
    }

    public int getIDempresa() {
        return IDempresa;
    }

    public void setIDempresa(int IDempresa) {
        this.IDempresa = IDempresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
