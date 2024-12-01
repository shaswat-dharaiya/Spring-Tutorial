package org.springproject;

public class Dev {

//    Setter Injection
    int age =8;
    int salary =8;

    private Laptop laptop;
//    private int age;

    public Dev(Laptop laptop)
    {
        this.laptop = laptop;
        System.out.println("Dev constructor");
//        System.out.println(age);
    }

    public Dev(int age, int salary)
    {
        this.age = age;
        this.salary = salary;
        System.out.println("Dev constructor");
    }

    public int getSalary() {
        return salary;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("Working on awesome project");
    }
}
