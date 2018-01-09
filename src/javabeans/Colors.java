package javabeans;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;

public class Colors extends Canvas implements Serializable {
    transient private Color color;
    private boolean rectangular;

    public Colors(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                change();
            }
        });
        rectangular = false;
        setSize(200, 100);
        change();
    }

    public boolean getRectagular(){
        return rectangular;
    }

    public void setRectangular(boolean flag){
        this.rectangular = flag;
        repaint();
    }

    public void change(){
        color = randomColor();
        repaint();
    }

    public Color randomColor(){
        int r = (int)(255*Math.random());
        int g = (int)(255*Math.random());
        int b = (int)(255*Math.random());
        return new Color(r,g,b);
    }

    @Override
    public void paint(Graphics g){
        Dimension d = getSize();
        int h = d.height;
        int w = d.width;
        if(rectangular){
            g.fillRect(0, 0, w-1, h-1);
        } else {
            g.fillRect(0, 0, w-1, h-1);
        }
    }
}
