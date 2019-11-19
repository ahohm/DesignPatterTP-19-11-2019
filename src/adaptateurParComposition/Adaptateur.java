package adaptateurParComposition;

public class Adaptateur implements Standard{

    ImplAdapte implAdapte;

    public Adaptateur(ImplAdapte implAdapte) {
        this.implAdapte = implAdapte;
    }

    @Override
    public void operation() {
        implAdapte.operationAdapte1();
        implAdapte.operationAdapte2();
    }
}
