//composition - where the objects of one calss are give  as argurments to another class
//composition is also called as "has-a" relationship
//interface task
import java.util.Scanner;
import java.util.Arrays;
class DateOfBirth{
    int day,month,year;
    DateOfBirth(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return "\"" + day + "-" + month + "-" + year + "\"";
    }
}
class Employee implements Comparable<Employee>{
    String name;
    double salary;
    DateOfBirth dob;
    Employee(String name,double salary,DateOfBirth dob)
    {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }
    public String toString()
    {
        return "Employee(" + name + "," + salary + "," + dob + ")";
    }
    public int compareTo(Employee that) {
        if(this.dob.year ==  that.dob.year)
        {
            if(this.dob.month == that.dob.month)
            {
                if(this.dob.day == that.dob.day)
                {
                    return this.name.compareTo(that.name);
                }
                else {
                    return this.dob.day - that.dob.day;
                }
            }
            else {
                return this.dob.month - that.dob.month;
            }
        }
        else {
            return this.dob.year - that.dob.year;
        }
    }
}
class clean {
    public static void main(String[] args)
    {
        Employee[] e1 = {new Employee("abc",12680,new DateOfBirth(29,3,2006)),
                new Employee("hgf",10987,new DateOfBirth(12,5,1994)),
                new Employee("abc",12680,new DateOfBirth(3,7,2009))
                ,new Employee("abc",12680,new DateOfBirth(4,9,2020))};
        System.out.println(Arrays.toString(e1));
        Arrays.sort(e1);
        System.out.println(Arrays.toString(e1));
    }
}


