package Generic;

public class CurrencyMapper implements Mapper<Long, String> {


    @Override
    public String map(Long item) {
        return item.toString();
    }
}
