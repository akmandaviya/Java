package Static_keyword;

class Student {
    int rollNo;
    String name;
    static String college= "ABC college"; // static variable, common name

    Student (int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void printInfo () {
        System.out.println(rollNo +" "+ name +" "+ college);
    }
}
public class variable {
   public static void main(String[] args) {
    Student st1= new Student(100, "atul");
    Student st2 =new Student(101, "sanjay");

    st1.printInfo();
    st2.printInfo();
   }
}
