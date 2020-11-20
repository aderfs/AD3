package Model;


public class Curriculo extends Candidato {
    
    private String info;  // nome, fone etc...
    private String experiencia;
    private String formacao;
    private String habilidades;

    public Curriculo() {
    }

    public Curriculo(String info, String experiencia, String formacao, String habilidades) {
        this.info = info;
        this.experiencia = experiencia;
        this.formacao = formacao;
        this.habilidades = habilidades;
    }

    public Curriculo(String info, String experiencia, String formacao, String habilidades, int IDcandidato, String CPF, String RG, int idade, String nome) {
        super(IDcandidato, CPF, RG, idade, nome);
        this.info = info;
        this.experiencia = experiencia;
        this.formacao = formacao;
        this.habilidades = habilidades;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
    
    
    
}
