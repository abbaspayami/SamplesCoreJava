package DesignPattern.Structural.FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    Map<String, MusicPlayer> MusicTypeMap = new HashMap<>();

    public MusicPlayer getMusicPlayer(String musicType) {

        if (MusicTypeMap.containsKey(musicType)) {
            return MusicTypeMap.get(musicType);
        } else {
            MusicPlayer musicPlayer = new ConcreteMusicPlayer(musicType);
            MusicTypeMap.put(musicType, musicPlayer);
            return musicPlayer;
        }

    }

}
