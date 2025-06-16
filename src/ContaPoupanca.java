public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        System.out.println(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor * 0.99);
        System.out.println("Foi cobrado uma taxa de 1% para colocar seu dinheiro na poupanca");

    }
}
