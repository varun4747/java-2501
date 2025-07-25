package ConditionalStatementsPrograms;

public class Discount_UsingSwitch {
    public static void main(String[] args) {
        byte studentGrade = 12;
        int studentTutionFee = 100000;
        float studentDiscountPercentage = 0;
        boolean isAcademicTopper = true;

        switch (studentGrade) {
            case 9:
            case 10:
            case 11:
            case 12:
                if (isAcademicTopper) {
                    studentDiscountPercentage = 20f;
                } else {
                    studentDiscountPercentage = 10f;
                }

                if (studentGrade == 10) {
                    studentDiscountPercentage += 3f;
                } else if (studentGrade == 12) {
                    studentDiscountPercentage += 5f;
                }
                break;

            case 6:
            case 7:
            case 8:
                studentDiscountPercentage = 5f;
                break;
            default:
                if (studentGrade < 6) {
                    studentDiscountPercentage = 0f;
                } else {
                    System.out.println("Invalid grade entered.");
                    return;

                }
                break;

        }
        float discountedFee = studentTutionFee - (studentTutionFee * (studentDiscountPercentage / 100));
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student Tuition Fee: " + studentTutionFee);
        System.out.println("Student Discount Percentage: " + studentDiscountPercentage + "%");
        System.out.println("The Tuition fee after the discount is: " + discountedFee);

    }
}
