package org.lessons.java;

public class RegistroStudenti {
    private Studente studenti[] = new Studente[0]; // creazione di un array collegato all'oggetto studente

    public void registraStudente(Studente studente) {
        
        // si può fare anche senza fill o copy, con questo metodo
        Studente[] studentiAggiornati = new Studente[this.studenti.length + 1];

        for(int i = 0; i < this.studenti.length; i++) {
            studentiAggiornati[i] = this.studenti[i];
        }
        studentiAggiornati[studentiAggiornati.length - 1] = studente;
        this.studenti = studentiAggiornati;
    }

    public void printRegistro() {
        for (int i = 0; i < this.studenti.length; i++){
            System.out.println(this.studenti[i].getStudentData()); // non prende il loop, probabilmente perchè devo prima trovare un modo di riempirlo (fill?)
        }
    }
}
