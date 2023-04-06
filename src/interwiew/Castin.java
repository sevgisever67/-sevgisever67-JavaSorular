package interwiew;

public class Castin {
    public static void main(String[] args) {
        //How to convert Integer to String in Java?

        int x = 123;
        int y = 456;
        String s1 = Integer.toString(x);
        String s2 = Integer.toString(y);

        System.out.println("String s1 = " + s1);
        System.out.println("String s2 = " + s2);
        //System.out.println(s1.startsWith("1"));
        System.out.println(s1+s2);

    }
}
