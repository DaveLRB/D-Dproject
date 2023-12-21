import javax.sound.sampled.*;
import java.io.InputStream;
import java.util.Objects;

public class Music {
    private Clip clip;
    private int pause;

    /*
        ATENZIONE: é assim que tem que ser chamado
        Music start = new Music("musica.wav");
        start.play();
     */

    public Music(String musicFile) {
        try {
            if (musicFile == null) {
                throw new IllegalArgumentException("Music file cannot be null");
            }

            InputStream inputStream = getClass().getResourceAsStream(musicFile);
            if (inputStream == null) {
                throw new IllegalArgumentException("Unable to load music file: " + musicFile);
            }

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void play() {
        if (clip != null && !clip.isRunning()) {
            clip.start();
        }
    }

    public void stop() {
        if (clip != null && clip.isRunning()) {
            clip.close();
            clip.setFramePosition(0);
            clip = null;
        }
    }

    public void pause() {
        if (clip != null && clip.isRunning()) {
            pause = clip.getFramePosition();
            clip.stop();
        }
    }

    public void unpause() {
        if (clip != null && !clip.isRunning()) {
            clip.setFramePosition(pause);
            clip.start();
        }
    }
}
