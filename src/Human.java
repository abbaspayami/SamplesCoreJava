import java.lang.ref.WeakReference;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Human implements Cloneable {
    private String name;
    private String fName;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Human(String name, String fName, Integer age) {
        this.name = name;
        this.fName = fName;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return new Human(this.name, this.fName, this.age);

        List<String> abbas = Arrays.asList("1", "2", "3");
        abbas.stream().filter(s -> s.equals("1")).findFirst();
        Supplier<List<String>> listSupplier = ArrayList::new;

        List<String> stringList = new ArrayList<>();
        List objList = new ArrayList();


        EnumMap<EnumMapTest, String> enumMap = new EnumMap<EnumMapTest, String>(EnumMapTest.class);
        enumMap.put(EnumMapTest.Nikoo, "Nikoo Baby");


        Map<String, Integer> test = new HashMap<>();
        test.put("Abbas", 1);
        test.put("riaz", 2);

        String s = "riaz";
        int sizearray = 16;
        int result = s.hashCode() % sizearray;


        Map<String, Integer> testSynchronize = Collections.synchronizedMap(test);
        testSynchronize.put("reza", 23);
        Iterator iterator = testSynchronize.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
            //process entries1
        }


        int hash = s.hashCode();



        return super.clone();
    }

    public void running() {
        System.out.println("Human running...");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", fName='" + fName + '\'' +
                ", age=" + age +
                '}';
    }
}
