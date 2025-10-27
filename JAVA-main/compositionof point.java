
/* 
//composition - where the objects of one calss are give  as argurments to another class
//composition is also called as "has-a" relationship
import java.util.Scanner;
class dateOfBirth{
    int day,month,year;
    dateOfBirth(int dat,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
        Public Stirng toString(){
            return day + "-"+ month+"-"+year;
        }
    }
}
class Student{
    String name,branch;
    dateOfBirth dob;
    Student(String branch,String name,dateOfBirth dob){
        this.branch = branch;
        this.name = name;
        this.dob = dob;
    }
  void print_age(){
    System.out.println(2024 - dob.year);
  }
}
class Example1{
  public static void main(String args){
    Student s1 = new Student("cse","xyz",new dateOfBirth(29,3,2006));
    s1.print_age();
  }
}
*/
/* 
import java.util.Scanner;
class Point{
    int x,y;
    Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}
class StraightLine{
    Point p1,p2;
    StraightLine(Point p1,Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    double get_length(){
        return Math.sqrt(Math.pow(p1.x-p2.x,2) + Math.pow(p2.y-p1.y));
    }
}
class Straight{
    public static void main(String args[]){
    StraightLine s1= new StraightLine(new Point(2,3),new Point(3,4));
    double length=  s1.get_length()
    System.out.printf("%.2f",length);
}
}*/
/*intheritance:A process of one class acquiring the properties of another class
->in java , we use extends keyword to perform inheritance
-class student extends person
         student                class
         child class            parent class
         sub class              super class
 */
//parent class
/* 
class Person{
    String name;
    int age;
    void introduce(){
        System.out.println("hi" + "my name is:"+ name+"\n" +age);
    }
}
//child class1
class Student extends Person{

}
//child class2
class Trainer extends Person{


}
class Student_1{
    public static void main(String args[]){
    Student s1 = new Student();
    s1.introduce();
    Trainer t1 = new Trainer();
    Person p1 =new Person();
    //inheritance is called "is-a" relationship.
//Every Student is a person
//every trainer is a person
    System.out.println(s1 instanceof Person);
    System.out.println(t1 instanceof Person);
    System.out.println(p1 instanceof Person) ;
    }
}*/
/*
 TYPES OF INHERITANCE
 1.)Single inheritance:one parent class -> on cjild class
 2.)Heirarchical inheritance:one parent ->many child classes
 3.)Multi-level Inheritance:grand parent->parent->child
 4.)hybrid inheritance
 5.)Multiple inheritance:more than one parent class over one child class
 **JAVA DOESNT SUPPORT MULTIPLE INHERITANCE
 */
class Person{
    String name;
    int age;
}
class Student extends Person{
    String id;
    String branch;
    String college;
}
class Intern  extends Student{
    String internid;
    double salary;
}
class MultilevelInheritance{
    public void main(String args[]){
Person  p1 = new Person();
Student s1 = new Student();
Intern  i1 = new Intern();
    }
}
