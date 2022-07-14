package ApnaCollege;


// define a class, constructors

/*

class Pen {                      //define a class                       //name of a class starts with a capital letter
    String color;
    String type;

    public void write() {                               //name of a function follows camel case
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);                 //'this' keyword tells the function which object is calling it
    }

    Pen() {                                             // non-parameterized constructor
        System.out.println("constructor called");       //if we don't create a constructor then java creates one by default
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    Student(String name, int age) {             //parameterized constructor
//        this.name = name;
//        this.age = age;
//    }


//    Student(Student s2) {                        //  { copy constructor
//        this.name = s2.name;
//        this.age = s2.age;
//    }
//    Student() {
//    }                                            // }
}



public class OOPS {
    public static void main(String[] args) {

//        Pen pen1 = new Pen();             //non parameterized constructor
//        pen1.color = "blue";
//        pen1.type = "gel";
//
//        Pen pen2 = new Pen();
//        pen2.color = "black";
//        pen2.type = "ballpoint";
//
//        pen1.printColor();
//        pen2.printColor();




//        Student s1 = new Student("Aman", 24);           //parameterized constructor
//        s1.printInfo();


//        Student s1 = new Student();                 // copy constructor
//        s1.name = "Aman";
//        s1.age = 24;
//
//        Student s2 = new Student(s1);
//        s2.printInfo();

    }
}
*/


/*
class Car {
    String name;
    String color;
    int engineCC;

    Car(String name, String color, int engineCC) {              //another example of parameterized constructor and copy constructor
        this.name = name;
        this.color = color;
        this.engineCC = engineCC;
        System.out.println("constructor 1 called");
        System.out.println(this.name + this.color + this.engineCC);
    }

    Car(Car car) {
        this.name = car.name;
        this.color = car.color;
        this.engineCC = car.engineCC;
        System.out.println("Constructor 2 called");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Car car1 = new Car("Santro", "white", 999);
        Car car2 = new Car(car1);
        System.out.println(car2.color);
    }
}

 */


//polymorphism

/*

class Student {
    String name;
    int age;

    void printInfo(String name) {
        System.out.println(name);
    }
    void printInfo(int age) {
        System.out.println(age);
    }
    void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vaibhav";
        s1.age = 30;

        s1.printInfo(s1.name, s1.age);
    }
}

 */


//inheritance


/*
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");           //single inheritance
    }
}
class Triangle extends Shape {
    public void area(float b, float h) {
        System.out.println(b*h/2);
    }
}
public class OOPS {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2, 9);
    }
}

 */



/*

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");       //multi level inheritance
    }
}
class Triangle extends Shape {
    public void area(float h, float b) {
        System.out.println(b*h/2);
    }
}
class EquilateralTriangle extends Triangle {
    int side;
}

 */



/*
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");           //hierarchical inheritance
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

 */


//access modifiers

/*
import java.util.Scanner;

class Account {
    public String name;                                          //->can be accessed anywhere
    protected String email;                                      //->within the package; outside only by child class/ sub class
    String rollNumber;                                           //->default-> can be accessed within the package
    private String password;                                     //->within the class

    //getters and setters for private items

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Apna College";
        a1.email = "apnacollege@gmail.com";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new password");
        a1.setPassword(sc.next());
        System.out.println(a1.name);
        System.out.println(a1.email);
        System.out.println(a1.getPassword());
    }
}

 */


//abstraction: using abstract class


/*
abstract class Animal {
    abstract void walk(); //why this statement is used?             //functions declared abstract must be used in all the child classes
    void breathe() {
        System.out.println("This animal breathes air");
    }
    void eat() {
        System.out.println("This animal eats.");
    }
    Animal() {
        System.out.println("You are about to create an Animal.");
    }
}
class Horse extends Animal {
    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}
class Chicken extends Animal {
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
public class OOPS {
    public static void main(String args[]) {
        Horse horse1 = new Horse();
        horse1.walk();
        horse1.breathe();
        horse1.eat();
    }
}

 */



//abstraction: using interfaces


/*
interface Animal {
    int eyes = 2;                                           //All the fields in interfaces are public, static and final by default
//    void walk();            //why is it used?
}

interface Herbivore {                                       //Interfaces support the functionality of multiple inheritance
    void eat();
}

class Horse implements Animal, Herbivore {
    public void walk() {                                    //All methods are public & abstract by default
        System.out.println("Horse walks on 4 legs");                //A class that implements an interface must implement all the methods declared
    }                                                               //in the interface
    public void eat() {
        System.out.println("Horse is a herbivore");
    }
}
class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
public class OOPS {
    public static void main(String args[]) {
        Horse horse1 = new Horse();
        horse1.walk();
        System.out.println("Horse has " + horse1.eyes + " eyes");
        horse1.eat();
        Chicken chicken1 = new Chicken();
    }
}

 */


/*
interface Animal {
    default void walk() {                                               //default access modifier is used
        System.out.println("Write");
    }
    default void breathe() {
        System.out.println("breathes");
    }
}
class Horse implements Animal {
    public void walk() {                                                //overrides the walk function in the method
        System.out.println("walks kilometers");
    }
}
class Elephant implements Animal {
    public void walk() {
        System.out.println("Walks");
    }
    public void fly() {
        System.out.println("flies");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        Elephant e1 = new Elephant();
        e1.walk();
    }
}

 */




//static keyword

//Static can be :
//1. Variable (also known as a class variable)
//2. Method (also known as a class method)
//3. Block
//4. Nested class


/*
class Student {
    static String school;
    String name;

    static void changeSchool() {
        school = "ABC";
    }
}
public class OOPS {
    public static void main(String args[]) {
        Student.school = "JMV";
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Meena";
        s2.name = "Beena";
        System.out.println(s1.school);
        System.out.println(s2.school);

        Student.changeSchool();
        System.out.println(s1.school);
        System.out.println(s2.school);
    }
}

 */