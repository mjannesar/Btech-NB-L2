public class Day4 {
    public static void main(String[] args) {
//           System.out.println(5 + 10 + "Hello"+ 10 + 5 + "Bye");
// System.out.println(5 + 10 + "Hello"+ (10 + 5) + "Bye");
        // String s1 = "Hello"; //  SCP
        // String s2 = "Bye"; // SCP
        // String s3 = s1 + s2;
        // String s4 = s1.concat(s2);
        // System.out.println(s3+"  "+s4);
        // String s3 = "Hello"; // SCP (but s1 and s3 points to the same going to create only once)
        // String s4 = new String("Hello"); // outside scp
        // String s5 = new String("Hello"); // outside scp
        // // System.out.println(s1 == s2); // false
        // // System.out.println(s1 == s3); // true
        // // System.out.println(s1 == s5);// false
        // // System.out.println(s4 == s5); // false
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));
        // if(s1.equals(s3)) {
        //     System.out.println("Both are the same object");
        // }

        // System.out.println(s4.equals(s5));
        // System.out.println(s1.equals(s4));

        // == (for the reference checking) operator
        // string.equals(string) this compare actual data (method)

        // String s1 = "Hello";
        // String s2 = "Bye";
        // String s3 = "Hello"+"Bye"; //  (inside scp)
        // String s6 = "HelloBye"; //  (inside scp)
        // String s4 = s1+"Bye"; // outside scp
        // String s5 = s1 + s2; // outside scp
        // System.out.println(s3 == s4); //true
        // System.out.println(s3 == s6); // true
        // System.out.println(s3 == s4); // true
        // System.out.println(s4 == s5); // true

        String s1 = "ab";
        s1 = s1 + "c";
        for(int i = 0; i < 1lakh; i++) {
            s1 = s1 + "a";
        }

        s1 = 1lakh character
        for(int i = 0; i < 1lakh; i++) {
            s1 = s1 + "a";
        }

        StringBuilder
    }
}
