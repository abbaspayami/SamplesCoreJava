package DesignPattern.Behavioral.StrategyPattern;

public class RarFileStrategy implements CompressionStrategy{
    @Override
    public void applyCompress(String s) {
        System.out.println("RarFile " + s);
    }
}
