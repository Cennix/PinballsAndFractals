package com.mbax2dh2.Pinballs;

/**
 * Created by Daniel on 18/09/2014.
 * Updated last on 18/09/2014
 */
public class Vector2D
{
    double X;
    double Y;

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public boolean equals(Vector2D other) {
        return this.getX() == other.getX() && this.getY() == other.getY();
    }

    public double getHyp()
    {
        return(Math.sqrt(Math.pow(this.getX(),2) + Math.pow(this.getY(),2 )));
    }

    public double compare(Vector2D other)
    {
        return this.getHyp() - other.getHyp();
    }

    @Override
    public String toString() {
        return "X = " + X + ", Y = " + Y;
    }

    public Vector2D()
    {
        X = 0;
        Y = 0;
    }
    public Vector2D(double x, double y)
    {
        X = x;
        Y = y;
    }
}
