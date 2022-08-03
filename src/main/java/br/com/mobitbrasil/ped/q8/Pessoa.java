package br.com.mobitbrasil.ped.q8;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String email;
    private String telefone;

    public Integer getIdade() {
        return idade;
    }

    public Pessoa(String nome, Integer idade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public Pessoa(Integer idade) {
        this.idade = idade;
        this.nome = "Testes";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa [email=" + email + ", idade=" + idade + ", nome=" + nome + ", telefone=" + telefone + "]";
    }
}
