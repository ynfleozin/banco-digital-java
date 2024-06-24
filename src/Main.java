public class Main {
    public static void main(String[] args) {
        Cliente leonardo = new Cliente();
        leonardo.setNome("Leonardo");

        Conta cc = new ContaCorrente(leonardo);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(leonardo);

        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
