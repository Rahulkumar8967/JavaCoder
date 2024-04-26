package LabManual;

public class Exp16 {
    
    public static void main(String[] args) {
        String s = "Now is the time to grow in it sector in very less" + "to earn money and respect";
        System.out.println(s);

        System.out.println("indexOf(t)=" + s.indexOf('t'));

        System.out.println("lastIndexOf(t)=" + s.lastIndexOf('t'));

        System.out.println("indexOf(the)=" + s.indexOf("the"));

        System.out.println("indexOf(t,10)=" + s.indexOf('t', 10));

        System.out.println("lastIndexOf(t,60)=" + s.lastIndexOf('t', 60));

        System.out.println("indexOf(the,100)=" + s.indexOf("the", 100));

        System.out.println("lastIndexOf(the,60)=" + s.lastIndexOf("the", 60));

        String org = "This is a test. This is, too";
        String Search = "Is";
        String sub = "was";
        String result = "";
        int i;
        do {
            System.out.println(org);
            i = org.indexOf(Search);

            if (i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + Search.length());
                org = result;
            }

        } while (i != -1);

        String s1 = "One";
        String s2 = s1.concat("two");
        System.out.println("s1 is:" + s1 + " and s2 is:" + s2);
    }
}
