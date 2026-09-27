public class Calculation {
    public static void main(String[] args) {

        // Calculation obj = new Calculation();
        // int res1 = obj.add(2,3,4);
        // int res2 = obj.add(2, 5);

        add(2,5);
        add(2,3,4);
    }

    public static int add(int a, int b) {
        return a+b;
    }

     public static int add(int a, int b, int c) {
        return a+b;
    }

    // public double add(int a, int b) {
    //     return a+b;
    // }
}