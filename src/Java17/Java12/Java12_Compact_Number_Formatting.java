package Java17.Java12;

import java.text.NumberFormat;
import java.util.Locale;

public class Java12_Compact_Number_Formatting {

    public static void main(String[] args) {
        long number = 1000000L;

        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String formattedNumber = numberFormat.format(number);

        System.out.println("Formatted Number: " + formattedNumber);
    }

}
