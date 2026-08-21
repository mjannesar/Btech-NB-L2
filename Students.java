public class Students {
    String name;
    int roll;

    static int globalRoll;

    Students() {
        globalRoll++;
        roll = globalRoll;
    }

    public static int getTotalStudents() {
        return globalRoll;
    }

    public static void main(String[] args) {
        Students s1 = new Students();

        Students s2 = new Students();
        Students s3 = new Students();
        Students s4 = new Students();

        System.out.println(s1.roll+"  "+s2.roll+"  "+s3.roll+"  "+s4.roll);
        System.out.println(getTotalStudents());
        // System.out.println(++s1.roll +"  "+(++s2.roll)+" "+(++s3.roll));
    }
}
