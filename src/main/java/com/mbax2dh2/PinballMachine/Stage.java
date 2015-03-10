package com.mbax2dh2.PinballMachine;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import com.mbax2dh2.PinballMachine.PinballComponents.*;
import com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects.CollisionMap;
import com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects.FailBox;

/**
 * Created by Daniel on 01/10/2014.
 * Updated last on 01/10/2014
 */
public class Stage extends JPanel
{
    Pinball pinball;
    Bumper[] bumpers = new Bumper[16];
    Plunger[] plungers = new Plunger[8];
    CollisionMap map;
    FailBox endZone;



    boolean graphics, gravity, friction = false;

    public Stage(boolean graphics, boolean gravity, boolean friction) throws IOException
    {
        this.graphics = graphics;
        this.gravity = gravity;
        this.friction = friction;
        map = new CollisionMap("src/main/Resources/CollisionMap/Map.jpg");
    }

    public void add(AObject object) throws Exception
    {
        if(object instanceof Pinball )
        {
            if (pinball == null)
            {
                pinball = (Pinball) object;
            }
            else
            {
                throw new Exception("already have a pinball in this system.");
            }
        }
            else if (object instanceof Bumper)
        {
            boolean added = false;
            int i = 0;
            while (!added || i < bumpers.length)
            {
                if (bumpers[i] == null)
                {
                    bumpers[i] = (Bumper) object;
                    added = true;
                }
                else
                    i++;
            }
            if (!added)
            {
                throw new Exception("Too many bumpers in the system.");
            }
        }
        else if (object instanceof Plunger)
        {
            boolean added = false;
            int i = 0;
            while (!added || i < plungers.length)
            {
                if (plungers[i] == null)
                {
                    plungers[i] = (Plunger) object;
                    added = true;
                }
                else
                    i++;
            }
            if (!added)
            {
                throw new Exception("Too many plungers in the system.");
            }
        }
        else
        {
            if (object instanceof FailBox)
            {
                endZone = (FailBox) object;
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

        for(Bumper bumpers1: bumpers)
            bumpers1.paint(graphics);
        for(Plunger plunger: plungers)
            plunger.paint(graphics);

        pinball.paint(graphics);
    }

    public static void run()
    {

    }
}
