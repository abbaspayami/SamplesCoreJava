import java.util.Objects;

public final class ImmutableClass implements Cloneable{

    private final Integer id;
    private final String name;
    private final int age;

    public ImmutableClass(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ImmutableClass that = (ImmutableClass) o;
        return age == that.age && id.equals(that.id) && name.equals(that.name);
    }

    @Override
    public int hashCode() {

        final int prime = 31;

        int result = 1;

        result = prime * result + ((name == null) ? 0 : name.hashCode());

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        result = prime * result + age;

        return result;

    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
