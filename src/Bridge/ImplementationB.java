package Bridge;

public class ImplementationB implements Implementation{


    @Override
    public void operation1() {
        System.out.println("operation1 from implementation B");
    }

    @Override
    public void operation2() {
        System.out.println("operation2 from implementation B");
    }
}
