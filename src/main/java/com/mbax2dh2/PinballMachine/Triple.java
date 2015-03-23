package com.mbax2dh2.PinballMachine;

/**
 * Created by Daniel on 11/03/2015.
 * Updated last on 11/03/2015
 */
public class Triple // a class of 3 double values
{
    double x,y,z;
    public Triple(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString()
    {
        return (x + "\t" + y + "\t" + z);
    }
}
