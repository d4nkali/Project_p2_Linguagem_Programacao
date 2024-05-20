import java.util.Scanner;

//TODO: Terminar de adicionar todas as moedas na função deposito
//TODO: Fazer saque @JoaoMagalhaes-hub @Olausz
//TODO: Fazer transferencia @d4nkali @JANzxz

public class CarteiraSpot extends Carteiras implements AcoesSpot {

    // Criação das abstrações
    protected float usd_quant = 0, brl_quant = 0, eur_quant = 0, jpy_quant = 0;

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

        public float getJpy_quant() {
            return this.jpy_quant;
        }

        public void setJpy_quant(float jpy_quant) {
            this.jpy_quant = jpy_quant;
        }

    //* Construtor filho "CarteiraSpot"
    public CarteiraSpot(float brl_quant, float usd_quant, float eur_quant, float jpy_quant) {

        super(0.0f, 0.0f, 0.0f, 0.0f);
        this.brl_quant = brl_quant;
        this.usd_quant = usd_quant;
        this.eur_quant = eur_quant;
        this.jpy_quant = jpy_quant;

    }

    @Override
    public void extrato() { //* Criando função para exebir o extrato da carteira

        System.out.println("Saldo das moedas: ");
        System.out.println("Real: " + brl_quant);
        System.out.println("Dolar: " + usd_quant);
        System.out.println("Euro: " + eur_quant);
        System.out.println("Iene: " + jpy_quant);

        System.out.println("Bitcoin: " + btc_quant);
        System.out.println("Ethereum: " + eth_quant);
        System.out.println("Solana: " + sol_quant);
        System.out.println("Urubu Coin: " + urc_quant);

    }

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

    public void sacar() {



    }
    public void transferir(Scanner sc) {
        System.out.println("Digite o simbolo da moeda/criptomoeda que vai ser transferida.");
        System.out.println("[1] BRL | [2] USD | [3] EUR | [4] JPY");
        int opcao_moeda_transf = sc.nextInt();
    
        System.out.print("Digite a quantia a ser transferida: ");
        float quant_transferencia = sc.nextFloat();
    
        switch (opcao_moeda_transf) {
            case 1:
                if (brl_quant >= quant_transferencia) {
                    brl_quant -= quant_transferencia;
                    System.out.println("Transferência efetuada. Seu saldo BRL: " + this.brl_quant);
                } else {
                    System.out.println("Saldo insuficiente para a transferência! ");
                }
                break;
    
            case 2:
                if (usd_quant >= quant_transferencia) {
                    usd_quant -= quant_transferencia;
                    System.out.println("Transferência efetuada. Seu saldo é de USD: " + usd_quant);
                } else {
                    System.out.println("Saldo insuficiente para a transferência!");
                }
                break;
    
            case 3:
                if (eur_quant >= quant_transferencia) {
                    eur_quant -= quant_transferencia;
                    System.out.println("Transferência efetuada. Seu saldo EUR: " + eur_quant);
                } else {
                    System.out.println("Saldo insuficiente para a transferência!");
                }
                break;
    
            case 4:
                if (jpy_quant >= quant_transferencia) {
                    jpy_quant -= quant_transferencia;
                    System.out.println("Transferência efetuada. Seu saldo JPY: " + jpy_quant);
                } else {
                    System.out.println("Saldo insuficiente para a transferência! ");
                }
                break;
           
            case 5:
            if (btc_quant >= quant_transferencia) {
                btc_quant -= quant_transferencia;
                System.out.println("Transferência efetuada. Seu saldo BITCOIN: " + btc_quant);
            } else {
                System.out.println("Saldo insuficiente para a transferência! ");
            }
            break;
                   
            case 6:
            if (eth_quant >= quant_transferencia) {
                eth_quant -= quant_transferencia;
                System.out.println("Transferência efetuada. Seu saldo Ethereum: " + eth_quant);
            } else {
                System.out.println("Saldo insuficiente para a transferência! ");
            }
            break;

            case 7:
            if (sol_quant >= quant_transferencia) {
                sol_quant -= quant_transferencia;
                System.out.println("Transferência efetuada. Seu saldo Solana: " + sol_quant);
            } else {
                System.out.println("Saldo insuficiente para a transferência! ");
            }
            break;

            case 8:
            if (urc_quant >= quant_transferencia) {
                urc_quant -= quant_transferencia;
                System.out.println("Transferência efetuada. Sua incrível carniça da Urubu Coin: " + urc_quant);
            } else {
                System.out.println("Saldo insuficiente para a transferência! ");
            }
            break;
            
            default:
                System.out.println("Opção Invalida! ");
                break;
            }
    }

}
