/*
If both operands are of the same numeric type (e.g., int, long, float, double, etc.), then no promotion is necessary, and the result will be of the same type as the operands.

If both operands are of different numeric types, Java performs the following steps to promote one or both operands:
a. If either operand is of type double, the other operand is promoted to double, and the result will be a double.
b. If neither operand is of type double but either operand is of type float, the other operand is promoted to float, and the result will be a float.
c. If neither operand is of type double or float but either operand is of type long, the other operand is promoted to long, and the result will be a long.
d. If neither operand is of type double, float, or long, both operands are promoted to int, and the result will be an int.

 */

package org.satnam05.july23;

public class NumericValueConversion {

    public static void main(String[] args) {

        //Example1
        int a = 5;
        double b = 3.14;
        double result = a + b; // int 'a' is promoted to double, so the result is a double
        System.out.println("Example1 : " + result); // Output: 8.14

        //Example2
        long x = 100L;
        float y = 2.5f;
        float result1 = x / y; // long 'x' is promoted to float, so the result is a float
        System.out.println("Example2 : " + result1); // Output: 40.0

        //Example3
        byte p = 10;
        short q = 5;
        int result3 = p * q; // Both 'p' and 'q' are promoted to int, so the result is an int
        System.out.println("Example3 : " + result3); // Output: 50

    }
}
