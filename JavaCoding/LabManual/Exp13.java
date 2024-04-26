package LabManual;

public class Exp13 {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throw one");
        throw new IllegalAccessException("demo");
    }
    
    public static void main(String[] args) {
        try{
            throwOne();
        }catch(IllegalAccessException e){

    System.out.println("Caught"+e);
        }
    }
}
