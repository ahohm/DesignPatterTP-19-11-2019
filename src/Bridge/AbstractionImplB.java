package Bridge;

public class AbstractionImplB extends Abstraction{

    @Override
    void opreration() {
        System.out.println("operation B");
    }

    @Override
    void operation1() {
        implementationB.operation1();
        System.out.println("operation1 B");
    }

    @Override
    void operation2() {
        implementationB.operation2();
        System.out.println("operation2 B");
    }
}
