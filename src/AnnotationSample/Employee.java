package AnnotationSample;

public class Employee {
    private String name;
    private String family;

    private int age;

    public Employee(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    @Mandatory
    public String getName() {
        return name;
    }

    @Mandatory
    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }
}
