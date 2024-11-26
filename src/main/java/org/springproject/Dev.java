package org.springproject;

public class Dev {

//    Setter Injection
    int age =8;
//    private int age;

    public Dev()
    {
        System.out.println("Dev constructor");
        System.out.println(age);
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
