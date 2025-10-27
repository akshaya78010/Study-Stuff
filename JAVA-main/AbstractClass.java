import java.util.Scanner;
//ABSTRACT CLASS
//--------------
/*1)abstract class cannot be instantiated
2)adding abstract keyword makes a class abstract class
3)abstract classes may have abstract method.
    4)abstract method is a method without implementation
    5)abstract classses act as a parent for  other classes
    6)any,class which is a child class of an abstract class must implement abstract methods (if any) in the parent class
    7)abstract classes can also have concrete methods (Methods with implementation);
        abstract class
        8)if a class contains atleast one abstract method , it should be declared as an abstact class.
        9)if a child class of an abstract c;ass fail to provide implementation of one or more abstract methods, then the child class also must be made a abstract class
     */
    /* 
    abstract class Animal1{
        String name ;
        int age;
       abstract void make_sound();
    }
    class Cat1 extends Animal1{
        void make_sound()
        {
            System.out.println("meow");
        }
    }
    class Dog1 extends Animal1{
        void make_sound()
        {
            System.out.println("Woof");
        }
    }
    class Abstract_classes {
        public static void main(String args[])
        {
            Cat1 c1 = new Cat1();
            c1.make_sound();
        }
    }*/
    /* 
    abstract class Shape {  
        double area, perimeter;  
    
        abstract void calculateArea();  
        abstract void calculatePerimeter();  
    
        void printArea() {  
            System.out.println(area);  
        }  
    
        void printPerimeter() {  
            System.out.println(perimeter);  
        }  
    }  
    
    class Square extends Shape {  
        int side;  
    
        void calculateArea() {  
            area = side * side;  
        }  
    
        void calculatePerimeter() {  
            perimeter = 4 * side;  
        }  
    }  
    class Rectangle extends Shape{
        int length,width;
    void calculateArea()
    {
        area = length * width;
    }
    void calculatePerimeter()
    {
        perimeter = 2*(length + width);
    }
    }
    public class AbstractClass {  
        public static void main(String[] args) {  
            Square s1 = new Square();  
            Rectangle r1 = new Rectangle();
            r1.length = 1;
            r2.length = 2;
            s1.side = 10;  
            s1.calculateArea();  
            s1.printArea();  
            r1.calculateArea();
            r1.printArea();
            r1.calculatePerimeter();
            r1.printPerimeter();
        }  
    }*/
    /* 
    abstract class Bank{
        String name;
        String ifsccode;
        abstract String getName();
        abstract String getIfsccode();
    }
    abstract class Canara extends Bank{
        String getName(){
           return name;
        }
    }
    class Canarasurampalem extends Canara{
        String getIfsccode(){
         return ifsccode;
        }
    }
    class Abstract_classes{
        public static void main(String[] args){
        Canarasurampalem c1 = new Canarasurampalem();
        c1.name = "canara";
        c1.ifsccode = "cnb";
System.out.println(c1.name);
System.out.println(c1.ifsccode);
    }
}*/
/*Interfaces:-
1.interfacaes in java are created using a keyword "interface".
2.interface itself are abstract,every method that we declare inside an interface is by default public abstract.
3.interface can only have *abstract methods ,methods implementation.
4.a class acan implements the interface using a "implements" keyword
5.when a class implements a particular interface it should provide concrete implementation for the abstract methods present in the interface
6.with this feature we can ensure the uniformity between the classes that implement the same interface 
7.if the class fails to implement one or more methods of an interface the class itself must be made as an abstract class.
8.it is not possible to create the instances of interface ,however it is possible to store the instace of a class which is implementing interface insede an interface refrence variable.
9.but doing this makes us use the methods sspecicfic to that inetrface.
*/
/**
 * AbstractClass
 */
/* 
public interface Factorial {

    public int fact(int n);
}
class Main1 implements Factorial{
    public int fact(int n)
    {
        int i = 1; 
        int f =1;
        for(i = 1 ; i <= n ; i++)
        {
            f = f * i;
        }
        return f;
    }
}
class Main2 implements factorial{
    public int fact(int n)
   {
    if(n == 1)
    {
        return 1;
    }
    return n * fact(n-1);
   } 
}
public class AbstractClass {
 public static void main(String args[]){
    Main1 m1 = new Main1();
    int res1 = m1.fact(4);
    System.out.println(res1);
    Main2 m2 = new Main2();
    int res2 = m2.fact(4);
    System.out.println(res2);
 }
}*/
/**
 * AbstractClass
 */
/* 
interface A{
    void method1();
}
interface B{
    void method2();
}
class x implements A,B{
   void method1()
   {
    System.out.println("this is method 1");
   }
   void method2()
   {
    System.out.println("this is method 2");
   }
}
class AbstractClass{
    public static void main(String args[])
    {
            //reference variable for interface  can store an instance of the class imlementin the interface
            A obj = new x();
            obj.method1();
            obj.method2();
    }
}*/
/*
 EXAMPLES IN INTERFACTES
 MouseListeners from java.awt.event package
 ResultSet from ajav.sql package
 comparable fron java,lang package
 */

    