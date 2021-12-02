/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import static java.io.FileDescriptor.out;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;

import javazoom.jlgui.basicplayer.BasicPlayerListener;
import static org.tritonus.share.TDebug.out;
import static org.tritonus.share.TDebug.out;
import static sun.misc.MessageUtils.out;

/**
 *
 * @author Poke
 */
// importar libreria de basic
public class Zplayer implements BasicPlayerListener{
    private PrintStream out = null;
    BasicPlayer player = new BasicPlayer();
    BasicController control = (BasicController) player;
    
    Formmp3 vp;
    
    public Zplayer(Formmp3 v){
        player.addBasicPlayerListener(this);
        vp = v;
        out = System.out;

    }
    @Override
    public void opened(Object o, Map properties) {
        display("opened : " + properties.toString());//Muestra en consola los datos del archivo abierto
    }

    @Override
    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {
        
    
    }

    @Override
    public void stateUpdated(BasicPlayerEvent bpe) {
        if (player.getStatus() == BasicPlayer.STOPPED && vp.detenido == false) {
            vp.eventobtn_sigiente();
        }
    }

    @Override
    public void setController(BasicController bc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void display(String msg) {
       //Este es el método que muestra la información en la consola
        if (out != null) {
            out.println(msg);
        }
    }

}
