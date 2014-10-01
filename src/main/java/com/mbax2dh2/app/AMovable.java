package com.mbax2dh2.Pinballs;

/**
 * Created by Daniel on 18/09/2014.
 * Updated last on 18/09/2014
 */
public abstract class AMovable
{
    private Vector2D velocity;
    private Vector2D acceleration;
    private double mass;
    private Vector2D position;

    /* getters */


    public Vector2D getVelocity() {
        return velocity;
    }

    public Vector2D getAcceleration() {
        return acceleration;
    }

    public double getVelocityX()
    {
        return velocity.getX();
    }
    public double getVelocityY()
    {
        return velocity.getY();
    }

    public double getAccelerationX()
    {
        return acceleration.getX();
    }
    public double getAccelerationY()
    {
        return acceleration.getY();
    }

    public double getMass() {return mass;}
    public Vector2D getPosition() { return position;}

    /* setters */



    public void setVelocityX(double X)
    {
        velocity.setX(X);
    }
    public void setVelocityY(double Y)
    {
        velocity.setY(Y);
    }

    public void setAccelerationX(double X)
    {
        acceleration.setX(X);
    }
    public void setAccelerationY(double Y)
    {
        acceleration.setY(Y);
    }

    public void setPositionX(double X)
    {
        position.setX(X);
    }
    public void setPositionY(double Y)
    {
        position.setY(Y);
    }

    public void setAcceleration(Vector2D acceleration) {
        this.acceleration = acceleration;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    //methods

    public AMovable()
    {
        velocity = new Vector2D();
        acceleration = new Vector2D();
        mass = 0;
        position = new Vector2D();
    }

    public AMovable(double velX, double velY,
                    double accelerationX, double accelerationY,double Mass,
                    double posX, double posY)
    {
        velocity = new Vector2D(velX,velY);
        acceleration = new Vector2D(accelerationX, accelerationY);
        mass = Mass;
        position = new Vector2D(posX, posY);
    }

    public AMovable(Vector2D velocity, Vector2D acceleration)
    {
        this.velocity = velocity;
        this.acceleration = acceleration;
    }

    public void accelerate(double time)
    {
        setVelocityX(getVelocityX() + getAccelerationX() * time);
        setVelocityY(getVelocityY() + getAccelerationY() * time);
    }


}
