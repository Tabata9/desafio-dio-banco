public class main {

    public static void main(String[] args) {
        Cliente tabata = new Cliente();
        tabata.setNome("Tabata Rodrigues");

        Conta cc = new ContaCorrente(tabata);
        Conta poupança = new ContaPoupanca(tabata);

        cc.depositar(100);
        cc.sacar(56);
        cc.depositar(250);
        cc.transferir(100, poupança);
        poupança.sacar(30);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
