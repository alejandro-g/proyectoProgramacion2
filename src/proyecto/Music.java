package proyecto;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Music{

    FileInputStream FIS;
    BufferedInputStream BIS;

    public Player player;

    public long pauseLocation;
    public long songTotalLength;

    public String fileLocation;

    public void Stop() {
        if (player != null) {
            player.close();
            pauseLocation = 0;
            songTotalLength = 0;

        }
    }

    public void Pause() {
        if (player != null) {
            try {
                pauseLocation = FIS.available();
                player.close();
            } catch (IOException ex) {

            }
        }
    }

    public void Play(String Path) {
        try {
            FIS = new FileInputStream(Path);
            BIS = new BufferedInputStream(FIS);

            player = new Player(BIS);

            try {
                songTotalLength = FIS.available();
                fileLocation = Path + "";
            } catch (IOException ex) {

            }
        } catch (FileNotFoundException ex) {

        } catch (JavaLayerException ex) {

        }

        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {

                }
            }
        }.start();
    }

    public void refreshProgressBar(JProgressBar bar) {
        try {
            bar.setMaximum(FIS.available());
            System.out.println("hey");
            System.out.println(bar.getMaximum());
        } catch (IOException ex) {
            Logger.getLogger(Music.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (bar.getValue() <= bar.getMaximum()) {
            System.out.println("maximum: "+bar.getMaximum());
            System.out.println(bar.getValue());
            bar.setValue(bar.getValue() + 1);
            //activar y modificar propiedad stringPainted para que
            bar.setString(Integer.toString(bar.getValue()));
            try {
                Thread.sleep(1000);//para que se detenga por una cierta cantidad de milisegundos
            } catch (InterruptedException e) {
            }
        }

    }

    public void Resume() {
        try {
            FIS = new FileInputStream(fileLocation);
            BIS = new BufferedInputStream(FIS);

            player = new Player(BIS);

            FIS.skip(songTotalLength - pauseLocation);
        } catch (FileNotFoundException ex) {

        } catch (JavaLayerException ex) {

        } catch (IOException ex) {

        }

        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {

                }
            }
        }.start();
    }
}
