package com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects;

import com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects.Collider;
import com.mbax2dh2.PinballMachine.PinballComponents.Pinball;
import com.mbax2dh2.PinballMachine.Vector2D;

/**
 * Created by Daniel on 28/01/2015.
 * Updated last on 28/01/2015
 */
public class FailBox extends Collider
{
    //if the ball goes into this box then the game terminates
    Vector2D position1,position2;


    FailBox(Vector2D pos, Vector2D pos2)
    {
        this.position1 = pos;
        this.position2 = pos2;

    }

    @Override
    public boolean collided(Pinball pinball)
    {
        if(pinball.getX()-pinball.getRadius() <= Math.min(position1.getX(), position2.getX()))
            return true;
        if(pinball.getY()-pinball.getRadius() <= Math.min(position1.getY(), position2.getY()))
            return true;
        if(pinball.getX()+pinball.getRadius() >= Math.max(position1.getX(), position2.getX()))
            return true;
        if(pinball.getY()+pinball.getRadius() >= Math.max(position1.getY(), position2.getY()))
            return true;
        return false;
    }
}