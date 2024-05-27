import java.util.Scanner;

public class CarteiraSpot extends Carteiras implements AcoesSpot {

    // Criação da quantidade de moedas lastreáveis
    protected float usd_quant = 0, brl_quant = 0, eur_quant = 0, jpy_quant = 0;

    // Variáveis de opção
    private int opcao_moeda_depos, opcao_moeda_saque, opcao_moeda_transf, opcao_moeda_origem, opcao_moeda_destino;

    // Variáveis temporárias
    private float quant_deposito = 0, quant_saque = 0, quant_transferencia = 0, quant_conversor = 0, quant_convertido = 0;

    // Taxas de câmbio fixas das moedas lastreáveis
    private static final float USD_TO_BRL = 5.14f;
    private static final float USD_TO_EUR = 0.92f;
    private static final float USD_TO_JPY = 156.96f;
    private static final float BRL_TO_USD = 1 / USD_TO_BRL;
    private static final float BRL_TO_EUR = BRL_TO_USD * USD_TO_EUR;
    private static final float BRL_TO_JPY = BRL_TO_USD * USD_TO_JPY;
    private static final float EUR_TO_USD = 1 / USD_TO_EUR;
    private static final float EUR_TO_BRL = 1 / BRL_TO_EUR;
    private static final float EUR_TO_JPY = EUR_TO_USD * USD_TO_JPY;
    private static final float JPY_TO_USD = 1 / USD_TO_JPY;
    private static final float JPY_TO_BRL = 1 / BRL_TO_JPY;
    private static final float JPY_TO_EUR = 1 / EUR_TO_JPY;

    // Taxas de câmbio fixa para criptomoedas
    private static final float BTC_TO_BRL = 338941.68f;
    private static final float ETH_TO_BRL = 15178.67f;
    private static final float SOL_TO_BRL = 825.20f;
    private static final float URC_TO_BRL = 0.110f;
    private static final float BRL_TO_BTC = 1 / BTC_TO_BRL;
    private static final float BRL_TO_ETH = 1 / ETH_TO_BRL;
    private static final float BRL_TO_SOL = 1 / SOL_TO_BRL;
    private static final float BRL_TO_URC = 1 / URC_TO_BRL;

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
        System.out.print("[1] BRL | [2] USD | [3] EUR | [4] JPY | [5] BTC | [6] ETH | [7] SOL | [8] URC: ");
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
        System.out.print("[1] BRL | [2] USD | [3] EUR | [4] JPY | [5] BTC | [6] ETH | [7] SOL | [8] URC: ");
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
        System.out.print("[1] BRL | [2] USD | [3] EUR | [4] JPY | [5] BTC | [6] ETH | [7] SOL | [8] URC: ");
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

