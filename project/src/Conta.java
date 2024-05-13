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
            "\nSenha: " + this.cliente.getSenha() +
            "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
            "\n" ;

    }

}
