package com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects;

import com.mbax2dh2.PinballMachine.PinballComponents.Pinball;
import com.mbax2dh2.PinballMachine.Vector2D;
import com.mbax2dh2.PinballMachine.Constants;

import java.awt.*;

/**
 * Created by Daniel on 28/01/2015.
 * Updated last on 28/01/2015
 */
public class BoundingBox extends Collider
{
    Vector2D position1, position2;

    BoundingBox(Vector2D v1, Vector2D v2)
    {
        position1 = v1;
        position2 = v2;

    }
    void draw(Graphics g)
    {
        g.setColor(new Color(255,255,255));
        g.drawRect((int) position1.getX(), (int) position1.getY(), (int) (position2.getX() - position1.getX() - 1), (int) (position2.getY() - position1.getY() - 1));

    }

    // check if the pinball collided with the box at all.
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

    public void bounceOff(Pinball pinball)
    {
        if(pinball.getX()-pinball.getRadius() <= Math.min(position1.getX(), position2.getX()))
        {
            Vector2D newVector = pinball.getPosition();
            newVector.setX(Math.min(position1.getX(), position2.getX()) + pinball.getRadius() + 1);
            pinball.setPosition(newVector);

            Vector2D newV = pinball.getVelocity();
            newV.setX(-Constants.friction * newV.getX());
            pinball.setVelocity(newV);


        }
        if(pinball.getY()-pinball.getRadius() <= Math.min(position1.getY(), position2.getY()))
        {
            Vector2D newVector = pinball.getPosition();
            newVector.setY(Math.min(position1.getY(), position2.getY()) + pinball.getRadius() + 1);
            pinball.setPosition(newVector);

            Vector2D newV = pinball.getVelocity();
            newV.setY(-Constants.friction * newV.getY());
            pinball.setVelocity(newV);
        }
        if(pinball.getX()+pinball.getRadius() >= Math.max(position1.getX(), position2.getX()))
        {
            Vector2D newVector = pinball.getPosition();
            newVector.setX(Math.max(position1.getX(), position2.getX()) + pinball.getRadius() + 1);
            pinball.setPosition(newVector);

            Vector2D newV = pinball.getVelocity();
            newV.setX(-Constants.friction * newV.getX());
            pinball.setVelocity(newV);
        }
        if(pinball.getY()+pinball.getRadius() >= Math.max(position1.getY(), position2.getY()))
        {
            Vector2D newVector = pinball.getPosition();
            newVector.setY(Math.max(position1.getY(), position2.getY()) + pinball.getRadius() + 1);
            pinball.setPosition(newVector);

            Vector2D newV = pinball.getVelocity();
            newV.setY(-Constants.friction * newV.getY());
            pinball.setVelocity(newV);
        }

    }


}
