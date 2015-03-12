package com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects;

import com.mbax2dh2.PinballMachine.Constants;
import com.mbax2dh2.PinballMachine.PinballComponents.Pinball;
import com.mbax2dh2.PinballMachine.Vector2D;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Daniel on 03/03/2015.
 * Updated last on 03/03/2015
 */
public class CollisionMap
{

    public boolean Map[][] = new boolean[480][640];
    BufferedImage image;

    public CollisionMap(String filename) throws IOException
    {
        BufferedImage img = ImageIO.read(new File(filename));
        image = img;
        for (int i = 0; i < 480; i++)
        {
            for (int j = 0; j < 640; j++)
            {
                if(i == 0 && j == 0) System.out.println("(" + i + "," + j + ") = " + img.getRGB(i,j));
                if(i == 240 && j == 340) System.out.println("(" + i + "," + j + ") = " + img.getRGB(i,j));
                Map[i][j] = (img.getRGB(i, j) != -1);
            }
        }
        System.out.println("Finished making map.");
    }

    public boolean collided(Pinball pinball)
    {
        for (int i = Constants.toInt(pinball.position.getX() - pinball.getRadius());
             i < pinball.position.getX() + pinball.getRadius();
             i++)
        {
            for (int j = Constants.toInt(pinball.position.getY() - pinball.getRadius());
                 j < pinball.position.getY() + pinball.getRadius();
                 j++)
            {
                if (getMapVal(i, j)) return getMapVal(i, j);
            }

        }

        return false;
    }

    public boolean getMapVal(int i, int j)
    {
        if (i < 0) i = 0;
        if (i >= 480) i = 479;
        if (j < 0) j = 0;
        if (j >= 640) j = 639;
        return Map[i][j];
    }




    public void resolveCollision(Pinball pinball) throws Exception
    {
        int startPoint = -1, endPoint = -1;
        for (int i = 0; i < 361; i++)
        {
            if (getMapVal(Constants.toInt(pinball.position.getX() + pinball.getRadius() * Math.sin(Math.toRadians(i))),
                    Constants.toInt(pinball.position.getY() + pinball.getRadius() * Math.cos(Math.toRadians(i)))) && startPoint == -1)
            {
                startPoint = i;
            }

        }

        if (startPoint == -1) return;
        for (int i = startPoint; i < 361; i++)
        {
            if (!getMapVal(Constants.toInt(pinball.position.getX() + pinball.getRadius() * Math.sin(Math.toRadians(i))),
                    Constants.toInt(pinball.position.getY() + pinball.getRadius() * Math.cos(Math.toRadians(i)))) && endPoint == -1)
            {
                endPoint = i;
            }
        }

        int normalAngle;
        if (endPoint > -1)
        {
            normalAngle = (startPoint + endPoint) / 2;

        }
        else
        {

            normalAngle = startPoint;
        }

        Vector2D normalVector = new Vector2D(Constants.toInt(pinball.velocity.getX() + pinball.getRadius() * Math.sin(Math.toRadians(normalAngle))),
                Constants.toInt(pinball.velocity.getY() + pinball.getRadius() * Math.cos(Math.toRadians(normalAngle))));

        Vector2D newVector = new Vector2D(Constants.bounceFactor * (-2 * (pinball.velocity.dotProd(normalVector) * normalVector.getX() + pinball.velocity.getX())),
                Constants.bounceFactor * (-2 * (pinball.velocity.dotProd(normalVector) * normalVector.getY() + pinball.velocity.getY())));

        pinball.velocity = newVector;
        pinball.velocity.normalise();
        if (pinball.velocity.magSq() > Constants.MAX_SPEED * Constants.MAX_SPEED)
        {
            pinball.velocity.mult(Constants.MAX_SPEED);
        }
        pinball.update();
    }

    public void paint(Graphics graphics)
    {
        graphics.drawImage(image, 1, 1, null);
    }

}
