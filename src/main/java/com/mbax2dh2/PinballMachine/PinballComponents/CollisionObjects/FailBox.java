package com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects;

import com.mbax2dh2.PinballMachine.Constants;
import com.mbax2dh2.PinballMachine.PinballComponents.AObject;
import com.mbax2dh2.PinballMachine.PinballComponents.Pinball;
import com.mbax2dh2.PinballMachine.Vector2D;

import java.awt.*;

/**
 * Created by Daniel on 28/01/2015.
 * Updated last on 28/01/2015
 */
public class FailBox extends AObject
{
    //if the ball goes into this box then the game terminates
    Vector2D position1, size;


    public FailBox(Vector2D pos, Vector2D pos2)
    {
        this.position1 = pos;
        pos2.sub(pos);
        size = pos2;


    }

    public boolean collided(Pinball pinball)
    {
        return ( pinball.position.getY() > (this.position1.getY() + size.getY() ));
    }

    public void paint(Graphics graphics)
    {
        graphics.drawRect(Constants.toInt(position1.getX()), Constants.toInt(position1.getY()),
                Constants.toInt(size.getX()), Constants.toInt(size.getY()));

    }

    public void update()
    {

    }
}
