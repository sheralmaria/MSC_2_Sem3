
package robotics;

import ch.aplu.robotsim.*;

public class Assignment2_SquareUsingGears {
    Assignment2_SquareUsingGears()
    {
        NxtRobot nxtRobot = new NxtRobot();
        Gear g = new Gear();
        nxtRobot.addPart(g);
        for (int i = 0; i < 4; i++) {
            g.setSpeed(50);
            g.forward(2000);        
            g.left(550);
        }
        nxtRobot.exit();
    }
    
    public static void main(String a[])
    {
        new Assignment2_SquareUsingGears();
    }
}
