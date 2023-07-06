package StaticClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainStaticTest {
    public static void main(String[] args) {

        List<Person> listPerson = new ArrayList<>();

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        for (int i = 0; i < randomNumber; i++) {
            listPerson.add(new Person("Abbas" + i));
        }

        System.out.println(Person.getCount());

    }
}
