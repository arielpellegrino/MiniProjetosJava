package ProjetoContaBanco;

public class MetodoMainBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        //Deposito
        p1.depositar(100);
        p2.depositar(500);

        //Saque

        p2.sacar(200.0);

        p1.estadoAtual();
        System.out.println("-------------------------------");
        p2.estadoAtual();

    }

}

