import java.io.Serializable;

public class Student implements Serializable{

    private String name;
    private int age;

    public Student(){
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Main{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rahul Sharma");
        student.setAge(20);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }   
}