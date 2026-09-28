
abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void work();

}
class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override 
    void work(){
        System.out.println(name + " is writing code");
    }
    
}

public class Demo {

    public static void main(String[] args) {
            Developer developer = new Developer("Suraj");

            developer.work();
    }
}
