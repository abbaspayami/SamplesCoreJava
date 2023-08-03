package DesignPattern.Behavioral.StrategyPattern;

public class ZipFileStratgy implements CompressionStrategy{
    @Override
    public void applyCompress(String s) {
        System.out.println("ZIPFile " + s);
    }
}
