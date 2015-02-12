package com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects;

import com.mbax2dh2.PinballMachine.PinballComponents.Pinball;

import java.awt.*;

/**
 * Created by Daniel on 28/01/2015.
 * Updated last on 28/01/2015
 */
public abstract class Collider
{
    // the class to hold the methods used in the collision map for the project
    void response() {}

    public boolean collided(Pinball ball)
    {
        return false;
    }
    public void bounceOff(Pinball ball)
    {

    }

    void draw(Graphics g)
    {

    }

}
