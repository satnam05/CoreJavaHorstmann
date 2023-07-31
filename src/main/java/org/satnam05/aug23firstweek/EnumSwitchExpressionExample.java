package org.satnam05.aug23firstweek;

enum DayofWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};

public class EnumSwitchExpressionExample {
    public static void main(String[] args) {

        DayofWeek day = DayofWeek.TUESDAY;

        String dayType = switch (day) {

            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekdays";
            case SATURDAY, SUNDAY -> "Weekends";
            default -> "Invalid Day";
        };

        System.out.println(day + " is of type " + dayType);
    }
}

