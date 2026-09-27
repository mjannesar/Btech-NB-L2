public class Day4 {
    public static void main(String[] args) {
        // String s1 = "Hello";
        // String s2 = "Bye";
        // String s3 = "Hello";
        // String s4 = new String("Hello");
        // String s5 = new String("Hello");
        String s1 = "Hello";
        String s2 = "Bye";
        String s3 = "Hello"+"Bye";
        String s4 = "HelloBye";
        String s5 = s1+"Bye";
        String s6 = s1+s2;
        System.out.println(s4.charAt(4));
        System.out.println(s3.equals(s6));
 // string.equals(string)
        String res1 = s1.concat(s2);
        String res2 = s2.concat(s1);

        // string.concat(string)

        System.out.println(s3 == s4); // f
        System.out.println(s4 == s5); // f
        System.out.println(s6 == s4); // f / t(nitish)
        System.out.println(s5 == s6); // f
    }
}
