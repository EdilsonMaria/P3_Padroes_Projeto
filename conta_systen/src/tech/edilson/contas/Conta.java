package tech.edilson.contas;

public class Conta {
    private int numero;
    private double saldo;

    public  Conta () {
        System.out.println("Conta vazia criada!");
    }

    public Conta (int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public boolean sacar (double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposita (double valor) {
        if (this.saldo >= 0 ) {
            this.saldo = this.saldo + valor;
            return true;
        } else {
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
