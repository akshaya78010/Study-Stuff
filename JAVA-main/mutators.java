//28-08-24
//example -1:
import java.util.Scanner;
/* 
class Rectangle {
    int length;
    int breadth; // instance variables

    // Setter method - used to set values to instance variables
    void setLengthAndBreadth(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to print the area and perimeter of the rectangle
    void printAreaPerimeter() {
        System.out.println("Area is: " + (length * breadth));
        System.out.println("Perimeter is: " + 2 * (length + breadth));
    }
}

class SetterMethods {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Create the first Rectangle object
        Rectangle r1 = new Rectangle();
        System.out.println("Enter length and breadth for first rectangle:");
        int length1 = scanner.nextInt();
        int breadth1 = scanner.nextInt();
        r1.setLengthAndBreadth(length1, breadth1);
        r1.printAreaPerimeter();

        // Create the second Rectangle object
        Rectangle r2 = new Rectangle();
        System.out.println("Enter length and breadth for second rectangle:");
        int length2 = scanner.nextInt();
        int breadth2 = scanner.nextInt();
        r2.setLengthAndBreadth(length2, breadth2);
        r2.printAreaPerimeter();

        // Close the Scanner object
        scanner.close();
    }
}*/
//task -2
/*  
class Student{
    String roll,name,gender;
   int age,passOutYear;
   Double cgpa;
  void read(String rol,String nam,String gend,int ag,int passout,Double gpa)
   {
    roll = rol;
    name = nam;
    gender = gend;
    age = ag;
    passOutYear = passout;
    cgpa = gpa;
   }
void print()
{
    System.out.println("roll no:" + roll);
    System.out.println("name:"+ roll);
    System.out.println("genfder:" + gender);
    System.out.println("age:"+age);
    System.out.println("pass out year:" + passOutYear);
    System.out.println("cgpa:" + cgpa);
}
}
class Stud{
    public static void main(String args[])
    {
        Student s1 = new Student();
      s1.read("23A91A05G8","AKSHU","FEMALE",18,2027,9.15);
      s1.print();
      Student s2 = new Student();
      s1.read("23A91A05E5","Aishu","FEMALE",18,2027,9.38);
      s2.print();
     
}
}*/
/* 
class Cat{
    String name;
    int age;
}
class CatInfo{
public static void main(String args[])
{
    Cat c1 = new Cat();
    System.out.println(c1 instanceof Cat);
    System.out.println(c1 instanceof Object);
}
}*/
/*
class Dog{
    String name;
    int age;
    public String toString(){
        return "Dog:(" + name +","+ age+")";
    }
    void set(String nam,int ag)
    {
        name = nam;
        age = ag;
    }
}
class DogData{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1.set("bob",7);
        System.out.println(d1);
    }
}*/
//CONSTRUCTOR
/* -> is used to construct an object while ceating the object
->constructor is a special method
->is used to initialize the instance variables with values ,while creating the object.
 ->constructors should have same name as class
 ->constructor shouls not have a return type
 // TYPES OF CONSTRUCTORS
 ->default constructor
 ->parameterized constructor
 ->copy constructor
 ->every class class will jave a default constructor which will be triggered upon creation of the object of the class
 */
class Cat{
    String name;
    int age;
    //default constructor
    Cat(){
        System.out.println("Hey you created an instance of this class");
    }
}
class CatInfo{
public static void main(String args[])
{
    Cat c1 = new Cat();
    Cat c2 = new Cat();
    Cat c3 = new Cat();
 System.out.println(c1 instanceof Cat);
    System.out.println(c1 instanceof Object);
}
}
/*
class Cat{
    String name;
    int age;
    //default constructor
    Cat(String name,int age){
        System.out.println("name:" + name +" "+ "age:" + age);
    }
}
class CatInfo{
public static void main(String args[])
{
    Cat c1 = new Cat("della",6);
    Cat c2 = new Cat("nick",8);
    Cat c3 = new Cat("lanie",9);
}
}*/
/* 
class Cat{
    String name;
    int age;
    //default constructor
    Cat(){
        System.out.println("with no parameter");
    };
    Cat(String nam){name= nam;
    System.out.println("name is:" + name);}
    Cat(String nam,int ag){
        name = nam;
        age = ag;
        System.out.println("name :"+ name + "age:" + age);
    }
}
class CatInfo{
public static void main(String args[])
{
    Cat c1 = new Cat();
    Cat c2 = new Cat("nick");
    Cat c3 = new Cat("lanie",29);
}
}*/
/* 
class BankAccount{
    int balanceAmount;
    BankAccount(){};
   BankAccount(int initialAmount)
   {
    balanceAmount = initialAmount;
    System.out.println("your bank balance :"+balanceAmount);
   }
   void print()
   {
    System.out.println("you bank balance is:"+ balanceAmount);
   }
}
class Bank{
    public static void main(String args[])
    {
        BankAccount Account1 = new BankAccount(500);
        BankAccount Account2 = new BankAccount();
    }
}*/