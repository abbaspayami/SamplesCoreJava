package Java17;

import java.text.NumberFormat;
import java.util.Locale;

public class Java12NumberFormat {
    public static void main(String[] args) {
        long number = 1_500_000_000;

        NumberFormat compactFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String formattedNumber = compactFormat.format(number);

        System.out.println("Formatted number: " + formattedNumber);
    }

}
