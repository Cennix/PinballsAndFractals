package com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects;

import com.mbax2dh2.PinballMachine.PinballComponents.Pinball;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Daniel on 03/03/2015.
 * Updated last on 03/03/2015
 */
public class CollisionMap
{

    public boolean Map [][] = new boolean[480][640];

    public CollisionMap(String filename) throws IOException
    {
        BufferedImage img = ImageIO.read(new File(filename));
        for (int i = 0; i < 480; i++)
        {
            for (int j = 0; j < 640; j++)
            {
                Map[i][j] = img.getRGB(i,j) == 0;
            }
        }
    }

    public boolean detect(Pinball pinball)
    {
        for (int i = (int) Math.round(pinball.getX() - pinball.getRadius());
             i < pinball.getX() + pinball.getRadius();
             i++)
        {
            for (int j = (int) Math.round(pinball.getY() - pinball.getRadius());
                 j < pinball.getY() + pinball.getRadius();
                 j++)
            {
                if(Math.sqrt(Math.pow((pinball.getPosition().getX() - i),2) + Math.pow(pinball.getY() - j, 2)) < pinball.getRadius())
                    return true;
            }
            
        }
        return false;

    }
}
