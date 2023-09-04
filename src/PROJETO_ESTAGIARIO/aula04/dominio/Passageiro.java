package PROJETO_ESTAGIARIO.aula04.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa {

    private String numeroCartao;
    private String documento;
    private String registro;
    private String usuario;
    private String senha;

    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNascimento,
            String numeroCartao, String documento, String registro, String usuario, String senha) {
        super(codigo, nome, email, telefone, dataNascimento);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
        this.registro = registro;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Passageiro(){

    }

    
}
