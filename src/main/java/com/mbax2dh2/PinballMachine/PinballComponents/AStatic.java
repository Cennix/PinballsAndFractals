package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.PinballComponents.AObject;
import com.mbax2dh2.PinballMachine.Vector2D;

/**
 * Created by Daniel on 18/09/2014.
 * Updated last on 18/09/2014
 */
public abstract class AStatic extends AObject
{


    public AStatic(Vector2D position)
    {
        super();
        this.position = position;
        this.acceleration = new Vector2D();
        this.velocity = new Vector2D();

    }


}
