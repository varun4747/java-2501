public class Student{
    String studentName;
    String studentClass;
    String studentRollno;
    int studentAge;
    double studentPercentage;


    

    public void showStudentDetails(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Class: " + studentClass);
        System.out.println("Student Roll No: " + studentRollno);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Percentage: " + studentPercentage);
    
if(studentPercentage>65){
        System.out.println(studentName + " is Promoted to next Class with Distinction");
    }else{
        System.out.println(studentName + " is Not Promoted to next Class");
    }
    

}
}