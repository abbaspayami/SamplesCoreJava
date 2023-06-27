package DataStructure;

public class ArraySample {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 5;
        numbers[2] = 6;
        numbers[3] = 7;
        numbers[4] = 8;
//        numbers[5]=9;

        for (int number : numbers) {
            System.out.println(number);
        }


        int removeIndex = 1;
        for (int index = removeIndex; index < numbers.length - 1; index++) {
            numbers[index] = numbers[index + 1];
        }
        numbers[numbers.length - 1] = 0;
        System.out.println("-------------------");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
