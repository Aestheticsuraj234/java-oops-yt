
class Student {
    String name = "Rahul";

    @Override 
    public String toString(){
        return "Student (name ='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;

        Student other = (Student) obj;
        return name.equals(other.name);
    }

}

public class School {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.equals(s2));

        
    }
}
