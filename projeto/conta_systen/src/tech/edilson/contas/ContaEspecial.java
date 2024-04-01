package tech.edilson.contas;

public class ContaEspecial extends Conta{
    private double limete;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limete = limite;
    }

    public boolean sacar (double valor) {
        if (getSaldo() >= valor) {
            double novoSaldo = getSaldo() - (valor * 0.99);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

}
