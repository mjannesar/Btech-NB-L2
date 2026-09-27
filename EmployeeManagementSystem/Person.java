package EmployeeManagementSystem;

public abstract class Person {
    String name;
    double salary;

    Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    
    Person(String name, double salary, boolean b) {
        this.name = name;
        this.salary = salary;
    }

    public void login(){
        System.out.println("Login....");
    }

    public void logout(){
        System.out.println("Logout....");
    }

    public abstract void work();
}
