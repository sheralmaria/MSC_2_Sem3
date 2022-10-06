
package robotics;

import ch.aplu.robotsim.*;

public class Assignment2_CircularMotionUsingGears {
    Assignment2_CircularMotionUsingGears()
    {
        NxtRobot nxtRobot = new NxtRobot();
        Gear g = new Gear();
        nxtRobot.addPart(g);
        while (true) {
            g.setSpeed(60);
            g.forward(100);        
            g.left(80);
        }
    }
    
    public static void main(String a[])
    {
        new Assignment2_CircularMotionUsingGears();
    }
}
