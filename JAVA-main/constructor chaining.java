//CONSTRUCTOR CHAINING
//3-09-24
import java.util.Scanner;
class Student{
int age;
Student(){}
Student(int age){
    this.age = age;
}//default constructor
Student(int age,String name){
 this(age);//constructor chaining
 this.name = name;
}
Student(int age,String name,String branch)
{
 this(age,name);
 this.branch = branch;
}
Student(int age,String name,String branch,char gender){
    this(age,name,branch);
    this.gender = gender;
}
void print(){
System.out.println(age + "\n" + name + "\n" + branch + "\n" + gender + "\n");
}
}
class Example1{
    Student s = new Student(18,"AKSHAYA","CSE","F");
    
}
