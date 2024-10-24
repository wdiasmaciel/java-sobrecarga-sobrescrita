public class PessoaFisica extends Pessoa {
    String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {   
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void identificacao() {
        super.identificacao();
        System.out.println("Nome: " + super.nome + ", CPF: " + this.cpf);
    }

    public void identificacao(String telefone) {
        super.identificacao();
        System.out.println("Nome: " + super.nome + ", CPF: " + this.cpf + ", Telefone: " + telefone);
    }
}
