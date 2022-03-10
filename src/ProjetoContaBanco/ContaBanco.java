package ProjetoContaBanco;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // Métodos personalizados
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }


    //Getters e Setters
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String n) {
        dono = n;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(double s) {
        saldo = s;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setStatus(boolean s) {
        status = s;
    }

    public boolean getStatus() {
        return status;
    }

    // Metodos

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
            System.out.println("Conta aberta com sucesso!");
        } else if (t == "CP") {
            this.setSaldo(150);
            System.out.println("Conta aberta com sucesso!");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta possui dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta esta em debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(double v) {
        if (this.getStatus()) {
           // Trabalha direto nos atributos: this.saldo += v;
           // atua nos metodos getter e setter: this.setSaldo(this.getSaldo() + v);
           this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta: " + this.getDono());
        } else {
            System.out.println("Não é possível depositar");
        }
    }

    public void sacar(Double v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if ( this.getTipo() == "CP") {
            v = 20;
        }

        if (this.getStatus()) {
            if (saldo > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
            } else {
                System.out.println("impossivel pagar um conta fechada");
            }

        }
    }
    // Metodo construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

}
