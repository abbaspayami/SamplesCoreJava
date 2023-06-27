package lamdaExpresion;

import java.util.Arrays;
import java.util.List;

public class MainLamda {

    public static void main(String[] args) {

//        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        lists.forEach((number)-> NumberUtils.evenOrOdd(number));


        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        lists.forEach(NumberUtils::evenOrOdd);
    }

}
