package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.PinballComponents.AStatic;
import com.mbax2dh2.PinballMachine.Vector2D;

import java.awt.*;

/**
 * Created by Daniel on 28/12/2014.
 * Updated last on 28/12/2014
 */
public class Bumper extends AStatic
{
    int size;
    double rotation;
    Vector2D endpoint;

    public Bumper(Vector2D position, int size, double angle)
    {
        super(position);
        this.size = size;
        this.rotation = angle;
        endpoint = new Vector2D(position.getX() + size * Math.cos(rotation), position.getY() + size * Math.sin(rotation));
    }

    public boolean collided(Pinball pinball)
    {
        return false;
    }


    @Override
    public void paint(Graphics graphics)
    {
        graphics.drawLine((int) Math.floor(position.getX()),(int) Math.floor( position.getY()),
                (int) Math.floor(endpoint.getX()), (int) Math.floor(endpoint.getY()));
    }

}
