public class Conta implements Corretora{

    private static int accountCounter = 1;

    // Criação das abstrações 
    private int numeroConta;
    private Cliente cliente;
    private float saldo = 0, quant_deposito = 0;

    //* Construtor da Conta
    public Conta(Cliente cliente) {

        this.numeroConta = Conta.accountCounter;
        this.cliente = cliente;
        this.updateSaldo();
        Conta.accountCounter += 1;

    }

    // Getters e Setters

        public int getNumeroConta() {
            return numeroConta;
        }

        public Cliente getClient() {
            return cliente;
        }

        public void setClient(Cliente cliente) {
            this.cliente = cliente;
        }

        public float getSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        private void updateSaldo() {
            this.saldo = this.getSaldo();
        }

    // Receber o To String de Cliente
    public String toString() {

        return "\nBank account: " + this.getNumeroConta() +
            "\nCliente: " + this.cliente.getNome() +
            "\nCPF: " + this.cliente.getCpf() +
            "\nEmail: " + this.cliente.getEmail() +
            "\nSenha: " + this.cliente.getSenha() +
            "\nSaldo: " + Utils.floatToString(this.getSaldo()) +
            "\n" ;

    }

    @Override

    public void extrato() {}

    public void depositar() {

        System.out.println("Digite qual moeda/criptomoeda vai ser depositada:");

        System.out.print("Digite a quantia a ser depositada: ");

    }

    public void sacar() {}

    public void transferir() {}

}
