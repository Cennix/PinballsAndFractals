package com.mbax2dh2.PinballMachine;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by Daniel on 12/02/2015.
 * Updated last on 12/02/2015
 */
public class Main
{
    static boolean graphics;
    static boolean gravity;
    static
    boolean friction = false;
    public static void main(String[] args) throws IOException
    {
        Stage stage = new Stage(graphics,gravity,friction);
        if(graphics)
        {
            JFrame frame = new JFrame("Pinball machine");
            frame.add(stage);
            frame.setSize(480, 640);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        Stage.run();
    }

}
