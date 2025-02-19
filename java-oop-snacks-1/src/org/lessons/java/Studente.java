package org.lessons.java;

public class Studente {
    private String nome;
    private String cognome;
    private int età;

    // costruttore
    public Studente(String nome, String cognome, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    public String getStudentData() {
        String result = this.nome + " " + this.cognome + ", " + this.età + " anni";
        return result;
    }
}
