public class Student {
     String name;
     int roll;
     static int globalRoll;
    static String university = "GLA";

    Student() {
        globalRoll++;
        roll = globalRoll;
    }

    Student(String name) {
        globalRoll++;
        roll = globalRoll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Utkarsh";
        
        Student s2 = new Student("Suraj");
        System.out.println(s1.getRoll()+"  "+s2.getRoll()+"  "+s1.name+" "+s2.name);
    }
}
