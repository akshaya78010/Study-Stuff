class Student{
    //instance variables
    String name;
    int age;
    //instance method
    void PrintDetails(){
        System.out.println(name+ " "+age);
    }
}
class Example1{
    public static void main(String[] args)
    {
        //object of the class 
        Student s1 = new Student();//s1 is the object of thebstuddent class
        //accesing welements through the members of the class
        s1.name = "AKSHU";
        s1.age = 18;
        s1.PrintDetails();
        Student s2 = new Student();
        s2.name = "Aishu";
        s2.age = 23;
        s2.PrintDetails();
    }
}