public class Conta {

    private static int accountCounter = 1;

    // Criação das abstrações 
    private int numeroConta;
    private Cliente cliente;
    private Double saldo = 0.0;

    public Conta(Cliente cliente) {

        this.numeroConta = Conta.accountCounter;
        this.cliente = cliente;
        this.updateSaldo();
        Conta.accountCounter += 1;

    }

    //getters e setters

        public int getNumeroConta() {
            return numeroConta;
        }

        public Cliente getClient() {
            return cliente;
        }

        public void setClient(Cliente cliente) {
            this.cliente = cliente;
        }

        public Double getSaldo() {
            return saldo;
        }

        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }

        private void updateSaldo() {
            this.saldo = this.getSaldo();
        }

    //Receber o To String de Cliente
    public String toString() {

    return "\nBank account: " + this.getNumeroConta() +
            "\nCliente: " + this.cliente.getNome() +
            "\nCPF: " + this.cliente.getCpf() +
            "\nEmail: " + this.cliente.getEmail() +
            "\nEmail: " + this.cliente.getTelefone() +
            "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
            "\n" ;

    }

        // função para depósito

        public void depositar(Double valor) {
            if(valor > 0) {
                setSaldo(getSaldo() + valor);
                //this.saldo = this.getSaldo() + valor;
                System.out.println("Seu depósito foi realizado com sucesso!");
            } else {
                System.out.println("Não foi possível realizar o depósito!");
            }
        }

        //função para sacar
        
        public void sacar(Double valor) {
            if(valor > 0 && this.getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Não foi possível realizar o saque!");
            }
        }

        //função de transferência

        public void transferencia(Conta contaParaDeposito, Double valor) {
            if(valor > 0 && this.getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                //this.saldo = this.getSaldo() - valor;
                contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
                System.out.println("Transferência realizada com sucesso!");
            } else {
                System.out.println("Não foi possível realizar a transferência");
            }

        }

}
