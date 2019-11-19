package Bridge;

public abstract class Abstraction {

    Implementation implementationA = new ImplementationA();
    Implementation implementationB = new ImplementationB();

    abstract void opreration();
    abstract void operation1();
    abstract void operation2();

}
