/*
When you use a larger data type in an expression with a smaller data type, you need to explicitly cast the larger type to the smaller type to avoid loss of data.
Narrowing conversions may cause data loss or precision reduction, so the compiler requires an explicit cast to ensure the programmer is aware of this potential loss.
 */
package org.satnam05.july23;

public class NarrowingConversion {
    public static void main(String[] args) {

        double doubleValue = 3.14;
        System.out.println(doubleValue);
        float floatValue = (float) doubleValue; // double explicitly cast to float
        System.out.println(floatValue);
        long longValue = (long) floatValue; // float explicitly cast to long
        System.out.println(longValue);
        int intValue = (int) longValue; // long explicitly cast to int
        System.out.println(intValue);
        short shortValue = (short) intValue; // int explicitly cast to short
        System.out.println(shortValue);
        byte byteValue = (byte) shortValue; // short explicitly cast to byte
        System.out.println(byteValue);


    }

}
