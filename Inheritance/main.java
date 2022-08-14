package Inheritance;

class Shape {
    String color;

    public void area () {
        System.out.println("Print area");
    }
}

            //single level inheritence
class Triangle extends Shape {
    public void area (int l, int h) {
          System.out.println(1/2 * l * h);
    }
}

           //multi-level inheritence
class EquiTirangle extends Triangle {
    public void area (int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

//hierarchical inheritence
class Cirlce extends Shape {
    public void area (int r) {
        System.out.println((3.14) * r * r);;
    }
}
public class main {
   public static void main(String[] args) {
    Triangle t1 = new Triangle();
   
   }
}
