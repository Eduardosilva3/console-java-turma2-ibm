package com.br.eduardo.console;

public class aluno {
    
    private String nome;
    private double nota;
    private String Situacao;

    public aluno (String nome, double nota, String Situacao){
        this.nome = nome;
        this.nota = nota;
        this.Situacao = Situacao;
    }
    
    
    
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setSituacao(String situacao) {
        Situacao = situacao;
    }
}
