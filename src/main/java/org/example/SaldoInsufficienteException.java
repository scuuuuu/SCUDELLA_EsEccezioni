package org.example;

public class SaldoInsufficienteException extends Exception {
    private double saldoAttuale;
    private double importoRichiesto;

    public SaldoInsufficienteException(double saldoAttuale, double importoRichiesto) {
        super("Tentativo di prelievo superiore al saldo disponibile");
        this.saldoAttuale = saldoAttuale;
        this.importoRichiesto = importoRichiesto;
    }

    public double getDeficit() {
        return importoRichiesto - saldoAttuale;
    }

    public double getSaldoAttuale() {

        return saldoAttuale;
    }

    public double getImportoRichiesto() {

        return importoRichiesto;
    }
}