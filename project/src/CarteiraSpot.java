import java.util.Scanner;

public class CarteiraSpot extends Carteiras implements AcoesSpot {

    protected float usd_quant = 0, brl_quant = 0, eur_quant = 0;
    private int opcao_moeda_depos;
    private float quant_deposito = 0;

    // Get e Set

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
        super(0.0f, 0.0f, 0.0f, 0.0f);
        this.brl_quant = brl_quant;
        this.usd_quant = usd_quant;
        this.eur_quant = eur_quant;
    }

    @Override
    public void extrato() {}

    public void depositar(Scanner sc) {
        System.out.println("Digite qual moeda/criptomoeda vai ser depositada: ");
        opcao_moeda_depos = sc.nextInt();

        switch (opcao_moeda_depos) {

            case 1:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                brl_quant += quant_deposito;
                break;

            default:

                System.out.println("Opção Invalida!");
                break;

        }

    }

    public void sacar() {}

    public void transferir() {}

}
