import java.util.Scanner;

public class Corretora implements Acoes{

    Scanner sc1 = new Scanner(System.in);

    private static int accountCounter = 1;

    // Criação das abstrações 
    private int numeroConta, opcao_moeda_depos;
    private Cliente cliente;
    private float saldo = 0;

    //* Construtor da Conta
    public Corretora(Cliente cliente){

        this.numeroConta = Corretora.accountCounter;
        this.cliente = cliente;
        this.updateSaldo();
        Corretora.accountCounter += 1;

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

        System.out.println("Digite qual moeda/criptomoeda vai ser depositada: ");

        switch (opcao_moeda_depos) {

            case 1:

                System.out.print("Digite a quantia a ser depositada: ");
                sc1.nextFloat();
                break;
        
            default:

                System.out.println("Opção Invalida!");
                break;

        }

    }

    public void sacar() {}

    public void transferir() {}

}
