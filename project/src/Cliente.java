public class Cliente {

    private String cpf;
	private String nome;
    private String saldo;

    public String getSaldo() {
        return this.saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String[] telefone) {
        this.telefone = telefone;
    }

    public String[] getEmail() {
        return this.email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }
	
    private String [] telefone;
	private String [] email;


}
