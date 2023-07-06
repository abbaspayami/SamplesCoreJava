package StaticClass;

public class Person {

    private static int count = 0;
    private String name;

    public Person(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
