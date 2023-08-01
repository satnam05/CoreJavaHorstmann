package org.satnam05.aug23firstweek;

public class BitwiseOperatorExample {

    public static void main(String[] args) {
        int num1 = 9;   // Binary: 1001
        int num2 = 5;   // Binary: 0101

        // Bitwise AND
        int resultAND = num1 & num2;  // Binary: 0001 (Decimal: 1)
        System.out.println("Bitwise AND: " + resultAND);

        // Bitwise OR
        int resultOR = num1 | num2;   // Binary: 1101 (Decimal: 13)
        System.out.println("Bitwise OR: " + resultOR);

        // Bitwise XOR
        int resultXOR = num1 ^ num2;  // Binary: 1100 (Decimal: 12)
        System.out.println("Bitwise XOR: " + resultXOR);

        // Bitwise NOT
        int resultNOT = ~num1;        // Binary: 11111111111111111111111111110110 (Decimal: -10)
        System.out.println("Bitwise NOT: " + resultNOT);

        // Left Shift
        int leftShiftResult = num1 << 2;  // Binary: 100100 (Decimal: 36)
        System.out.println("Left Shift: " + leftShiftResult);

        // Right Shift
        int rightShiftResult = num1 >> 2; // Binary: 10 (Decimal: 2)
        System.out.println("Right Shift: " + rightShiftResult);

        // Unsigned Right Shift
        int unsignedRightShiftResult = num1 >>> 2; // Binary: 10 (Decimal: 2)
        System.out.println("Unsigned Right Shift: " + unsignedRightShiftResult);
    }

}
