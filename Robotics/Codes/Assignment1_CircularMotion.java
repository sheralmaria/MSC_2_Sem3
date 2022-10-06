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
public class Assignment1_CircularMotion {
    
    Assignment1_CircularMotion()
    {
        TurtleRobot t = new TurtleRobot();
        
        while (true) {
            t.forward(2);
            t.left(2);
        }
    }
    
    public static void main(String a[])
    {
        new Assignment1_CircularMotion();
    }
}
