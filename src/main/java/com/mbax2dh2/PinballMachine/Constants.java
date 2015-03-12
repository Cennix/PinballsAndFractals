package com.mbax2dh2.PinballMachine;

/**
 * Created by Daniel on 27/01/2015.
 * Updated last on 27/01/2015
 */
public class Constants
{
    public static double gravity = -0.001;
    public static final double MAX_SPEED = 10;
    public static double bounceFactor = 0.90;

    public static int toInt(double val)
    {
        return (int) Math.round(val);
    }
}

