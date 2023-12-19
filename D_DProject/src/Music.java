import javax.sound.sampled.*;

public class Music {
    private Clip clip;
    private int pause;


    /*
        ATENZIONE: é assim que tem que ser chamado
        Music start = new Music("musica.wav");
        start.play();
     */

    public void griffinNeutral2 (){
        Music start = new Music("featherinstorm.wav");
        start.play();
    }

    public void griffinNeutral3 (){
        Music start = new Music("griffinsscreech.wav");
        start.play();
    }

    public void griffinNeutral4 (){
        Music start = new Music("gustofwind.wav");
        start.play();
    }

    public void griffinNeutral5 (){
        Music start = new Music("afeatheredsymphony.wav");
        start.play();
    }

    public void griffinAnger1 (){
        Music start = new Music("griffinsoars.wav");
        start.play();
    }

    public void griffinAnger2 (){
        Music start = new Music("feelthemight.wav");
        start.play();
    }

    public void griffinAnger3 (){
        Music start = new Music("skyroaring.wav");
        start.play();
    }

    public void griffinAnger4 (){
        Music start = new Music("talongust.wav");
        start.play();
    }

    public void griffinAnger5 (){
        Music start = new Music("featherfrenzy.wav");
        start.play();
    }

    public void griffinSeduce1(){
        Music start = new Music("aerialonslaugth.wav");
        start.play();
    }

    public void griffinSeduce2(){
        Music start = new Music(".wav");
        start.play();
    }

    public void griffinSeduce3(){
        Music start = new Music("stormthatsweeps.wav");
        start.play();
    }

    public void griffinSeduce4(){
        Music start = new Music("lovesoarshigh.wav");
        start.play();
    }

    public void griffinSeduce5(){
        Music start = new Music("inthefeatheredembrace.wav");
        start.play();
    }

    public Music(String musicFile) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(musicFile));
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
