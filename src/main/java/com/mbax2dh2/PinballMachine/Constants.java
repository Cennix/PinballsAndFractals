package com.mbax2dh2.PinballMachine;

/**
 * Created by Daniel on 27/01/2015.
 * Updated last on 27/01/2015
 */
public class Constants
{
    public static final double gravity = -0.001;
    public static final double friction = 1.0;
    public static final double MAX_SPEED = 10;
    public static int toInt(double val)
    {
        return (int) Math.floor(val);
    }
}
