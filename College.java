class Student {
    static String college = "Amity Noida";
    String name;

   
}

class Mathutils {

    static int add (int a,  int b){
        return a+b;
    }
}

class Database {
    static {
        System.out.println("Initializing database...");
    }
}

class Outer {
    static class Inner {
        void show(){
            System.out.println("Hello");
        }
    }
}

final class Animal {
   final  void eat(){
        System.out.println("Eating");
    }
}

class Dog  {


    void eat(){
        System.out.println("Dog is eating");
    }
}
public class College {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // Student s2 = new Student();

        // s1.name = "Suraj";
        // s2.name = "Hitesh Sir";

        // System.out.println(Student.college);

        // int result = Mathutils.add(10, 20);

        // System.out.println(result);

        // Outer.Inner obj = new Outer.Inner();

        // obj.show();

      final int age = 22;

        System.out.println(age);
    }
}
