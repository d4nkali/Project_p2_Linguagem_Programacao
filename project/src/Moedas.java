public class Moedas {

    // Criação das abstrações 
    private float valor_moeda;
    private String nome_moeda;
    public final TipoMoeda tipo;

    //* Construtor de Moedas
    public Moedas(String nome_moeda, float valor_moeda, TipoMoeda tipo) {

        this.nome_moeda = nome_moeda;
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

        Moedas btc = new Moedas("Bitcoin", 332941, TipoMoeda.CRIPTOMOEDA);

}
