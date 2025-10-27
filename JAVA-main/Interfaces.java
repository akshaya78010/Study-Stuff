impoprt ajva.util.Scanner;
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
/* 
class Student implements Comparable<Student>{
    String name;
    int age;
    double cgpa;
    public Student(String name,int age,double cgpa)
    {
        this.name = name;
        this.age  = age;
        this.cgpa = cgpa;
    }
    public String toString()
    {
        return "String(" + name + "," + age + ',' + cgpa + ")";
    }
    public int compareTo(String that)
    {
        if(this.age == that.age)
        {
            return this.name.compareTo(that.name);
        }
        else
        {
            return this.age.compareTo(that.age);
        }
        
    }
}
public class Interfaces{
    public static void main(){
Student students[] = {new Student("abc",21,234.67),
new Student("xry",18,345.32),new Student("jkds",19,4536.65)};
System.out.println(Arrays.toString(students));
Arrays.sort(students);
System.out.println(Arrays.toString(students));
    }
}*/

/*
 * import java.util.Scanner;
class DateOfBirth{
    int day,month,year;
    DateOfBirth(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return "\"" + day + "-" + month + "-" + "year" + "\"";
    }
}
class Employee implements Comparable<Employee>{
    String name;
    double salary;
    DateOfBirth dob;
    Employee(String name.double salary,DateOfBirth dob)
    {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }
    public String toString()
    {
        return "Employee(" + name + "," + salary + "," + dob + ")";
    }
}
class Clean{
    public static void main(String args[])
    {
        Employee e1[] = {new Employee("abc",12680,new DateOfBirth(29,3,2006)),
        new Employee("hgf",10987,new DateOfBirth(12,5,1994)),
        new Employee("abc",12680,new DateOfBirth(3,7,2009))
        ,new Employee("abc",12680,new DateOfBirth(4,9,2020));
            System.out.println(Arrays.toString(e1));
        }
}
}

    
 */