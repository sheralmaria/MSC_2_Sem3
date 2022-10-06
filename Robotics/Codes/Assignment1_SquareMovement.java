/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics;

import ch.aplu.robotsim.*;
/**
 *
 * @author admin
 */
public class Assignment1_SquareMovement {
    
    Assignment1_SquareMovement()
    {
       
        TurtleRobot t = new TurtleRobot();
        
        for (int i = 0; i < 4; i++) {
            t.forward(100);
            t.left(90);
        }
    }
    
    public static void main(String a[])
    {
        new Assignment1_SquareMovement();
    }
}
