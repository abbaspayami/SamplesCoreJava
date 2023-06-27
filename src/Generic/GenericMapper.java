package Generic;

import java.util.function.Function;

public class GenericMapper<T extends Long, R> implements Mapper<T, R> {

    private Function<T, R> method;
    private R value;

    public GenericMapper(Function<T, R> method) {
        this.method = method;
    }

    @Override
    public R map(T item) {
        if (item == null) {
            throw new NullPointerException();
        }

        value = this.method.apply(item);
        return value;
    }

    public R getValue() {
        return value;
    }

    public void setValue(R value) {
        this.value = value;
    }
}
