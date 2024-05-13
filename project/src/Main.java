import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String c_nome = "", c_senha = "", c_email = "";
        int c_cpf = 0;
        int opcao = 0;

        boolean op_login_success = false;
        int op_login = 0;

        Scanner sc = new Scanner(System.in);
        Cliente c1 = new Cliente(c_nome, c_cpf, c_email, c_senha);

        System.out.println("Bem vindo a Vulture Trades - A Carniça da Blockchain \n");

        do {
        
            System.out.println("Voce deseja Logar [1] ou Cadastrar [2]? ");
            op_login = sc.nextInt();
            switch (op_login) {

                case 1:

                //TODO: Fazer login @JoaoMagalhaes-hub

                System.out.print("Digite seu nome: ");
                c_nome = sc.next();
                System.out.print("Digite sua senha: ");
                c_senha = sc.next();

                    break;

                case 2:

                //TODO: Terminar cadastro @d4nkali

                    System.out.print("Digite o seu nome: ");
                    c_nome = sc.next();
                    System.out.print("Digite o seu CPF: ");
                    c_cpf = sc.nextInt();
                    System.out.print("Digite um endereço de email: ");
                    c_email = sc.next();
                    System.out.print("Digite uma senha: ");
                    c_senha = sc.next();
                    break;

                default:

                    System.out.println("Opção Invalida");
                    break;

            }

        } while (op_login_success == true);

        //TODO: Fazer switch case e do while @JANzxz, @Olausz

          do {
            System.out.println("Bem-vindo ao Sistema de Operações Bancárias");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1 - Extrato");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("4 - Transferência");
            System.out.println("5 - Conversor de Moeda");
            System.out.println("6 - Stake");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

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
        } while (opcao != 0);
    }
}
