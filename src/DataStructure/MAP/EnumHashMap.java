package DataStructure.MAP;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMap {

    enum Color {
        RED,
        GREEN,
        BLUE
    }

    public static void main(String[] args) {
        Map<Color, String> enumMap = new EnumMap<>(Color.class);
        enumMap.put(Color.RED, "FF000");
        enumMap.put(Color.GREEN, "00FF00");
        enumMap.put(Color.BLUE, "0000FF");

        System.out.println("EnumMap: " + enumMap);
    }

}
