import com.workintech.person.Person;
import com.workintech.person.Wall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Ahmet Can", "Yalcinkaya", 25, "black", 1.68, 62.3);
        Person person2 = new Person("Ali", "Taş", 17, "brown");
        Person person3 = new Person("İbrahim", "Akaydin");

        System.out.println("<<------------------------>>");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println("<<------------------------>>");
        System.out.println("Body mass index : " + person1.calcBodyMassIndex());
        System.out.println("First name : " + person3.getFirstName());
        System.out.println("Last name : " + person2.getLastName());
        System.out.println("Age : " + person1.getAge());
        System.out.println("Is the person teenager ? : " + person2.isTeen());
        System.out.println("Full name : " + person1.getFullName());
        System.out.println("<<------------------------>>");

        Wall wall1 = new Wall(28.7, 52.5);
        Wall wall2 = new Wall(29.94, 58.43);
        Wall wall3 = new Wall();
        // scanner for wall class
        Scanner scanner = new Scanner(System.in);

        System.out.println("<<------------------------>>");
        System.out.println("First wall details : " + wall1);
        System.out.println("Second wall details : " + wall2);
        System.out.println("Wall 3 details : " + wall3);
        System.out.println("<<------------------------>>");

        System.out.println("Width değeri giriniz : ");
        double addWidth = scanner.nextDouble();
        System.out.println(wall3.setWidth(addWidth));
        System.out.println("<<------------------------>>");

        System.out.println("Height değeri giriniz : ");
        double addHeight = scanner.nextDouble();
        System.out.println(wall3.setHeight(addHeight));
        System.out.println("Wall 3 details : " + wall3);
        System.out.println("<<------------------------>>");

        System.out.println("Get area of walls ; ");
        System.out.println("Wall 1 : " + wall1.getArea());
        System.out.println("Wall 2 : " + wall2.getArea());
        System.out.println("Wall 3 : " + wall3.getArea());
        System.out.println("<<------------------------>>");

        System.out.println("Get width of wall ; ");
        System.out.println("Wall 1 : " + wall1.getWidth());
        System.out.println("<<------------------------>>");

        System.out.println("Get height of wall ; ");
        System.out.println("Wall 1 : " + wall1.getHeight());
        System.out.println("<<------------------------>>");


        // default tests

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}