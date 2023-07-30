/*
This program is to test overflow situation in integer which keeps printing wrong value and how we can throw an exception for this.
 */
package org.satnam05.july23;

public class SafeIntegerArithmetic {

    public static void main(String[] args) {
        //taking a billion number of type int
        int numberInBillion = 1000000000;
        System.out.println("The billion number is " + numberInBillion);

        //overflowing the integer type number
        System.out.println("One billion times three is " + numberInBillion * 3); //overflow happened.

        //To avoid this and throw an exception which can be handled, use Math.multiplyExact method

        System.out.println("One billion times three using Math.multiplyExact method is " + Math.multiplyExact(numberInBillion, 3));
    }

}
