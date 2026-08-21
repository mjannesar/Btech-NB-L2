public class L2 {
    public static void main(String[] args) {
        // byte b = (byte)128;
        byte b = 5;
        //  byte c = (byte)(b + 1);
        // byte c = b+1; // type mismatch from int to byte
        //  byte c = b++;
        byte c = ++b; // byte c = (byte) (b+1)
        System.out.println(c);
    }
}
