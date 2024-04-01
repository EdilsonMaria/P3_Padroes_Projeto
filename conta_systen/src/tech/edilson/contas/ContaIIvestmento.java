package tech.edilson.contas;

public class ContaIIvestmento extends Conta{
    private double taxa;
    private int prazo;

    public ContaIIvestmento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }
    public boolean sacar(double valor) {
        if (getSaldo() >= 0) {
            double novoSaldo = getSaldo() - (valor * this.taxa);
            setSaldo(novoSaldo);
            return  true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (getSaldo() >= 0) {
            double novoSaldo = getSaldo() + (valor * this.taxa);
            setSaldo(novoSaldo);
            return  true;
        } else {
            return false;
        }
    }

    void aplicarRendimento (double taxa) {
        double novoSaldo = getSaldo() + (1 * taxa);
        setSaldo(novoSaldo);
    }

}
