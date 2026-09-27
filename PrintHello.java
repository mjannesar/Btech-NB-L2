public class PrintHello {
    public static void main(String[] args) {
        int counter = 1;
        // int star = 10;
        int rows = 5;
        while(counter <= rows) {
            int cnt = 1;
            while(cnt <= counter) {
                System.out.print("*");
                cnt++;
            }

            System.out.println();
            counter++;
        }
        
    }
}
