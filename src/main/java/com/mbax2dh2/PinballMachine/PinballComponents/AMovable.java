package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.Vector2D;

/**
 * Created by Daniel on 18/09/2014.
 * Updated last on 18/09/2014
 */
public abstract class AMovable extends AObject // an object which moves about within the system
{

    private double mass;

    public AMovable()
    {
        position = new Vector2D();
        velocity = new Vector2D();
        acceleration = new Vector2D();
        mass = 0;

    }

    public AMovable(double velX, double velY,
                    double accelerationX, double accelerationY, double Mass,
                    double posX, double posY)
    {
        position = new Vector2D(posX, posY);
        velocity = new Vector2D(velX, velY);
        acceleration = new Vector2D(accelerationX, accelerationY);
        mass = Mass;

    }

    public AMovable(Vector2D position, Vector2D velocity, Vector2D acceleration)
    {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
    }

    public void setVelocity(Vector2D velocity)
    {
        this.velocity = velocity;
    }

    public void setAcceleration(Vector2D acceleration)
    {
        this.acceleration = acceleration;
    }

    public double getMass()
    {
        return mass;
    }

    public void setMass(double mass)
    {
        this.mass = mass;
    }
    //methods

    public void setPosition(Vector2D position)
    {
        this.position = position;
    }




}
