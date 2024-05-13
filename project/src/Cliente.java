import java.util.Date; //Importar Data

public class Cliente {

    private static int counter = 1;

    // Criação de abstração
    private int numeroPessoa, cpf;
    private String nome, email, senha;
    private Date accountCreationDate;

    //* Construtor do Cliente
    public Cliente(String nome, int cpf, String email, String senha) {

        this.numeroPessoa = Cliente.counter; 
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.accountCreationDate = new Date();
        Cliente.counter += 1;

    }

    // Getters e Setters 

        public int getNumeroPessoa() {
            return this.numeroPessoa;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha (String senha) {
            this.senha = senha;
        }

        public Date getAccountCreationDate() {
            return this.accountCreationDate;
        }

    // Retornar para toString
    public String toString() {

        return  "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail() +
                "\nSenha: " + this.getSenha() +
                "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());

    }

}