package org.example;

public class ContoBancario {
    private double saldo;

    public ContoBancario(double saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    public void preleva(double importo) throws SaldoInsufficienteException {
        if (importo <= 0) {
            throw new ImportoNonValidoException("L'importo del prelievo deve essere maggiore di zero");
        }
        if (importo > saldo) {
            throw new SaldoInsufficienteException(saldo, importo);
        }
        saldo -= importo;
        System.out.println("Prelievo di " + importo + " euro effettuato con successo. Saldo residuo: " + saldo + " €");
    }
    public double getSaldo() {

        return saldo;
    }
}
