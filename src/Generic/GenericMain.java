package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        Mapper<Long, String> mapper = new CurrencyMapper();
        String map = mapper.map(12L);
        System.out.println(map);

        List<String> stringList =new ArrayList<>();


        GenericMapper<Long,String> stringMapper = new GenericMapper<>(Object::toString);
        System.out.println(stringMapper.map(120L));
        try {
            System.out.println(stringMapper.map(null));
        }catch(NullPointerException e){
            System.out.println(":)");
        }
    }
}
