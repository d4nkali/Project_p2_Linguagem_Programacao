public class CarteiraSpot extends Carteiras {

    protected float usd_quant = 0, brl_quant = 0, eur_quant = 0;


    public float getUsd_quant() {
        return this.usd_quant;
    }

    public void setUsd_quant(float usd_quant) {
        this.usd_quant = usd_quant;
    }

    public float getBrl_quant() {
        return this.brl_quant;
    }

    public void setBrl_quant(float brl_quant) {
        this.brl_quant = brl_quant;
    }

    public float getEur_quant() {
        return this.eur_quant;
    }

    public void setEur_quant(float eur_quant) {
        this.eur_quant = eur_quant;
    }

    public CarteiraSpot(float brl_quant, float usd_quant, float eur_quant) {

        // Chama o construtor da classe pai com valores padrão
        super(0.0f, 0.0f, 0.0f, 0.0f);
        this.brl_quant = brl_quant;
        this.usd_quant = usd_quant;
        this.eur_quant = eur_quant;

    }

}
