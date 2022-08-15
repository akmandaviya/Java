package Static_keyword;
class Student1 {
    int rollNo;
    String name;
    static String college = "ABC college";


    //static method
    public static void changeName () {
        college = "XYZ college";
    }

    Student1 (int r, String n) {
        rollNo = r;
        name = n;
    }

    public void printInfo () {
          System.out.println(rollNo + " " + name + " " + college); 
    }
}
public class method {
    public static void main(String[] args) {
        
        //object not required to call static method, calling by class 
        Student1.changeName(); //calling static method

        Student1 st1 = new Student1(100, "anil");
        Student1 st2 = new Student1(101, "sunil");

        st1.printInfo();
        st2.printInfo();
    }
}
