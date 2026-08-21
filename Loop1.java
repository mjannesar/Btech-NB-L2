public class Loop1 {
    public static void main(String[] args) {
        int counter = 1;
        int star = 3;
        int rows = 7;
        while(counter <= rows) {
             int cnt = 1;
             while(cnt <= star) {
                System.out.print("*");
                cnt++;
            }
            counter++;
            System.out.println();
        }

        
    }
}
