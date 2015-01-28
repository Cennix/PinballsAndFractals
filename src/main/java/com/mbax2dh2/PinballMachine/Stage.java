package com.mbax2dh2.PinballMachine;

import javax.swing.*;
import java.awt.*;
import com.mbax2dh2.PinballMachine.PinballComponents.*;

/**
 * Created by Daniel on 01/10/2014.
 * Updated last on 01/10/2014
 */
public class Stage extends JPanel
{
    Pinball pinball;
    Wall walls;
    Bumper bumpers;
    AStatic triggers;
    AStatic plunger;
    CollisionMap collisionMap;
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Pinball machine");
        frame.add(new Stage());
        frame.setSize(480, 640);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics graphics)
    {
        Graphics2D g2d = (Graphics2D) graphics;
        // draw borders
        graphics.drawLine(0, 0, 480, 0);
        graphics.drawLine(0, 0, 0, 640);
        graphics.drawLine(480, 640, 480, 0);
        graphics.drawLine(480, 640, 0, 640);


    }

}
