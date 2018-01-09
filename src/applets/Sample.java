package applets;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="Sample" width=300 height=50>
</applet>
*/
public class Sample extends Applet {
    String msg;

    @Override
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Inside init( ) --";
    }

    @Override
    public void start() {
        msg += " Inside start() --";
    }

    @Override
    public void paint(Graphics g){
        msg += " Inside paint().";
        g.drawString(msg, 10, 30);
    }
}
