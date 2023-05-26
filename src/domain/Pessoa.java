package domain;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void exibir() {
        System.out.println(nome + " :: " + idade);
    }
}
