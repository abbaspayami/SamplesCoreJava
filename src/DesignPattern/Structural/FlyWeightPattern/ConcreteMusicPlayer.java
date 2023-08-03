package DesignPattern.Structural.FlyWeightPattern;

public class ConcreteMusicPlayer implements MusicPlayer{

    private String musicType;

    public ConcreteMusicPlayer(String musicType) {
        this.musicType = musicType;
    }

    @Override
    public void play(String song) {
        System.out.println("Playing " + song + " ON" + musicType);
    }
}
