/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package apps;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;



/**
 *
 * @author NEERAJ
 */
public class Apps extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Thread t;
    int x,y;
    int size = 4;
    Font f;
    public void init() {
        // TODO start asynchronous download of heavy resources
        x=500;y=100;t=new Thread(this);
        t.start();
        setBackground(Color.lightGray);
        
        
    }
    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
         g.setFont(new Font("Arial",Font.BOLD,size));
        g.drawString("Welcome", x, y);
        
    }

    @Override
    public void run() {

        try {
            while (true) {
               /* if (x>800) {
                    x=100;
                }*/
                if (y>900) {
                    y=100;
                }
                size+=5;
                       
                Thread.sleep(500);
                //x+=50;
                y+=20;
                repaint();
            }
        } catch (Exception e) {
        }
    }
    
}
