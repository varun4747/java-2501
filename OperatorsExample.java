public class OperatorsExample {
    public static void main(String[] args) {

        // Arithmetic Operators
        byte a = 10;
        byte b = 20;
        int result = a + b; // Implicit type conversion from byte to int
        int result2 = a - b;
        int result3 = a * b;
        int result4 = a / b;
        System.out.println("Result: " + result);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
        System.out.println("Result4: " + result4);
        // increment and decrement operators
        int q = 5;
        int w = ++q; // Pre-increment
        int e = q++; // Post-increment
        System.out.println("q: " + q);
        System.out.println("w: " + w);
        System.out.println("e: " + e);

        int dec = 10;
        int dec2 = --dec; // Pre-decrement
        int dec3 = dec--; // Post-decrement
        System.out.println("dec: " + dec);
        System.out.println("dec2: " + dec2);
        System.out.println("dec3: " + dec3);

        // assignment operators
        int Assignment = 10;
        Assignment += 5; // Assignment with addition
        System.out.println("Assignment: " + Assignment);
        Assignment -= 3; // Assignment with subtraction
        System.out.println("Assignment: " + Assignment);
        Assignment *= 2; // Assignment with multiplication
        System.out.println("Assignment: " + Assignment);
        Assignment /= 4; // Assignment with division
        System.out.println("Assignment: " + Assignment);
        Assignment %= 4; // Assignment with modulus
        System.out.println("Assignment: " + Assignment);
        System.out.println("Assignment after all operations: " + Assignment);

        // Relational Operators

        int num = 10;
        int num2 = 5;
        boolean isEqual = (num == num2); // Equality operator
        boolean isNotEqual = (num != num2); // Not equal operator
        boolean isGreater = (num > num2); // Greater than operator
        boolean isLess = (num < num2); // Less than operator
        boolean isGreaterOrEqual = (num >= num2); // Greater than or equal to operator
        boolean isLessOrEqual = (num <= num2); // Less than or equal to operator
        System.out.println("isEqual: " + isEqual);
        System.out.println("isNotEqual: " + isNotEqual);
        System.out.println("isGreater: " + isGreater);
        System.out.println("isLess: " + isLess);
        System.out.println("isGreaterOrEqual: " + isGreaterOrEqual);
        System.out.println("isLessOrEqual: " + isLessOrEqual);

        // Logical Operators
        int number = 10;
        int number2 = 5;
        int number3 = 15;
        boolean andCondition = (number > number2) && (number < number3); // Logical AND operator
        boolean orCondition = (number < number2) || (number < number3); // Logical OR operator
        boolean notCondition = !(number < number2); // Logical NOT operator
        System.out.println("andCondition: " + andCondition);
        System.out.println("orCondition: " + orCondition);
        System.out.println("notCondition: " + notCondition);

        // Bitwise Operators
        int bitwiseA = 5; // 0101 in binary
        int bitwiseB = 3; // 0011 in binary
        int bitwiseAnd = bitwiseA & bitwiseB; // Bitwise AND operator
        System.out.println("bitwiseAnd: " + bitwiseAnd);
        int bitwiseOr = bitwiseA | bitwiseB; // Bitwise OR operator
        System.out.println("bitwiseOr: " + bitwiseOr);
        int bitwiseXor = bitwiseA ^ bitwiseB; // Bitwise XOR operator
        System.out.println("bitwiseXor: " + bitwiseXor);
        int bitwiseNot = ~bitwiseA; // Bitwise NOT operator
        System.out.println("bitwiseNot: " + bitwiseNot);
        int leftShift = bitwiseA << 1; // Left shift operator
        System.out.println("leftShift: " + leftShift);
        int rightShift = bitwiseA >> 1; // Right shift operator
        System.out.println("rightShift: " + rightShift);
        int unsignedRightShift = bitwiseA >>> 1; // Unsigned right shift operator
        System.out.println("unsignedRightShift: " + unsignedRightShift);

    }
}
