class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Teacher extends Person {
    String subject;
    double salary;
    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
        System.out.println("Teacher constructor called");
    }
    void displayTeacher() {
        super.displayPerson();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: ₹" + salary);
    }
}
public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Anita", 35, "Mathematics", 45000);
        t1.displayTeacher();
    }
}
