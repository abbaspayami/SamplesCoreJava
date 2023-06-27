import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Laptop> laptopList = new ArrayList<>();
//        laptopList.add(new Laptop("Dell", 32, 800));
//        laptopList.add(new Laptop("Apple", 64, 1200));
//        laptopList.add(new Laptop("Asus", 16, 1000));

//        Comparator<Laptop> con = (o1, o2) -> {
//            if (o1.getPrice() > o2.getPrice())
//                return 1;+
//            else
//                return -1;
//        };

        // comparable
//        Collections.sort(laptopList);
//        Collections.sort();
        //comparator
//        Collections.sort(laptopList, con);

        for (Laptop l : laptopList) {
            System.out.println(l);
        }

    }
}
