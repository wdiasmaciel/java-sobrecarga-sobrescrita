public class Pessoa {
    String nome;

    public Pessoa() {}
    public Pessoa(String nome) {this.nome = nome;}

    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}

    public void identificacao() {
        System.out.println("Nome: " + this.nome);
    }
}