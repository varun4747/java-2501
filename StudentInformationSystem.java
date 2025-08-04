import java.util.Scanner;

import studentLMS.Student;
public class StudentInformationSystem {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the Student Information System");
        System.out.println("Please enter the student details  below");
        // Student student = new Student();
        System.out.print("Enter Student Name: ");
        String Name= scanner.nextLine();
        System.out.println("Enter Student Class: ");
        int classStudent=scanner.nextInt();
        System.out.println("Enter Student Roll No: ");
        String rollNo = scanner.next();
        System.out.println("Enter Student Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Student Percentage: ");
        double percentage = scanner.nextDouble();


        
        Student Studentobj=new Student();
        Studentobj.studentName = Name;
        Studentobj.studentClass = "Class " + classStudent;
        Studentobj.studentRollno = rollNo;
        Studentobj.studentAge = age;
        Studentobj.studentPercentage = percentage;
        System.out.println("\nStudent Details:");
        Studentobj.showStudentDetails();
    }
}




