package com.mbax2dh2.PinballMachine;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import com.mbax2dh2.PinballMachine.PinballComponents.*;
import com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects.CollisionMap;
import com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects.FailBox;

import static java.lang.Thread.sleep;

/**
 * Created by Daniel on 01/10/2014.
 * Updated last on 01/10/2014
 */
public class Stage extends JPanel
{
    private static Pinball pinball;
    private static CollisionMap map;
    private static FailBox endZone;
    private JFrame frame;



    boolean graphics, gravity, friction = false;

    public Stage(boolean graphics, boolean gravity, boolean friction) throws IOException
    {
        this.graphics = graphics;
        this.gravity = gravity;
        this.friction = friction;
        map = new CollisionMap("src/main/Resources/CollisionMap/Map.jpg");
        if(graphics)
        {
            frame = new JFrame("Pinball machine");
            frame.setSize(490, 650);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
    }

    public static void add(AObject object) throws Exception
    {

        if (object instanceof FailBox)
        {
            endZone = (FailBox) object;
        }
        else
        {
            if(object instanceof Pinball)
            {
                pinball = (Pinball) object;
            }
            else
            {
                throw new Exception("Object not supported");
            }
        }
    }



    @Override
    public void paint(Graphics graphics)
    {

        map.paint(graphics);
        endZone.paint(graphics);
        pinball.paint(graphics);
    }

    public void run() throws InterruptedException
    {
        frame.add(this);
        while(!endZone.collided(pinball))
        {

            if(map.collided(pinball)) try
            {
                map.resolveCollision(pinball);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            pinball.update();
            frame.repaint();
            sleep(5);
        }
    }
}
