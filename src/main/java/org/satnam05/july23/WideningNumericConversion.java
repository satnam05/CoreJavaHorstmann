package org.satnam05.july23;
/*
When you use a smaller data type in an expression with a larger data type, the smaller type is automatically promoted to the larger type.
No explicit casting is required for widening conversions as it is done automatically by the compiler.
The order of widening conversions is byte -> short -> int -> long -> float -> double.
 */
public class WideningNumericConversion {

    public static void main(String[] args) {

        int intValue = 10;
        System.out.println(intValue);

        long longValue = intValue; // int is automatically promoted to long
        System.out.println(longValue);

        float floatValue = longValue; // long is automatically promoted to float
        System.out.println(floatValue);

        double doubleValue = floatValue; // float is automatically promoted to double
        System.out.println(doubleValue);

    }
}
