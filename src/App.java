import domain.Aluno;
import domain.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! x2");

        Pessoa p1 = new Pessoa(25, "Paulo");

        p1.exibir();

        Aluno a1 = new Aluno("Joao", 24);

        a1.exibir();

    }
}
