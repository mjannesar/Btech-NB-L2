public class Static {
    static String name;
    String uid;

    public static void main(String[] args) {
        Static l1 = new Static();
        l1.name = "Mehul Sirji";
        System.out.println(l1.name);

        Static l2 = new Static();
        l2.name = "Ananya";
        System.out.println(l2.name+"  "+l1.name);
    }
}
