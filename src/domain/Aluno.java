package domain;

import java.util.Random;

import javax.swing.text.Style;

class Aluno {

    // Atributos
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    // Métodos
    public Aluno(String nome, int idade) {
        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_identificador = aleatorio.nextDouble();
    }

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    public void exibir() {
        System.out.println("nome: " + nome + " - idade: " + idade + " - Código: " + codigo_identificador);
    }
}