package com.mbax2dh2.Pinballs;

/**
 * Created by Daniel on 18/09/2014.
 * Updated last on 18/09/2014
 */
public abstract class AStatic
{
    private final Vector2D acceleration = new Vector2D();
    private final Vector2D velocity = new Vector2D();

    public Vector2D getVelocity() {
        return velocity;
    }

    public Vector2D getAcceleration() {
        return acceleration;
    }

}
