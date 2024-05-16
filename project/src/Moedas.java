public class Moedas {

    // Criação das abstrações 
    private float valor_moeda;
    private String nome_moeda, codigo_moeda;
    public final TipoMoeda tipo;

    //* Construtor de Moedas
    public Moedas(String nome_moeda, String codigo_moeda, float valor_moeda, TipoMoeda tipo) {

        this.nome_moeda = nome_moeda;
        this.codigo_moeda = codigo_moeda;
        this.valor_moeda = valor_moeda;
        this.tipo= tipo;

    }

    // Get e Set

        public float getValor_moeda() {
            return this.valor_moeda;
        }

        public void setValor_moeda(float valor_moeda) {
            this.valor_moeda = valor_moeda;
        }

        public String getCodigo_moeda() {
            return this.codigo_moeda;
        }

        public void setCodigo_moeda(String codigo_moeda) {
            this.codigo_moeda = codigo_moeda;
        }

        public String getNome_moeda() {
            return this.nome_moeda;
        }

        public void setNome_moeda(String nome_moeda) {
            this.nome_moeda = nome_moeda;
        }

        public TipoMoeda getTipo() {
            return this.tipo;
        }

    @Override
    // Receber o To String de Moedas
    public String toString() {
        return "{" +
            " valor_moeda='" + getValor_moeda() + "'" +
            ", nome_moeda='" + getNome_moeda() + "'" +
            ", tipo_moeda='" + getTipo() + "'" +
            "}";
    }

    //* Objeto das moedas

        // Criptomoedas
            static Moedas bitcoin = new Moedas("Bitcoin", "BTC", 338941.68f, TipoMoeda.CRIPTOMOEDA);
            static Moedas ethereum  = new Moedas("Ethereum ", "ETH", 15178.67f, TipoMoeda.CRIPTOMOEDA);
            static Moedas solana  = new Moedas("Solana ", "SOL", 825.20f , TipoMoeda.CRIPTOMOEDA);
            static Moedas urubucoin  = new Moedas("Urubu Coin ", "URC",0.110f , TipoMoeda.CRIPTOMOEDA);

        // Moedas
            static Moedas real = new Moedas("Real", "BRL", 1.00f, TipoMoeda.MOEDA);
            static Moedas euro = new Moedas("Euro", "EUR", 5.58f, TipoMoeda.MOEDA);
            static Moedas dolar = new Moedas("Dólar", "USD", 5.13f, TipoMoeda.MOEDA);
            static Moedas iene = new Moedas("Iene", "JPY", 0.033f, TipoMoeda.MOEDA);

}
