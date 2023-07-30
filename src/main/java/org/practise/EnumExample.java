package org.practise;

enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {

    public static void main (String args[]){

        DaysOfWeek day = DaysOfWeek.SATURDAY;

        switch(day) {

            case SUNDAY:
                System.out.println("Its sunday. Relax");
                break;

            case MONDAY:
                System.out.println("Its Monday. Working day starts here");
                break;

            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Weekdays. Keep going");
                break;

            case FRIDAY:
                System.out.println("Its Friday. Almost Weekend");
                break;

            case SATURDAY:
                System.out.println("Its Saturday. Have fun");
                break;
        }
    }
}
