public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        System.out.println(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
