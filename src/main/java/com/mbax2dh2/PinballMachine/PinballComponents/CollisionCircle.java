package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.Vector2D;

/**
 * Created by Daniel on 29/12/2014.
 * Updated last on 29/12/2014
 */
public class CollisionCircle
{
    Vector2D centre;
    double radius;
    public CollisionCircle()
    {
        centre = new Vector2D();
        radius = 0.0;

    }
    public CollisionCircle(Vector2D centre, double radius)
    {
        this.centre = centre;
        this.radius = radius;
    }
}
