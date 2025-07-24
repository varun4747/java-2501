package ConditionalStatementsPrograms;
public class DiscountCalculation_Lms {
    public static void main(String[] args) {
        byte studentGrade = 12;
        int studentTutionFee = 100000;
        float studentDiscountPercentage = 0;
        boolean isAcademicTopper = true;

        if (studentGrade >= 9 && studentGrade <= 12) {
            if (isAcademicTopper == true) {
                studentDiscountPercentage = 20f;
            } else {
                studentDiscountPercentage = 10f;
            }
        } else if (studentGrade >= 6 && studentGrade <= 8) {
            studentDiscountPercentage = 5f;

        } else if (studentGrade < 6) {
            studentDiscountPercentage = 0f;

        }

        if (studentGrade == 10) {
            studentDiscountPercentage += 3f;
        } else if (studentGrade == 12) {
            studentDiscountPercentage += 5f;
        }else{
            System.out.println("Invalid grade entered.");
            return;
        }
        float discountedFee = studentTutionFee - (studentTutionFee * (studentDiscountPercentage / 100));
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student Tuition Fee: " + studentTutionFee);
        System.out.println("Student Discount Percentage: " + studentDiscountPercentage + "%");
        System.out.println("The Tution fee after the discount is: " + discountedFee);

    }
}
