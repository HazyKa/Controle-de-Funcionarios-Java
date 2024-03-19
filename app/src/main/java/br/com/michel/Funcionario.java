package br.com.michel;

public class Funcionario {
    private String nome;
    private String idade;
    private String cpf;
    private String sexo;
    private String cep;


    public Funcionario(String nome2, String idade2, String cpf2, String sexo2, String cep2) {
        this.nome = nome2;
        this.idade = idade2;
        this.cpf = cpf2;
        this.sexo = sexo2;
        this.cep = cep2;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    

}

