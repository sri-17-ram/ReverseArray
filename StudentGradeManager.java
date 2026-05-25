import java.util.Scanner;
class Student{
    String name;
    int rollNo;
    int marks1,marks2,marks3;

    int calculateTotalMarks(){
        return marks1 + marks2 + marks3;
    }

    double calculateAverageMarks(){
        return calculateTotalMarks() / 3.0;
    }

    String calculateGrade(){
        double average = calculateAverageMarks();
        if(average >= 90){
            return "A";
        } else if(average >= 80){
            return "B";
        } else if(average >= 70){
            return "C";
        } else if(average >= 60){
            return "D";
        } else {
            return "F";
        }
    }

    void displayStudentDetails(){
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Average Marks: " + calculateAverageMarks());
        System.out.println("Grade: " + calculateGrade());
    
    }
public class StudentGradeManager{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        student.rollNo = sc.nextInt();

        System.out.print("Enter marks for subject 1: ");
        student.marks1 = sc.nextInt();

        System.out.print("Enter marks for subject 2: ");
        student.marks2 = sc.nextInt();

        System.out.print("Enter marks for subject 3: ");
        student.marks3 = sc.nextInt();

        student.displayStudentDetails();
        }
    }

}