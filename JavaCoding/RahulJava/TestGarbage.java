package RahulJava;

public class TestGarbage {
    public void finalize() {
        System.out.println("object is garbage collected");
    }

    public static void main(String args[]) {
        TestGarbage s2 = new TestGarbage();
        s2 = null;
        System.gc();
    }
}
