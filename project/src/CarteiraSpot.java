import java.util.Scanner;

public class CarteiraSpot extends Carteiras implements AcoesSpot {

    // Criação da quantidade de moedas lastreáveis
    protected float usd_quant = 0, brl_quant = 0, eur_quant = 0, jpy_quant = 0;

    // Variáveis de opção
    private int opcao_moeda_depos, opcao_moeda_saque, opcao_moeda_transf;

    // Variáveis temporárias
    private float quant_deposito = 0, quant_saque = 0, quant_transferencia = 0;

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
    public void extrato() { //* Criando função para exibir o extrato da carteira

        System.out.println("Saldo das moedas: ");
        System.out.println("BRL = " + brl_quant + " | USD = " + usd_quant + " | EUR = " + eur_quant + " | JPY = " + jpy_quant + " | BTC = " + btc_quant + " | ETH = " + eth_quant + " | SOL = " + sol_quant + " | URC = " + urc_quant);

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

            case 2:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    usd_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui USD R$" + usd_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                break;

            case 3:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    eur_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui EUR R$" + eur_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                break;

            case 4:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    jpy_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui BRL R$" + jpy_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                break;

            case 5:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    btc_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui BTC R$" + btc_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                break;

            case 6:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    eth_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui ETH R$" + eth_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                break;

            case 7:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    sol_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui SOL R$" + sol_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                break;

            case 8:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    urc_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui URC R$" + urc_quant);

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

    public void sacar(Scanner sc) { //* Criando função para sacar as moedas

        System.out.println("Digite o simbolo da moeda/criptomoeda que vai ser sacada.");
        System.out.println("[1] BRL | [2] USD | [3] EUR | [4] JPY | [5] BTC | [6] ETH | [7] SOL | [8] URC: ");
        opcao_moeda_saque= sc.nextInt();

        switch (opcao_moeda_saque) {

            case 1:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    brl_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou BRL R$" + brl_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;
            
            case 2:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    usd_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou USD " + usd_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            case 3:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    eur_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou EUR " + eur_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            case 4:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    jpy_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou JPY" + jpy_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            case 5:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    btc_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou BTC R$" + brl_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            case 6:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    eth_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou ETH R$" + eth_quant);

                }

            else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            case 7:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    sol_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou SOL R$" + sol_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            case 8:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    urc_quant -= quant_saque;
                    System.out.println("Saque efetuado na MELHOR MOEDA DE TODA A GALAXIA. Voce sacou URC" + urc_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            default:

                System.out.println("Opção Invalida!");
                break;

        }

    }

    public void transferir(Scanner sc) { //* Criando função para transferir as moedas

        System.out.println("Digite o simbolo da moeda/criptomoeda que vai ser transferida.");
        System.out.println("[1] BRL | [2] USD | [3] EUR | [4] JPY | [5] BTC | [6] ETH | [7] SOL | [8] URC: ");
        opcao_moeda_transf = sc.nextInt();

        System.out.print("Digite a quantia a ser transferida: ");
        quant_transferencia = sc.nextFloat();

        switch (opcao_moeda_transf) {

            case 1:

                if (brl_quant >= quant_transferencia) {

                    brl_quant -= quant_transferencia;
                    System.out.println("Transferência efetuada. Seu saldo BRL: " + this.brl_quant);

                } 

                else {

                    System.out.println("Saldo insuficiente para a transferência! ");

                }
                break;

            case 2:

                if (usd_quant >= quant_transferencia) {

                    usd_quant -= quant_transferencia;
                    System.out.println("Transferência efetuada. Seu saldo é de USD: " + usd_quant);

                } 

                else {

                    System.out.println("Saldo insuficiente para a transferência!");

                }
                break;

            case 3:

                if (eur_quant >= quant_transferencia) {

                    eur_quant -= quant_transferencia;
                    System.out.println("Transferência efetuada. Seu saldo EUR: " + eur_quant);

                } 

                else {

                    System.out.println("Saldo insuficiente para a transferência!");

                }
                break;

            case 4:

                if (jpy_quant >= quant_transferencia) {

                    jpy_quant -= quant_transferencia;
                    System.out.println("Transferência efetuada. Seu saldo JPY: " + jpy_quant);

                }

                else {

                    System.out.println("Saldo insuficiente para a transferência! ");

                }
                break;

            case 5:

            if (btc_quant >= quant_transferencia) {

                btc_quant -= quant_transferencia;
                System.out.println("Transferência efetuada. Seu saldo Bitcoin: " + btc_quant);

            } 

            else {

                System.out.println("Saldo insuficiente para a transferência! ");

            }
            break;

            case 6:

            if (eth_quant >= quant_transferencia) {

                eth_quant -= quant_transferencia;
                System.out.println("Transferência efetuada. Seu saldo Ethereum: " + eth_quant);

            } 

            else {

                System.out.println("Saldo insuficiente para a transferência! ");

            }
            break;

            case 7:

            if (sol_quant >= quant_transferencia) {

                sol_quant -= quant_transferencia;
                System.out.println("Transferência efetuada. Seu saldo Solana: " + sol_quant);

            } 

            else {

                System.out.println("Saldo insuficiente para a transferência! ");

            }
            break;

            case 8:

            if (urc_quant >= quant_transferencia) {

                urc_quant -= quant_transferencia;
                System.out.println("Transferência efetuada. Sua incrível carniça da Urubu Coin: " + urc_quant);

            } 

            else {

                System.out.println("Saldo insuficiente para a transferência! ");

            }
            break;

            default:

                System.out.println("Opção Invalida! ");
                break;

        }

    }

}
