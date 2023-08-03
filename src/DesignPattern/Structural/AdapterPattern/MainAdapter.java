package DesignPattern.Structural.AdapterPattern;

public class MainAdapter {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaAdapter(new AdvancedMediaPlayer());
        mediaPlayer.play("MP4", "path1");
        mediaPlayer.play("MP4", "path1");
    }
}
