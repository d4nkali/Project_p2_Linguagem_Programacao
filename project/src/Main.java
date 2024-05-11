import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        String c_nome = "", c_senha = "", c_email = "";
        int c_cpf = 0;

        boolean op_login_success = false;
        int op_login = 0;

        Scanner sc = new Scanner(System.in);
        Cliente c1 = new Cliente(c_nome, c_cpf, c_email, c_senha);

        System.out.println("Bem vindo a Vulture Trades - A Carniça da Blockchain \n");
        do {
        
            System.out.println("Voce deseja Logar [1] ou Cadastra [2]? ");
            op_login = sc.nextInt();
            switch (op_login) {

                case 1:


                    break;

                case 2:

                    System.out.print("Digite o seu nome: ");
                    c_nome = sc.next();
                    System.out.print("Digite o seu CPF: ");
                    c_cpf = sc.nextInt();
                    break;

            
                default:

                    System.out.println("Opção Invalida");
                    break;

            }

        } while (op_login_success == true);
        System.out.println("");

        //TODO: Fazer switch case e do while @JANzxz, @Olausz

        sc.close();

    }

}
