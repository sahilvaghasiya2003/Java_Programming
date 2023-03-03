class A3 {
    String S;

    A3(String s) {
        hello(s);
    }

    public void hello(String s) {
        S = s;
        System.out.println("A3 : Hello From " + S);
    }
}

class B3 extends A3 {
    B3(String s) {
        super(s);
    }

    public void hello(String s) {
        S = s;
        System.out.println("B3 : Hello From " + S);
    }
}

public class pr_05_02 {
    public static void main(String args[]) {
        A3 a = new A3("sahil");
        A3 b = new B3("sahil");
    }
}
