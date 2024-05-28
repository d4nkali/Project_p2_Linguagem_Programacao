import java.util.Scanner;

public class CarteiraStake extends Carteiras implements AcoesStake {

    // Variáveis de opção
    private int opcao_moeda_depos, opcao_moeda_saque, opcao_moeda_stake;
    private int quant_meses;

    // Variáveis temporárias 
    private float quant_saque = 0, quant_deposito = 0, quant_stake = 0;
    private float rendi_stake;

    //* Construtor filho de "CarteiraStake"
    public CarteiraStake() {

        super(0.0f, 0.0f, 0.0f, 0.0f);

    }

    @Override
    public void extrato() { //* Criando função para exibir o extrato da carteira

        System.out.println("Saldo das criptomoedas: ");
        System.out.println("BTC = " + btc_quant + " | ETH = " + eth_quant + " | SOL = " + sol_quant + " | URC = " + urc_quant);

    }

    public void depositar(Scanner sc) { //* Criando função para depositar as moedas

        System.out.println("Digite o simbolo da moeda/criptomoeda que vai ser depositada. Digite o símbolo da moeda de origem. OBS: Utilize ',' ao invés de '.'");
        System.out.print("[1] BTC | [2] ETH | [3] SOL | [4] URC: ");
        opcao_moeda_depos = sc.nextInt();

        switch (opcao_moeda_depos) {

            case 1:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    btc_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui BTC " + btc_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                System.out.println("Opção Invalida!");
                break;

            case 2:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    eth_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui ETH " + eth_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                break;

            case 3:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    sol_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui SOL " + sol_quant);

                }

                else {

                    System.out.println("Valor insuficiente para depositar.");

                }

                break;

            case 4:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    urc_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui A MELHOR MOEDA DO MUNDO URC " + urc_quant);

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

        System.out.println("Digite o simbolo da moeda/criptomoeda que vai ser sacada. Digite o símbolo da moeda de origem. OBS: Utilize ',' ao invés de '.'");
        System.out.print("[1] BTC | [2] ETH | [3] SOL | [4] URC: ");
        opcao_moeda_saque= sc.nextInt();

        switch (opcao_moeda_saque) {

            case 1:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    btc_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou BTC " + btc_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            case 2:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    eth_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou ETH " + eth_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            case 3:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    sol_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou SOL " + sol_quant);

                }

                else {

                    System.out.println("Valor insuficiente para sacar.");

                }

                break;

            case 4:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    urc_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou URC " +urc_quant);

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

    public void stake(Scanner sc) { //* Criando função para simulação do stake

        System.out.println("Digite o simbolo da moeda/criptomoeda que vai ser simulada para o stake. Digite o símbolo da moeda de origem. OBS: Utilize ',' ao invés de '.'");
        System.out.print("[1] BTC | [2] ETH | [3] SOL | [4] URC: ");
        opcao_moeda_stake = sc.nextInt();
        System.out.println();
    
        System.out.println("Selecione a quantidade de meses para o investimento");
        System.out.print("[1] 1 mês | [2] 3 meses | [3] 6 meses | [4] 1 ano : ");
        quant_meses = sc.nextInt();
        System.out.println();
    
        System.out.print("Digite a quantidade para simular no stake: ");
        quant_stake = sc.nextFloat();
        System.out.println();

        //* Calcula o rendimento com base na escolha dos meses
        switch (quant_meses) {

            case 1: // Se for 1 mês

                rendi_stake = quant_stake * 0.001f;
                System.out.println("Rendimento estimado para 1 mês é de " + rendi_stake);
                break;

            case 2: // Se for 3 meses

                rendi_stake = quant_stake * 0.003f;
                System.out.println("Rendimento estimado para 3 meses é de " + rendi_stake);
                break;

            case 3: // Se for 6 meses

                rendi_stake = quant_stake * 0.006f;
                System.out.println("Rendimento estimado para 6 meses é de " + rendi_stake);
                break;

            case 4: // Se for 1 ano

                rendi_stake = quant_stake * 0.009f;
                System.out.println("Rendimento estimado para 1 ano é de " + rendi_stake);
                break;

            default:

                System.out.println("Opção inválida!");
                break;

        }

    }

}
