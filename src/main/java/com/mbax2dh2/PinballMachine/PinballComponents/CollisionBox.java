package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.Vector2D;

import java.awt.*;

/**
 * Created by Daniel on 29/12/2014.
 * Updated last on 29/12/2014
 */
public class CollisionBox
{
    Vector2D cornerBL; // the bottom left hand corner of the collision box
    Vector2D size; // the top right hand corner of the collision box

    public CollisionBox ( Vector2D cornerBL, Vector2D cornerTR)
    {
        this.cornerBL = cornerBL;
        this.size = cornerTR.clone();
        this.size.sub(cornerBL);
    }
    public CollisionBox()
    {
        this.cornerBL = new Vector2D();
        this.size = new Vector2D();
    }

    public void draw(Graphics graphics)
    {
        graphics.drawRect((int) cornerBL.getX(),(int) cornerBL.getY(), (int) size.getX(),(int) size.getY());
    }

}

