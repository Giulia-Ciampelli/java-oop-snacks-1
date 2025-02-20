// Snack 2: Gestione di un Conto
// Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.

package org.lessons.java;

import java.util.Scanner;

public class ContoBancario {
    private int numeroConto;
    private float saldo;

    Scanner input = new Scanner(System.in);

    public ContoBancario(int numeroConto) {   
        this.numeroConto = numeroConto;
        this.saldo = 0.0f;
    }

    public String getNumeroConto() {
        return "Il tuo numero conto: " + numeroConto;
    }

    public String getSaldo() {
        return "Il tuo saldo : " + saldo;
    }

    public String depositaConto() {
        System.out.println("Inserisci l'importo da depositare (0,0): ");
        float deposito = input.nextFloat();
        float saldoCorrente = this.saldo + deposito;
        return "Saldo corrente: " + saldoCorrente;
    }

    public String prelevaConto() {
        System.out.println("Inserisci l'importo da prelevare (0,0): ");
        float deposito = input.nextFloat();
        float saldoCorrente = this.saldo - deposito;
        return "Saldo corrente: " + saldoCorrente;
    }

    // problema: facendo così non si tiene conto del saldo corrente, e le due operazioni sono scollegate
    // esiste un modo per salvare il saldo corrente?

}
