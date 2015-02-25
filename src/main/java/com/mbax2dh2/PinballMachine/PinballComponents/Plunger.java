package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.PinballComponents.AStatic;
import com.mbax2dh2.PinballMachine.Vector2D;

/**
 * Created by Daniel on 28/12/2014.
 * Updated last on 28/12/2014
 */
public class Plunger extends AStatic
{
    private Vector2D minXY;
    private Vector2D maxXY;
    protected Plunger(Vector2D position, Vector2D minXY, Vector2D maxXY)
    {
        super(position);
        this.minXY = minXY;
        this.maxXY = maxXY;
    }

    public void collisionEvent(AObject objCollided)
    {
        objCollided.velocity.add(new Vector2D(0,50));
    }

    public boolean iscollided(Pinball pinball)
    {
        if(pinball.getX() < this.maxXY.getX() && pinball.getX() > this.minXY.getX() && pinball.getY() < this.maxXY.getY()
                && pinball.getY() > this.minXY.getY())
            return true;
        else
            return false;
    }
}
