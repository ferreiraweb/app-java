package domain;

public class Pessoa {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

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
