package com.mbax2dh2.PinballMachine;

/**
 * Created by Daniel on 18/09/2014.
 * Updated last on 18/09/2014
 */
public class Vector2D
{
    double X;
    double Y;

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

    public double getX()
    {
        return X;
    }

    public void setX(double x)
    {
        X = x;
    }

    public double getY()
    {
        return Y;
    }

    public void setY(double y)
    {
        Y = y;
    }

    public boolean equals(Vector2D other)
    {
        return this.getX() == other.getX() && this.getY() == other.getY();
    }

    @Override
    public String toString()
    {
        return "X = " + X + ", Y = " + Y;
    }

    //add another vector to this vector

    public void add(Vector2D other)
    {
        this.X += other.getX();
        this.Y += other.getY();
    }

    //subtract the other vector from this vector

    public void sub(Vector2D other)
    {
        this.X -= other.getX();
        this.Y -= other.getY();
    }

    //multiply this vector by a factor Val
    public void mult(double val)
    {
        this.X *= val;
        this.Y *= val;
    }

    //divide this vector by a factor Val
    public void div(int val)
    {
        this.X /= val;
        this.Y /= val;
    }

    //return the magnitude of the variable, squared.
    public double magSq()
    {
        return(this.X * this.X + this.Y * this.Y);
    }

    public double dotProd(Vector2D other) {return this.getX() * other.getX() + this.getY() * other.getY();}

    // normalise the vector
    public void normalise()
    {
        double factor = Math.sqrt(magSq());
        this.X /= factor;
        this.Y /= factor;
    }

    @Override
    public Vector2D clone() throws CloneNotSupportedException
    {
        return new Vector2D(this.getX(), this.getY());
    }
}
