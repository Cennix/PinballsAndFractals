package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.PinballComponents.AStatic;
import com.mbax2dh2.PinballMachine.Vector2D;

import java.awt.*;

/**
 * Created by Daniel on 28/12/2014.
 * Updated last on 28/12/2014
 */
public class Wall extends AStatic // A wall class (an idea, not used)
{
    Vector2D minXY, maxXY;
    protected Wall(Vector2D position)
    {
        super(position);
        minXY = new Vector2D();
    }
    public Wall(Vector2D position, Vector2D minXY, Vector2D maxXY)
    {
        super(position);
        this.minXY = minXY;
        this.maxXY = maxXY;
    }

    public boolean isCollided(Pinball pinball)
    {
        if(pinball.getX() < this.maxXY.getX() && pinball.getX() > this.minXY.getX() && pinball.getY() < this.maxXY.getY()
                && pinball.getY() > this.minXY.getY())
            return true;
        else
            return false;
    }
}
