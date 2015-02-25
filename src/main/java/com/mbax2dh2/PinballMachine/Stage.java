package com.mbax2dh2.PinballMachine;

import javax.swing.*;
import java.awt.*;
import com.mbax2dh2.PinballMachine.PinballComponents.*;
import com.mbax2dh2.PinballMachine.PinballComponents.Trigger;

/**
 * Created by Daniel on 01/10/2014.
 * Updated last on 01/10/2014
 */
public class Stage extends JPanel
{
    Pinball pinball;
    Wall[] walls = new Wall[50];
    Bumper[] bumpers = new Bumper[5];
    Trigger[] triggers = new Trigger[5];
    Plunger[] plunger = new Plunger[5];

    boolean graphics, gravity, friction = false;

    public Stage(boolean graphics, boolean gravity, boolean friction)
    {
        this.graphics = graphics;
        this.gravity = gravity;
        this.friction = friction;

    }

    public void add(AObject object) throws Exception
    {
        if(object instanceof Pinball )
            if(pinball == null)
            {
                pinball = (Pinball) object;
            }
            else
            {
                throw new Exception("already have a pinball in this system.");
            }
        else
        {
            if (object instanceof Wall)
            {
                boolean added = false;
                int i = 0;
                while (!added || i < walls.length)
                {
                    if (walls[i] == null)
                    {
                        walls[i] = (Wall) object;
                        added = true;
                    }
                    else
                    {
                        i++;
                    }
                }
                if (!added)
                {
                    throw new Exception("Too many walls in the system.");
                }
            }
            else
            {
                if (object instanceof Bumper)
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
                else
                {
                    if (object instanceof Trigger)
                    {
                        boolean added = false;
                        int i = 0;
                        while (!added || i < triggers.length)
                        {
                            if (triggers[i] == null)
                            {
                                triggers[i] = (Trigger) object;
                                added = true;
                            }
                            else
                                i++;
                        }
                        if (!added)
                        {
                            throw new Exception("Too many triggers in the system.");
                        }
                    }
                    else
                    {
                        if (object instanceof Plunger)
                        {
                            boolean added = false;
                            int i = 0;
                            while (!added || i < plunger.length)
                            {
                                if (plunger[i] == null)
                                {
                                    plunger[i] = (Plunger) object;
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
                            throw new Exception("The object added is not supported!");
                        }
                    }
                }
            }
        }



    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Pinball machine");

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
