package domain;

public class TestMethod {

    public static void main(String args[]) {
        classeBase obj1 = new classeBase();
        classeBase obj2 = new classDerivada();
        classDerivada obj3 = new classDerivada();

        obj1.metA();
        obj2.metA();
        obj3.metA();

    }
}
