package com.eng;

public class Crianca extends RegistroCrianca {
    private String nome;
    private String id;
    private RegistroCrianca registroCrianca;

    public Crianca(String nome, String id,String doenca, String medicacoes) {
        super(doenca, medicacoes);
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}