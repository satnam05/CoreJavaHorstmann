package org.satnam05.july23;

// EnumExample.java

// Defining the enum for days of the week
enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// Main class to demonstrate the use of the enum
public class EnumExample {
    public static void main(String[] args) {
        // Using the enum constants
        DayOfWeek today = DayOfWeek.MONDAY;

        // Switch statement to work with the enum
        switch (today) {
            case SUNDAY:
                System.out.println("Today is Sunday. Time to relax!");
                break;
            case MONDAY:
                System.out.println("Today is Monday. Back to work!");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Weekdays - Keep going!");
                break;
            case FRIDAY:
                System.out.println("It's Friday! Almost weekend!");
                break;
            case SATURDAY:
                System.out.println("Weekend! Time to have fun!");
                break;
        }
    }
}

