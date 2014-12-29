package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.PinballComponents.AMovable;
import com.mbax2dh2.PinballMachine.PinballComponents.AObject;

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

    public void update()
    {
        this.getPosition().add(this.getVelocity());
        this.getVelocity().add(this.getAcceleration());

    }

    public boolean collision(AObject object)
    {
        return false;
    }
}
