package RahulJava;

public class multipleTry {

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task 2");
        } catch (ArithmeticException e) {
            System.out.println("Task 1");
        } catch (Exception e) {
            System.out.println("Common Task is completed");
        }
    }
}
