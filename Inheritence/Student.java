package Inheritence;
// import java.util.Scanner;

public class Student extends Person {

    
    //static variables
    static String InstituteName;
    static String courseName;
    static double globalDiscount;
    static{
        InstituteName="E-learn";
        courseName="java Fs";
        globalDiscount=1.0;
    }
    String StudentDescription;
    double courseFee; 

    public Student(){}
    public Student(int StudentId,String StudentName,int StudentAge,long StudentMobile,String StudentDescription,double courseFee){
         super(StudentId,StudentName,StudentAge,StudentMobile);
         this.StudentDescription=StudentDescription;
         this.courseFee=courseFee;
    }
    public void displayStudent(){
        System.out.println("======Student info======");
        System.out.println("StudentID: " +PersonId);
        System.out.println("Student Name: " + PersonName);
        System.out.println("Student Age: " + PersonAge);
        System.out.println("Student Mobile: " + PersonMobile);
        System.out.println("student description: "+StudentDescription);
        System.out.println("course fee: " +courseFee);
    }
    public static void main(String[] args) {
        Person obj=new Person(01,"Varun",23,756475647);
        Student obj1=new Student(01,"jhon",56,76543213,"good",56000.00);
       obj.display();
       obj1.displayStudent();
       System.out.println(InstituteName);
       
    }


}
