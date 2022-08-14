package Polymorphism;

//functions overloading

class Student {
    String name;
    int age;

    public void printInfo (String name) {
        System.out.println(name);
    }

    public void printInfo (int age) {
        System.out.println(age);
    }

    public void printInfo (String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class main {
    public static void main(String[] args) {
       Student st1 = new Student();
       st1.name = "John";
       st1.age = 20;
       
       st1.printInfo(st1.name);
       st1.printInfo(st1.age);
       st1.printInfo(st1.name, st1.age);

    
    }
}
