class Student {
    String name;
    int rollNo;
    int marks;
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 85);
        Student s2 = new Student("Priya", 102, 92);
        s1.displayDetails();
        System.out.println("-------------------");
        s2.displayDetails();
    }
}
