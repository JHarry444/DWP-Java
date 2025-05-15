package primitives;

public class Demo {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 21;
//        byte b3 = b1 + b1;
        short s = 599;
        int i = 2_000_000;
        long l = 3434534534543535L;

        float f = 22.46F;
        double d = 22.46;

        boolean b = true;

        char c ='a';
        String str = "a"; // NOT a primitive

        String name = "Barry";
        System.out.println(name == "Barry");// not done in Java
        System.out.println(name.equals("Barry")); // so this instead

    }
}
