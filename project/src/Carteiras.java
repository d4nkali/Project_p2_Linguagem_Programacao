public class Carteiras {

    // Criação das abstrações
    protected float btc_quant = 0, eth_quant = 0, sol_quant = 0, urc_quant = 0;

    //* Construtor pai de Carteiras
    public Carteiras(Float btc_quant, Float eth_quant, Float sol_quant, Float urc_quant) {

        this.btc_quant = btc_quant;
        this.eth_quant = eth_quant;
        this.sol_quant = sol_quant;
        this.urc_quant = urc_quant;

    }

}
