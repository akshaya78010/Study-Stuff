import java.util.Scanner;
/*ARRAY OF OBJECTS OF THE CLASS
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }3

    void print_details() {
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("salary: " + salary);
    }
}

class Example {
    public static void main(String[] args) {
        // Initialize an array of 4 Employee objects
        Employee[] emp1 = {
                new Employee("John Doe", 1, 11234567),
                new Employee("Jane Smith", 2, 12345678),
                new Employee("Bob Johnson", 3, 23456789),
                new Employee("Alice Brown", 4, 34567890)
        };

        // Loop through each Employee object and print details
        for (Employee each : emp1) {
            each.print_details();
            System.out.println(); // Adds a newline for better readability
        }
    }
}
*/
//FINAL KEYWORD
/*1.)when used on a class it inhibits the inheritance in classes
2.)reassignment of variables is prohibitted
3.)overriding of methods is prohibitted
*/
//DMD(DYNAMIC METHOD DISPATCHING)
/*1)DMD only comes to the picture ,in inheritance
2)intjava,its possible to store a subclass instance in a superclass refernce
3_DYNAMIC METHOD DISPATCHING IS THE WAY THAT JAVA DECIDES ON WHICH METHOD TO INVOKE IN CASE OF THE ABOVE SCENARIO
4)JAVA DYNAMICALLY DECIDES WEATHER TO CALL A OVERRIDDEN METHOD DURING RUN TIME
5)WHICH METHOD TO BE CALLED IS BASED ON THE INSTACE TYPE NOT THE REFERENCE VARIABLE TYPE.
*/
/*
class Animal {
    void print() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {  // Dog inherits from Animal
    void print() {
        System.out.println("I am a dog");
    }
}

class Cat extends Animal {  // Cat inherits from Animal
    void print() {
        System.out.println("I am a cat");
    }
}

class Akshu {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Animal reference, Dog object
        a1.print();  // Output: I am a dog

        Animal a2 = new Cat();  // Animal reference, Cat object
        a2.print();  // Output: I am a cat
    }
}*/

/*in java,its possible to store a subclass instance in a superclass refernce
->WHEN WE DO THIS < WE WILL ONLY GET ACCESS TO ALL PARENT MEMBERS OR MEMBERS COMMON TO BOTH PARENT AND CHILD(OVERRIDDEN METHODS)
 *  ->WE CANNOT GET ACCESS TO CHILD SPECIFIC MEMBERS
 * ->THIS SITUATION CAN BE MITIGATED BY CASTING THE INSTANCE INTO IT OWN CLASS
 */
/*
class Animal {
    String name;
    void print() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {  // Dog inherits from Animal
    String breed;

    void fetch() {
        System.out.println("fetching.....");
    }

    void print() {
        System.out.println("I am a dog");
    }
}

class Cat extends Animal {  // Cat inherits from Animal
    void sleepAllDay() {
        System.out.println("zzzzzzzzz....");
    }

    void print() {
        System.out.println("I am a cat");
    }
}

class Akshu{
    static void behaviour(Animal[] animal) {  // Fixed 'Animals' to 'Animal'
        for (Animal each : animal) {
            if (each instanceof Dog) {
                ((Dog) each).fetch();
            } else if (each instanceof Cat) {
                ((Cat) each).sleepAllDay();
            } else {
                each.print();  // Default behavior for other animals (if any)
            }
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();  // Animal reference, Dog object
        ((Dog)a1).fetch();     // Calls fetch() specific to Dog
        a1.print();             // Output: I am a dog (polymorphism)

        Animal[] animal = {new Dog(), new Cat()};  // Fixed 'Animals' to 'Animal'

        Animal a2 = new Cat();  // Animal reference, Cat object
        a2.print();             // Output: I am a cat (polymorphism)

        behaviour(animal);      // Calls fetch for Dog and sleepAllDay for Cat
    }
}*/
