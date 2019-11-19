package FacadeImplimentation;

//16.25

public class Facade {
    ClassA classA ;
    ClassB classB ;

    public Facade() {
        this.classA = new ClassA();
        this.classB = new ClassB();
    }

    public void operation2(){
        classA.operation2();
    }

    public void operation4(){
        classB.operation4();
    }
}
