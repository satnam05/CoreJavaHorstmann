package org.satnam05.aug23firstweek;

public class SwitchExpressionExample {

    public static void main(String[] args) {
        int dayOfWeek = 3;

        String dayType = switch (dayOfWeek) {

            case 1, 2, 3, 4, 5 -> "Weekdays";
            case 6, 7 -> "Weekends";
            default -> throw new IllegalArgumentException("Invalid day of week");
        };

        System.out.println(dayType);
    }
}
