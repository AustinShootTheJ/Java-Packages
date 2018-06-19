package com.austinshootthej;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdditionalWindow extends Frame {
    public AdditionalWindow(String title) {
        super(title);
        setSize(500,500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g){
        int yAxis = 0;
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif",Font.BOLD,12);

        g.setFont(sansSerifLarge);

        for(int i = 0; i<5; i++){
            String test = "" + i;
            yAxis = yAxis + 60;
            g.drawString(test,60,yAxis);
        }






    }

}
