public class Corretora {

    private static int accountCounter = 1;

    // Criação das abstrações 
    private int numeroConta;
    private Cliente cliente;

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
        Moedas real = new Moedas("Real", "BRL", 1.00f, TipoMoeda.LASTREAVEL);
        Moedas euro = new Moedas("Euro", "EUR", 5.58f, TipoMoeda.LASTREAVEL);
        Moedas dolar = new Moedas("Dólar", "USD", 5.13f, TipoMoeda.LASTREAVEL);
        Moedas iene = new Moedas("Iene", "JPY", 0.033f, TipoMoeda.LASTREAVEL);

}
