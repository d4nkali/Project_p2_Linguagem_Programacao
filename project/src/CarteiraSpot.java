import java.util.Scanner;

//TODO: Terminar de adicionar todas as moedas na função deposito
//TODO: Fazer extrato @JANzxz @Olausz
//TODO: Fazer saque @JoaoMagalhaes-hub @Olausz
//TODO: Fazer transferencia @d4nkali @JANzxz

public class CarteiraSpot extends Carteiras implements AcoesSpot {

    // Criação das abstrações
    protected float usd_quant = 0, brl_quant = 0, eur_quant = 0;

    // Variáveis de opção
    private int opcao_moeda_depos;

    // Variáveis temporárias
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

    //* Construtor filho "CarteiraSpot"
    public CarteiraSpot(float brl_quant, float usd_quant, float eur_quant) {

        super(0.0f, 0.0f, 0.0f, 0.0f);
        this.brl_quant = brl_quant;
        this.usd_quant = usd_quant;
        this.eur_quant = eur_quant;

    }

    @Override
    public void extrato() {}

    public void depositar(Scanner sc) { //* Criando função para depositar as moedas

        System.out.println("Digite o simbolo da moeda/criptomoeda que vai ser depositada.");
        System.out.println("[1] BRL | [2] USD | [3] EUR | [4] JPY | [5] BTC | [6] ETH | [7] SOL | [8] URC: ");
        opcao_moeda_depos = sc.nextInt();

        switch (opcao_moeda_depos) {

            case 1:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    brl_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui BRL R$" + brl_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                break;

            default:

                System.out.println("Opção Invalida!");
                break;

        }

    }

    public void sacar() {}

    public void transferir() {}

}
