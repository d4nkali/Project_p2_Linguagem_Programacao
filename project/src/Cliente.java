import java.util.Date; //Importar Data

public class Cliente {

    private static int counter = 1;
    
    
    private int numeroPessoa ;
    private String name;
    private String cpf;
    private String email;
    private Date accountCreationDate;
    private int telefone;


    public Cliente() { }

    public Cliente(String name, String cpf, String email) {
        this.numeroPessoa = Cliente.counter;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.accountCreationDate = new Date();
        Cliente.counter += 1;
    }

    public int getNumeroPessoa() {
        return this.numeroPessoa;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }
    public int getTelefone() {
        return this.telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return  "\nName: " + this.getName() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail() +
                "\nEmail: " + this.getTelefone() +
                "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
    }


}