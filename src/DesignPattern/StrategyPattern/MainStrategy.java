package DesignPattern.StrategyPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MainStrategy {
    private static HashMap<String, CompressionStrategy> strategyHashMap;

    static {
        strategyHashMap = new HashMap<>();
        strategyHashMap.put("zip", new ZipFileStratgy());
        strategyHashMap.put("rar", new RarFileStrategy());
    }

    public static void main(String[] args) {
        String[] paths = new String[args.length - 1];
        String strategyStr = null;

        if (args.length > 2) {
            strategyStr = args[0].toLowerCase();


            List<String> stringList = Arrays.stream(args).dropWhile(s -> s.equals("zip") || s.equals("rar")).collect(Collectors.toList());
            for (int i = 0; i < paths.length; i++) {
                paths[i] = stringList.get(i);
            }


            System.out.println("Compression Strategy: " + strategyStr);

            CompressionStrategy strategy = strategyHashMap.get(strategyStr);
            if (strategy != null) {
                FileCompress compressor = new FileCompress(strategy);
                compressor.compressFile(paths);
            }else {
                throw new RuntimeException("Compression Not supported!");
            }
        }

    }

}
