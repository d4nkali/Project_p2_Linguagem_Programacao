import java.util.Scanner;

//TODO: Implementar as funções em seus lugares

public class Main {

    public static void main(String[] args) throws Exception {

        // Variáveis para Criar usuário

            String c_nome = "", c_senha = "", c_email = "", c_login_nome = "", c_login_senha = "";
            int c_cpf = 0;

        // Variáveis de opção:

            boolean op_login_success = false;
            int op_login = 0, op_acao = 0;

        //! Objetos

            Scanner sc = new Scanner(System.in);
            Cliente c1 = new Cliente(c_nome, c_cpf, c_email, c_senha);
            CarteiraSpot cs = new CarteiraSpot(0, 0, 0, 0);

        System.out.println("Bem vindo a Vulture Trades - A Carniça da Blockchain \n");

        do { //* Loop Login/Cadastro

            System.out.println("Voce deseja Logar [1] ou Cadastrar [2]? ");
            op_login = sc.nextInt();
            switch (op_login) {

                case 1:

                    System.out.print("Digite seu nome: ");
                    c_login_nome = sc.next();
                    System.out.print("Digite sua senha: ");
                    c_login_senha = sc.next();

                    //* Se o login e senha for iguais ao cadastrado, então:
                    if (c_login_nome.equals(c_nome) && c_login_senha.equals(c_senha)) {

                        System.out.println("Login bem sucedido!");
                        op_login_success = true; //! Define que o login foi feito com sucesso

                    } 

                    else { //* Senão:

                        System.out.println("Credenciais não cadastradas. Tente novamente!");
                        op_login_success = false; //! Define que o login não foi autorizado

                    }
                    break;

                case 2:

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

        } while (!op_login_success); //* Ira parar de repetir quando o login for autorizado

        do { //* Loop da Tela principal

            System.out.println("Bem-vindo ao Sistema de Operações Bancárias");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1 - Extrato");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("4 - Transferência");
            System.out.println("5 - Conversor de Moedas");
            System.out.println("6 - Stake");
            System.out.println("0 - Sair");

            op_acao = sc.nextInt();

            switch (op_acao) {

                case 1:

                    System.out.println("Você selecionou: Extrato");
                    cs.extrato();
                    break;

                case 2:

                    System.out.println("Você selecionou: Depósito");
                    cs.depositar(sc);
                    break;

                case 3:

                    System.out.println("Você selecionou: Saque");
                    break;

                case 4:

                    System.out.println("Você selecionou: Transferência");
                    cs.transferir(sc);
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
                    break;

            }

        } while (op_acao != 0);  //* Ira sair quando for 0


        sc.close(); // Encerra o scanner

    }

}
