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
        Stage stage = new Stage(graphics,gravity,friction); // initialise the system

        Stage.add(new Pinball(new Vector2D(440, 500), new Vector2D(0,-5), new Vector2D(0, gravity ? Constants.gravity: 0), 5)); // add a pinball
        Stage.add(new FailBox(new Vector2D(135,620), new Vector2D(295, 570))); // add an end zone

        stage.run();// run the simulation


    }

}
