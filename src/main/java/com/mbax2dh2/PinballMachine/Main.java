package com.mbax2dh2.PinballMachine;

import com.mbax2dh2.PinballMachine.PinballComponents.CollisionObjects.FailBox;
import com.mbax2dh2.PinballMachine.PinballComponents.Pinball;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Daniel on 12/02/2015.
 * Updated last on 12/02/2015
 */
public class Main
{
    static boolean graphics = true;
    static boolean gravity = true;
    static boolean friction = false;
    public static void main(String[] args) throws Exception
    {
        Stage stage = new Stage(graphics,gravity,friction);

        Stage.add(new Pinball(new Vector2D(445, 500), new Vector2D(0,-10), new Vector2D(0, gravity ? -Constants.gravity: 0), 5));

        Stage.add(new FailBox(new Vector2D(135,620), new Vector2D(295, 570)));

        PrintWriter out = new PrintWriter(new File("src/main/Resources/Results/result.dat"));

        stage.run();


    }

}
