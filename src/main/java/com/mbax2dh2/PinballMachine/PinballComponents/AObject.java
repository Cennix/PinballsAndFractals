package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.Vector2D;

import javax.swing.*;

/**
 * Created by Daniel on 28/12/2014.
 * Updated last on 28/12/2014
 */

public class AObject extends JComponent // an object within the system
{
    public Vector2D position;
    public Vector2D velocity;
    public Vector2D acceleration;

    public Vector2D getVelocity()
    {
        return velocity;
    }

    public Vector2D getAcceleration()
    {
        return acceleration;
    }

    public Vector2D getPosition()
    {
        return position;
    }
}
