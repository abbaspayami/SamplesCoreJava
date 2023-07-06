package DataStructure.SET;

import java.util.EnumSet;

public class EnumSetExample {

    enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        EnumSet<DaysOfWeek> workingDays = EnumSet.of(DaysOfWeek.MONDAY, DaysOfWeek.TUESDAY, DaysOfWeek.WEDNESDAY, DaysOfWeek.THURSDAY, DaysOfWeek.FRIDAY);

        // Add more days to the EnumSet
        workingDays.add(DaysOfWeek.SATURDAY);
        workingDays.add(DaysOfWeek.SUNDAY);

        System.out.println("Working Days: " + workingDays);
    }

}
