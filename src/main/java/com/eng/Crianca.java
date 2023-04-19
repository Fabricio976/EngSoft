package com.eng;

import java.time.LocalDate;


public class Crianca extends RegistroCrianca {
    private String nome;
    private String id;
    private String dataNascimento;

    public Crianca(String nome, String id,String dataNascimento, String doenca, String medicacoes) {
        super(doenca, medicacoes);
        this.nome = nome;
        this.id = id;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    public String getId() {
        return id;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }
}
