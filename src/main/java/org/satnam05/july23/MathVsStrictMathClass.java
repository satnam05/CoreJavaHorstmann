package org.satnam05.july23;

public class MathVsStrictMathClass {

    public static void main(String[] args) {

        double number = 2.0;

        System.out.println("Square root using Math class " + Math.sqrt(number));
        System.out.println("Square root using Strict Math class " + StrictMath.sqrt(number));

    }
}
