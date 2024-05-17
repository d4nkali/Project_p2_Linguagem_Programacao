import java.util.Scanner;

// TODO: Implementar as duas carteiras

public class Corretora implements Acoes{

    Scanner sc1 = new Scanner(System.in);

    private static int accountCounter = 1;

    // Criação das abstrações 
    private int numeroConta, opcao_moeda_depos;
    private Cliente cliente;
    private float quant_deposito = 0;

    //* Construtor da Conta
    public Corretora(Cliente cliente){

        this.numeroConta = Corretora.accountCounter;
        this.cliente = cliente;
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

    // Receber o To String de Cliente
    public String toString() {

        return "\nBank account: " + this.getNumeroConta() +
            "\nCliente: " + this.cliente.getNome() +
            "\nCPF: " + this.cliente.getCpf() +
            "\nEmail: " + this.cliente.getEmail() +
            "\nSenha: " + this.cliente.getSenha() +
            "\n" ;

    }

        //* Objeto das moedas

        // Criptomoedas
        Moedas bitcoin = new Moedas("Bitcoin", "BTC", 338941.68f, TipoMoeda.CRIPTOMOEDA);
        Moedas ethereum  = new Moedas("Ethereum ", "ETH", 15178.67f, TipoMoeda.CRIPTOMOEDA);
        Moedas solana  = new Moedas("Solana ", "SOL", 825.20f , TipoMoeda.CRIPTOMOEDA);
        Moedas urubucoin  = new Moedas("Urubu Coin ", "URC",0.110f , TipoMoeda.CRIPTOMOEDA);

    // Moedas
        Moedas real = new Moedas("Real", "BRL", 1.00f, TipoMoeda.MOEDA);
        Moedas euro = new Moedas("Euro", "EUR", 5.58f, TipoMoeda.MOEDA);
        Moedas dolar = new Moedas("Dólar", "USD", 5.13f, TipoMoeda.MOEDA);
        Moedas iene = new Moedas("Iene", "JPY", 0.033f, TipoMoeda.MOEDA);


    @Override

    public void extrato() {}

    public void depositar() {

        System.out.println("Digite qual moeda/criptomoeda vai ser depositada: ");

        switch (opcao_moeda_depos) {

            case 1:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc1.nextFloat();
                break;
        
            default:

                System.out.println("Opção Invalida!");
                break;

        }

    }

    public void sacar() {}

    public void transferir() {}

}
