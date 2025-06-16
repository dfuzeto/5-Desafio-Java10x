//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ContaCorrente contaNaruto = new ContaCorrente(0, TipoConta.CORRENTE);
        ContaPoupanca contaSasuke = new ContaPoupanca(20, TipoConta.POUPANCA);
        //
        contaNaruto.consultarSaldo();
        contaNaruto.depositar(390);
        contaNaruto.consultarSaldo();
        //
        contaSasuke.consultarSaldo();
        contaSasuke.depositar(200);
        contaSasuke.consultarSaldo();

    }

}