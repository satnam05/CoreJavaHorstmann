package org.satnam05.aug23firstweek;

public class ConditionalOperator {
    public static void main(String[] args) {

        //Adult Minor condition
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("The person is a " + result);

        //Odd even numbers
        int number = 7;
        String parity = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + parity);
    }

}
