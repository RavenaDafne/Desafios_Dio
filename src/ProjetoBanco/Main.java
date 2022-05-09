package ProjetoBanco;

public class Main {
    public static void main(String[] args) {
        Cliente ravena = new Cliente();
        ravena.setNome("Ravena Dafne");

        Conta cc = new ContaCorrente(ravena);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(ravena);
        cc.transferir(cp, 100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
