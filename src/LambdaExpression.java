import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaExpression {

    public static void main(String[] args) {
        List<String> a = Arrays.asList("Abbas", "Riaz", "Carla");
        Function<String, String> test = s -> s + " ";
        a.stream().filter(b -> b.equals("Abbas")).forEach(System.out::println);
    }


}
