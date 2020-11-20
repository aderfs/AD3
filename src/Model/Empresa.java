package Model;


public class Empresa extends Usuario {
    
    private int ID_empresa;
    private String CNPJ;
    private String CEP;
    private String endereco;

    public Empresa() {
    }
    
  
    public Empresa(int ID_empresa, String CNPJ, String CEP, String endereco) {
        this.ID_empresa = ID_empresa;
        this.CNPJ = CNPJ;
        this.CEP = CEP;
        this.endereco = endereco;
    }

    public Empresa(int ID_empresa, String CNPJ, String CEP, String endereco, String nome) {
        super(nome);
        this.ID_empresa = ID_empresa;
        this.CNPJ = CNPJ;
        this.CEP = CEP;
        this.endereco = endereco;
    }

    public int get_IDempresa() {
        return ID_empresa;
    }

    public void setID_empresa(int ID_empresa) {
        this.ID_empresa = ID_empresa;
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
    public boolean cadastro() {
        return super.cadastro(); 
    }
    
    @Override
    public boolean gerenciar() {
        return super.gerenciar();
    }
    
    
    
}
