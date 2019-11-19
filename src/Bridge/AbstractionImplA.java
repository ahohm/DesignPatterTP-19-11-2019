package Bridge;

public class AbstractionImplA extends Abstraction{
    @Override
    void opreration() {

        System.out.println("operation A");
    }

    @Override
    void operation1() {
        implementationA.operation1();
        System.out.println("operation1 A");
    }

    @Override
    void operation2() {
        implementationA.operation2();
        System.out.println("operation2 A");
    }
}
