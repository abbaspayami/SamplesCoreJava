package Java17.Java13;

public class Java13_Switch_Expressions {

    public static void main(String[] args) {
        String day = "Monday";
        int dayNumber = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 1;
            case "Saturday", "Sunday" -> 2;
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println("Day Number: " + dayNumber);
    }

}
