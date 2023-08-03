package DesignPattern.Behavioral.StrategyPattern;

public class FileCompress {

    CompressionStrategy compressionStrategy;

    public FileCompress(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compressFile(String... files){
        for (String file : files) {
            compressionStrategy.applyCompress(file);
        }
    }

}
