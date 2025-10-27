import java.util.Scanner;
/*Wrapper classes:
------------------
->Provides an object representation for primitive values.
->some classes in java are written in such a way that they only accept objects and not primitive values.
->to use primitive data tye values with those classes
->Wrapper classes provide object representation of every primitive dqta type we have in java .
Primitive Data type                  Corresponding Wrapper class
-------------------------------------------------------------------
int                                    Integer
float                                  Float
char                                   Character
double                                 Double
short                                  Short
long                                   Long
byte                                   Byte
Boolean                                Boolean
*/
/* 
public class WrapperClasses{
    public static void main(String args[])
    {
        ArrayList<Integer>arr1 = new ArrayList<>();
        arr1.add(10);
        arr.add(20);
        for(Integer i:arr1)
        {
            System.out.print(i + " ");
        }
        ArrayList<item>arr = new ArrayList<>();
        arr.add(new Item("laptop",7));
        arr.add(new Item("mouse",6));
        for(Item i:arr){
            System.out.println(i + " ");
        }
    }
}*/
/* Wrapper Classes :
  -> Provides an object representation for primitive values.
   ->Some classes in JAVA are written in such way they only accept objects and not primitive values.
   ->To use primitive data type values with those classes we need object representation of primitive values.
   ->Wrapper classes provide object representation of every primitive data type we have in JAVA.
->java.lang package contains wrapper classes
->along with providing the object representation for primitive values wrapper classes also provide some static utility methods  Integer.parseInt()
,Integer.toString()
   Primitive Data Type    -----    Corresponding Wrapper Class
       int                              Integer
       float                            Float
       char                             Character
       double                           Double
       short                            Short
       long                             Long
       byte                             Byte
       boolean                          Boolean
 */

/*
import java.util.ArrayList;

class Item {
    String name;
    int id;
    Item(String name,int id) {
        this.name = name;
        this.id = id;
    }
}
public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<Item>arr = new ArrayList<>();  // Works with only objects
        arr.add(new Item("Laptop",7));
        arr.add(new Item("Mouse",1));
        System.out.println(arr.size());
        for(Item it : arr) {
            System.out.println(it+" ");
        }

        ArrayList<Integer>b = new ArrayList<>();
        b.add(10);
        b.add(20);
        for(Integer it : b) {
            System.out.println(it+" ");
        }
        Integer a = 10;
        System.out.println(a);
        System.out.println(a instanceof Integer);


        String s = "I love JAVA programming";
        ArrayList<Character> vowels = new ArrayList<>();
        String v = "aeiouAEIOU";
        for(char it : s.toCharArray()) {
            if(v.contains(""+it)) {
                vowels.add(it);
            }
        }
        for (Character vowel : vowels) System.out.println(vowel);


    }
}
/* Auto-Boxing:
Automatic conversion between the primitive type and wrapper class objectthat is done by java compiler is known as autoboxing.
Ex:
int a = 10;
Integer x = a;//Auto-Boxing

Auto-Unboxing:
Automatic conversion of a wrapper class object to a primitive that is done in java compiler is known as Auto-Unboxing
Ex:
Integer x = 10;
int a = x;//Auto-Unboxing
 */
