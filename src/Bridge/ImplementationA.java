package Bridge;

public class ImplementationA implements Implementation{


    @Override
    public void operation1() {
        System.out.println("operation1 from implementation A");
    }

    @Override
    public void operation2() {
        System.out.println("operation2 from implementation A");
    }
}
