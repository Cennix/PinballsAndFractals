package com.mbax2dh2.Pinballs;

//imports

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

/**
 * Created by Daniel on 18/09/2014.
 * Updated last on 18/09/2014
 */
public class Pinball extends JPanel
{
    @Override
    public void paint(Graphics graphics)
    {
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setColor(Color.CYAN);
        g2d.fillOval(0,0,30,30);
        g2d.drawOval(0,50,30,30);
        g2d.fillRect(50,0,30,30);
        g2d.drawRect(50,50,30,30);

        g2d.draw(new Ellipse2D.Double(0,100,30,30));


    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Pinball machine");
        frame.add(new Pinball());
        frame.setSize(640, 480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
