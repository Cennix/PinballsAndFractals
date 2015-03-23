package com.mbax2dh2.PinballMachine;

/**
 * Created by Daniel on 27/01/2015.
 * Updated last on 27/01/2015
 */
public class Constants
{
    public static double gravity = 0.001; // gravity in the system
    public static final double MAX_SPEED = 10; // the max speed limit
    public static double bounceFactor = 0.90; // the modifier applied to each bounce

    public static int toInt(double val)
    {
        return (int) Math.round(val);
    } // converts a double into an integer
}

