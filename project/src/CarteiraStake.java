import java.util.Scanner;

public class CarteiraStake extends Carteiras implements AcoesStake {

    private int opcao_moeda_depos, opcao_moeda_saque;
    private float quant_saque = 0, quant_deposito = 0;

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

        System.out.println("Digite o simbolo da moeda/criptomoeda que vai ser depositada.");
        System.out.println("[1] BTC | [2] ETH | [3] SOL | [4] URC: ");
        opcao_moeda_depos = sc.nextInt();

        switch (opcao_moeda_depos) {

            case 1:

                System.out.print("Digite a quantia a ser depositada: ");
                quant_deposito = sc.nextFloat();
                if (quant_deposito >= 0) {

                    btc_quant += quant_deposito;
                    System.out.println("Deposito efetuado. Voce possui BTC R$" + btc_quant);

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
                    System.out.println("Deposito efetuado. Voce possui ETH R$" + eth_quant);

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
                    System.out.println("Deposito efetuado. Voce possui SOL R$" + sol_quant);

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
                    System.out.println("Deposito efetuado. Voce possui A MELHOR MOEDA DO MUNDO URC R$" + urc_quant);

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
        System.out.println("[1] BTC | [2] ETH | [3] SOL | [4] URC: ");
        opcao_moeda_saque= sc.nextInt();

        switch (opcao_moeda_saque) {

            case 1:

                System.out.print("Digite a quantia a ser sacada: ");
                quant_saque = sc.nextFloat();
                if (quant_saque >= 0) {

                    btc_quant -= quant_saque;
                    System.out.println("Saque efetuado. Voce sacou BTC R$" + btc_quant);

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
                    System.out.println("Saque efetuado. Voce sacou ETH R$" + eth_quant);

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
                    System.out.println("Saque efetuado. Voce sacou SOL R$" + sol_quant);

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
                    System.out.println("Saque efetuado. Voce sacou URC R$" +urc_quant);

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

    public void stake(Scanner sc) {

        System.out.println("Digite a quantidade para investir no stake");
        float quant_stake = sc.nextFloat();
        System.out.println("Selecione a quantidade de meses para o investimento");
        System.out.println("[1] 1 mês | [2] 3 mesês | [3] 6 mesês | [4] 1 ano");
        int quant_meses = sc.nextInt();

        switch (quant_meses) {
            case 1:

                float investimento1 = quant_stake * 0.01f;

                System.out.println("Parabéns! seu lucro foi de "+ investimento1);
                
                break;

            case 2:
                
                float investimento2 = quant_stake * 0.03f;

                System.out.println("Parabéns! seu lucro foi de "+ investimento2);

                break;

            case 3:

                float investimento3 = quant_stake * 0.06f;

                System.out.println("Parabéns! seu lucro foi de "+ investimento3);

                break;

            case 4:

                float investimento4 = quant_stake * 0.09f;

                System.out.println("Parabéns! seu lucro foi de "+ investimento4);

                break;

            default:

                System.out.println("Opção invalida");
        

    }

 }

}
