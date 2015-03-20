package com.mbax2dh2.PinballMachine;

import com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects.CollisionMap;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Daniel on 20/03/2015.
 * Updated last on 20/03/2015
 */
public class PinballImage
{

    File imageFile;
    BufferedImage image = new BufferedImage(480,640,BufferedImage.TYPE_3BYTE_BGR);

    public PinballImage(String fileName, CollisionMap collisionMap)
    {

        imageFile = new File(fileName);
        image.createGraphics();
        image.getGraphics().setColor(Color.WHITE);
        //collisionMap.paint(image.getGraphics());


    }

    public void drawLine(Vector2D initial, Vector2D end)
    {

        image.getGraphics().drawLine(Constants.toInt(initial.getX()), Constants.toInt(initial.getY()),
                Constants.toInt(end.getX()), Constants.toInt(end.getY()));
    }

    public void saveImage() throws IOException
    {
        ImageIO.write(image,"jpg",imageFile);
    }
}
