package Classes_Objects;
//classes and objects

//class fruit taste,color,season are properies
// f1 and f2 are objects

class Fruit {
    //data
    String name;
    String color;
    String taste;
    String season;
    int price;

    //method
    public void print() {
     System.out.println("My fav fruit is: "+ " " + this.name);
    }

    public void showColor () {
        System.out.println("Color of fruit is: " + this.color);
    }

    public void printInfo () {
        System.out.println("Name of the fruit:" + " " +this.name +" " + " , color is:" + " " +this. color+ " " + ",taste is:"+ " " + this.taste 
        + " " + " ,season is:" + " " + this.season + " " + ", price is:" +this.price);
    }
}
public class main {
    public static void main(String[] args) {
        Fruit f1 = new Fruit(); //using new keyword object f1 is created and stored in heap memory.
        f1.name = "Mango";
        f1.taste = "sweet";
        f1.season = "summer";
        f1.color = "yellow";
        f1.price = 500;
        f1.showColor();
        f1.print();
        f1.printInfo();


        Fruit f2 = new Fruit();
        f2.name = "orange";
        f2.taste = "sweet, sour";
        f2.season = "winter";
        f2.color= "orange";
        f2.price= 300;
        f2.printInfo();
    }
}
