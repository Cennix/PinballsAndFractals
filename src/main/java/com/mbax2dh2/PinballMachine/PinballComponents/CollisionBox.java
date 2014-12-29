package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.Vector2D;

/**
 * Created by Daniel on 29/12/2014.
 * Updated last on 29/12/2014
 */
public class CollisionBox
{
    Vector2D cornerBL; // the bottom left hand corner of the collision box
    Vector2D cornerTR; // the top right hand corner of the collision box

    public CollisionBox ( Vector2D cornerBL, Vector2D cornerTR)
    {
        this.cornerBL = cornerBL;
        this.cornerTR = cornerTR;
    }
    public CollisionBox()
    {
        this.cornerBL = new Vector2D();
        this.cornerTR = new Vector2D();
    }

}

