package org.satnam05.aug23firstweek;

public class MultipleLabelSwitchExpression {

    public static void main(String[] args) {

        String day = "Gon";

        String dayType = switch (day){

            case "Mon", "Tue", "Wed", "Thur", "Fri" -> "Weekdays";
            case "Sat", "Sun" -> "Weekends";
            default -> "Invalid Day";
        };

        System.out.println(dayType);

    }
}
