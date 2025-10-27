import javax.swing.JOptionPane;
/*class GUI_Development {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter yoour name");
        String outputString = "Hello "+name;
        JOptionPane.showMessageDialog(null, outputString);
    }
}*/
/* 
class point{
    int x,y;
    void printThisObject() {
        System.out.println(this);  // prints current object address
    }
}
class This {
    public static void main(String[] args) {
        point p1 = new point();
        System.out.println(p1);
        p1.printThisObject();
    }
}
*/
/*
class Employee{
    int id,salary;
    String name;
    Employee() {
       name = JOptionPane.showInputDialog("Enter your name: ");
       id = Integer.parseInt(JOptionPane.showInputDialog("Enter your ID : "));
       salary = Integer.parseInt(JOptionPane.showInputDialog("Enter your salaary : "));
       showDetails();
    }
    void showDetails() {
        String outputString = "ID : "+id+"\nName : "+name+"\nSalary : "+salary;
        JOptionPane.showMessageDialog(null, outputString,"Hello Prasanna", 2);
    }
}
 class Example4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.showDetails();
        Employee e2 = new Employee();
        e2.showDetails();  
    }
}*/
/* 
class Point{
    int x,y;
    Point(int x,int y) {
        this.x = x;
        this.y = y;
       // printPoint();
    }
    void printPoint() {
       System.out.println("("+x+","+y+")");
        
    }
}
 class Task {
    // Function with own class objects as arguments
    // Objects to functions is always call by reference in JAVA
    // Objects are always passed as references,not as values

    static void printDistance(Point p1,Point p2) {
         double distance = Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
         System.out.printf("%.2f",distance);
    }
    
    static void change(Point P){
        P.x = 100;
        P.y = 200;
    } 
    public static void main(String[] args) {
       Point p1 = new Point(3,4);
       // Point p2 = new Point(7,8);
       // printDistance(p1, p2);
       System.out.println("Before method call : ");
       p1.printPoint();
       change(p1);
       System.out.println("After Method call : ");
       p1.printPoint();
    }
}*/
class student{
    String name,branch;
    int id;
    student(String name,String branch,int id) {  // constructor
        this.name = name;  // this here is being used to distinguish local variables and instance variables
        this.branch = branch;
        this.id = id;
        print();
    }
    void print() {
        System.out.println(name+" "+branch+" "+id);
    }
}
public class ThisExample {
    public static void main(String[] args) {
        student s1 = new student("Tulasi", "CSE", 5);
        s1.print();
        
    }
}
