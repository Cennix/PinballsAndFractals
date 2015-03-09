package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.PinballComponents.AMovable;
import com.mbax2dh2.PinballMachine.PinballComponents.AObject;
import com.mbax2dh2.PinballMachine.*;

import java.awt.*;


/**
 * Created by Daniel on 24/09/2014.
 * Updated last on 24/09/2014
 */
public class Pinball extends AMovable
{
    private double radius;
    public Pinball(double radius)
    {
        super();
        this.radius = radius;

    }
    public Pinball(Vector2D pos, Vector2D vel, Vector2D accel, double radius)
    {
        super(pos,vel,accel);
        this.radius = radius;
    }

    public void update()
    {
        this.getPosition().add(this.getVelocity());
        this.getVelocity().add(this.getAcceleration());
        if(this.getVelocity().magSq() == Constants.MAX_SPEED * Constants.MAX_SPEED)
        {
            this.getVelocity().normalise();
            this.getVelocity().mult(Constants.MAX_SPEED);
        }

    }

    @Override
    public void paint(Graphics graphics)
    {

    }

    public boolean collision(AObject object)
    {
        return false;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }


}