    public void conversor(Scanner sc) { //* Criando função para converter as moedas

        System.out.println("Digite o símbolo da moeda de origem.");
        System.out.print("[1] BRL | [2] USD | [3] EUR | [4] JPY | [5] BTC | [6] ETH | [7] SOL | [8] URC: ");
        opcao_moeda_origem = sc.nextInt();

        System.out.println("Digite o símbolo da moeda de destino.");
        System.out.print("[1] BRL | [2] USD | [3] EUR | [4] JPY | [5] BTC | [6] ETH | [7] SOL | [8] URC: ");
        opcao_moeda_destino = sc.nextInt();

        if (opcao_moeda_origem == opcao_moeda_destino) {

            System.out.println("As moedas para a conversão não podem ser iguais.");
            return;

        }

        System.out.print("Digite a quantia a ser convertida: ");
        quant_conversor = sc.nextFloat();

        //* Converte com base nas opções escolhidas
        switch (opcao_moeda_origem) {

            case 1: // Se for Real
                if (brl_quant >= quant_conversor) {
                    switch (opcao_moeda_destino) {

                        case 2: // Real para Dólar

                            quant_convertido = quant_conversor * BRL_TO_USD;
                            brl_quant -= quant_conversor;
                            usd_quant += quant_convertido;
                            break;

                        case 3: // Real para Euro

                            quant_convertido = quant_conversor * BRL_TO_EUR;
                            brl_quant -= quant_conversor;
                            eur_quant += quant_convertido;
                            break;

                        case 4: // Real para Iene 

                            quant_convertido = quant_conversor * BRL_TO_JPY;
                            brl_quant -= quant_conversor;
                            jpy_quant += quant_convertido;
                            break;

                        case 5: // Real para Bitcoin

                            quant_convertido = quant_conversor * BRL_TO_BTC;
                            brl_quant -= quant_conversor;
                            btc_quant += quant_convertido;
                            break;

                        case 6: // Real para Ethereum

                            quant_convertido = quant_conversor * BRL_TO_ETH;
                            brl_quant -= quant_conversor;
                            eth_quant += quant_convertido;
                            break;

                        case 7: // Real para Solana

                            quant_convertido = quant_conversor * BRL_TO_SOL;
                            brl_quant -= quant_conversor;
                            sol_quant += quant_convertido;
                            break;

                        case 8: //Real para Urubu coin

                            quant_convertido = quant_conversor * BRL_TO_URC;
                            brl_quant -= quant_conversor;
                            urc_quant += quant_convertido;
                            break;

                    }

                } 

                else {

                    System.out.println("Saldo insuficiente para a conversão!");
                    return;

                }
            break;

            case 2: // Se for Dólar Americano
                if (usd_quant >= quant_conversor) {
                    switch (opcao_moeda_destino) {

                        case 1: // Dólar para Real

                        quant_convertido = quant_conversor * USD_TO_BRL;
                            usd_quant -= quant_conversor;
                            brl_quant += quant_convertido;
                            break;

                        case 3: // Dólar para Euro

                            quant_convertido = quant_conversor * USD_TO_EUR;
                            usd_quant -= quant_conversor;
                            eur_quant += quant_convertido;
                            break;

                        case 4: // Dólar para Iene

                            quant_convertido = quant_conversor * USD_TO_JPY;
                            usd_quant -= quant_conversor;
                            jpy_quant += quant_convertido;
                            break;

                        case 5: // Dólar para Bitcoin

                            quant_convertido = (quant_conversor * USD_TO_BRL) * BRL_TO_BTC;
                            usd_quant -= quant_conversor;
                            btc_quant += quant_convertido;
                            break;

                        case 6: // Dólar para Ethereum

                            quant_convertido = (quant_conversor * USD_TO_BRL) * BRL_TO_ETH;
                            usd_quant -= quant_conversor;
                            eth_quant += quant_convertido;
                            break;

                        case 7: // Dólar para Solana

                            quant_convertido = (quant_conversor * USD_TO_BRL) * BRL_TO_SOL;
                            usd_quant -= quant_conversor;
                            sol_quant += quant_convertido;
                            break;

                        case 8: // USD para URC

                            quant_convertido = (quant_conversor * USD_TO_BRL) * BRL_TO_URC;
                            usd_quant -= quant_conversor;
                            urc_quant += quant_convertido;
                            break;

                    }

                } 

                else {

                    System.out.println("Saldo insuficiente para a conversão!");
                    return;

                }
            break;

            case 3: // Caso for Euro
                if (eur_quant >= quant_conversor) {
                    switch (opcao_moeda_destino) {

                        case 1: // Euro para Real

                            quant_convertido = quant_conversor * EUR_TO_BRL;
                            eur_quant -= quant_conversor;
                            brl_quant += quant_convertido;
                            break;

                        case 2: // Euro para Dólar

                            quant_convertido = quant_conversor * EUR_TO_USD;
                            eur_quant -= quant_conversor;
                            usd_quant += quant_convertido;
                            break;

                        case 4: // Euro para Iene

                            quant_convertido = quant_conversor * EUR_TO_JPY;
                            eur_quant -= quant_conversor;
                            jpy_quant += quant_convertido;
                            break;

                        case 5: // Euro para Bitcoin

                            quant_convertido = (quant_conversor * EUR_TO_BRL) * BRL_TO_BTC;
                            eur_quant -= quant_conversor;
                            btc_quant += quant_convertido;
                            break;

                        case 6: // Euro para Ethereum

                            quant_convertido = (quant_conversor * EUR_TO_BRL) * BRL_TO_ETH;
                            eur_quant -= quant_conversor;
                            eth_quant += quant_convertido;
                            break;

                        case 7: // Euro para Solana

                            quant_convertido = (quant_conversor * EUR_TO_BRL) * BRL_TO_SOL;
                            eur_quant -= quant_conversor;
                            sol_quant += quant_convertido;
                            break;

                        case 8: // EUR para URC

                            quant_convertido = (quant_conversor * EUR_TO_BRL) * BRL_TO_URC;
                            eur_quant -= quant_conversor;
                            urc_quant += quant_convertido;
                            break;

                    }

                } 
                
                else {

                    System.out.println("Saldo insuficiente para a conversão!");
                    return;

                }
                break;

            case 4: // Caso for Iene Japonês
                if (jpy_quant >= quant_conversor) {
                    switch (opcao_moeda_destino) {

                        case 1: // Iene para Real

                            quant_convertido = quant_conversor * JPY_TO_BRL;
                            jpy_quant -= quant_conversor;
                            brl_quant += quant_convertido;
                            break;

                        case 2: // Iene para Dólar

                            quant_convertido = quant_conversor * JPY_TO_USD;
                            jpy_quant -= quant_conversor;
                            usd_quant += quant_convertido;
                            break;

                        case 3: // Iene para Euro

                            quant_convertido = quant_conversor * JPY_TO_EUR;
                            jpy_quant -= quant_conversor;
                            eur_quant += quant_convertido;
                            break;

                        case 5: // Iene para Bitcoin

                            quant_convertido = (quant_conversor * JPY_TO_BRL) * BRL_TO_BTC;
                            jpy_quant -= quant_conversor;
                            btc_quant += quant_convertido;
                            break;

                        case 6: // Iene para Ethereum

                            quant_convertido = (quant_conversor * JPY_TO_BRL) * BRL_TO_ETH;
                            jpy_quant -= quant_conversor;
                            eth_quant += quant_convertido;
                            break;

                        case 7: // Iene para Solana

                            quant_convertido = (quant_conversor * JPY_TO_BRL) * BRL_TO_SOL;
                            jpy_quant -= quant_conversor;
                            sol_quant += quant_convertido;
                            break;

                        case 8: // Iene para Urubu Coin

                            quant_convertido = (quant_conversor * JPY_TO_BRL) * BRL_TO_URC;
                            jpy_quant -= quant_conversor;
                            urc_quant += quant_convertido;
                            break;

                    }

                } 

                else {

                    System.out.println("Saldo insuficiente para a conversão!");
                    return;

                }
                break;

            

        }

        System.out.println("Conversão realizada com sucesso!");
        System.out.println("Quantia convertida: " + quant_conversor);
        System.out.println("Valor convertido: " + quant_convertido);

    }

}
