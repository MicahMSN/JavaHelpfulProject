package applets;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="SimpleBannerAppletExample" width=300 height=50>
</applet>
*/
public class SimpleBannerAppletExample extends Applet implements Runnable{
    String msg = "A Simple Moving Banner.";
    Thread t = null;
    int state;
    volatile boolean stopFlag;

    @Override
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    @Override
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    @Override
    public void run() {
        for(;;){
            try{
                repaint();
                Thread.sleep(250);
                if(stopFlag){
                    break;
                }
            } catch (InterruptedException e) {
            }
        }
    }

    @Override
    public void stop() {
        stopFlag = true;
        t = null;
    }

    @Override
    public void paint(Graphics g) {
        char ch;

        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
