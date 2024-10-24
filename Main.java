public class Main {
    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa("Ana");
       pessoa.identificacao();

       PessoaFisica pessoaFisica1 = new PessoaFisica("Gisele", "123.456.789-00");
       pessoaFisica1.identificacao();

       PessoaFisica pessoaFisica2 = new PessoaFisica("Fábio", "222.444.777-99");
       pessoaFisica2.identificacao("+55 (31) 9 8451 8957");
    }
}