import java.util.Scanner;

class DateOfBirth {
    int day, month, year;

    DateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}

class Student {
    String name, branch;
    DateOfBirth dob;

    Student(String branch, String name, DateOfBirth dob) {
        this.branch = branch;
        this.name = name;
        this.dob = dob;
    }

    void printAge() {
        System.out.println(2024 - dob.year);
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Date of Birth: " + dob.toString());
    }
}

class Example1 {
    public static void main(String[] args) {
        Student s1 = new Student("CSE", "XYZ", new DateOfBirth(29, 3, 2006));
        s1.printAge();
        s1.printDetails();
    }
}
