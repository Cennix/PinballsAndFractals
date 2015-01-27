package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.PinballComponents.AStatic;
import com.mbax2dh2.PinballMachine.Vector2D;

/**
 * Created by Daniel on 28/12/2014.
 * Updated last on 28/12/2014
 */
public class Bumper extends AStatic
{
    Vector2D size;
    double rotation;
    public Bumper(Vector2D position, Vector2D size, double angle)
    {
        super(position);
        this.size = size;
        this.rotation = angle;
    }

}
