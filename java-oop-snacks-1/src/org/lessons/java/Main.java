package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        
        // creazione oggetto studente
        Studente studente1 = new Studente("Laura", "Bianchi", 20);

        System.out.println(studente1.getStudentData());

        // creazione oggetto conto bancario
        ContoBancario conto1 = new ContoBancario(40235684);

        System.out.println(conto1.getNumeroConto());
        System.out.println(conto1.getSaldo());
        System.out.println(conto1.gestisciConto());
    }
}
