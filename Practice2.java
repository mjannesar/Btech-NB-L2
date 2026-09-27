public class Practice2 {
    public static void main(String[] args) {
        // add(2,3);
        // add(4,5,5);
        

    }

    static int sum_a(int arr[]) {
        int sum= 0;
        for(int i:arr)
            sum+=i;

        return sum;
    }
    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    public static int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public static int add(int a, int b, int c, int d, int e) {
        return a+b+c+d+e;
    }

    public static int add(int a, int b, int c, int d, int e, int f) {
        return a+b+c+d+e+f;
    }
}
