package domain;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    List<Aluno> alunos = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }
}
