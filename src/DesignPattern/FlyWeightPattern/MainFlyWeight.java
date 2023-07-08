package DesignPattern.FlyWeightPattern;

public class MainFlyWeight {
    public static void main(String[] args) {


        FlyWeightFactory factory = new FlyWeightFactory();
        MusicPlayer mp3 = factory.getMusicPlayer("MP3");
        MusicPlayer mp3_1 = factory.getMusicPlayer("MP3");
        MusicPlayer WAV = factory.getMusicPlayer("WAV");
        MusicPlayer WAV_1 = factory.getMusicPlayer("WAV");

        mp3.play("song 1");
        mp3.play("song 1");
        mp3.play("song 1");
        mp3.play("song 1");
    }
}
