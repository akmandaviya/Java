package This_keyword;

class Student {
    String name; 
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;    //if we only write name = name  o/p => null
        this.rollNo = rollNo;  //if we only write rollNo = rollNo o/p => 0
    }
   
    public void printInfo () {
        System.out.println (name + " " + rollNo);
    }
}
public class main {
    public static void main(String[] args) {
        Student st1 = new Student("ajay", 101);
        st1.printInfo();
    }
}
