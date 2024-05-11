import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a Vulture Trades - A Carniça da Blockchain \n");
        
        System.out.println("Bem-vindo ao Sistema de Operações Bancárias");
        System.out.println("Escolha uma das seguintes opções:");
        System.out.println("1 - Extrato");
        System.out.println("2 - Depósito");
        System.out.println("3 - Saque");
        System.out.println("4 - Transferência");
        System.out.println("5 - Conversor de Moeda");
        System.out.println("6 - Stake");
        System.out.println("0 - Sair");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você selecionou: Extrato");
                break;

            case 2:
                System.out.println("Você selecionou: Depósito");
                break;

            case 3:
                System.out.println("Você selecionou: Saque");
                break;

            case 4:
                System.out.println("Você selecionou: Transferência");
                break;

            case 5:
                System.out.println("Você selecionou: Conversor de Moeda");
                break;

            case 6:
                System.out.println("Você selecionou: Stake");
                break;

            case 0:
                System.out.println("Saindo do sistema...");
                break;
                
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
        }
    }
}