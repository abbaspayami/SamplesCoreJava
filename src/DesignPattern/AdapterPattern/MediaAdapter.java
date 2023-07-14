package DesignPattern.AdapterPattern;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer player;

    public MediaAdapter(AdvancedMediaPlayer player) {
        this.player = player;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP4")) {
            player.playMP4(fileName);
        } else if (audioType.equalsIgnoreCase("AVI")) {
            player.PlayAVI(fileName);
        }
    }
}
