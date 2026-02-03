package com.example.ClasseDoHeroi.model;

public class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public String atacar() {
        switch (tipo.toLowerCase()) {
            case "mago": return "O mago atacou usando magia";
            case "guerreiro": return "O guerreiro atacou usando espada";
            case "monge": return "O monge atacou usando artes marciais";
            case "ninja": return "O ninja atacou usando shuriken";
            default: return "O herói não sabe atacar";
        }
    }
}
