package basics_class_obj;

class A {
    int data; //member data/variable

    A(int data) {
         this.data = data; // constructor 
    }

    public void print() {
        System.out.println(data); // printing
    }
}

public class main {
    public static void main(String[] args) {
         A obj = new A(10);
         obj.print();  //accessing member function
         System.out.println(obj.data); //accessing member data/var 
    }
}

//member fucntion and data can only be accessed by object
