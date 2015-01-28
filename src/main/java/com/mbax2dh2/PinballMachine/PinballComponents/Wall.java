package com.mbax2dh2.PinballMachine.PinballComponents;

import com.mbax2dh2.PinballMachine.PinballComponents.AStatic;
import com.mbax2dh2.PinballMachine.Vector2D;

import java.awt.*;

/**
 * Created by Daniel on 28/12/2014.
 * Updated last on 28/12/2014
 */
public class Wall extends AStatic
{
    Vector2D wallSize;
    protected Wall(Vector2D position)
    {
        super(position);
        wallSize = new Vector2D();
    }
    public Wall(Vector2D position, Vector2D size)
    {
        super(position);
        wallSize = size;
    }

    public void paint(Graphics graphics)
    {

    }


}
