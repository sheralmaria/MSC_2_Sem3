package robotics;
import ch.aplu.robotsim.*;
import sun.awt.windows.ThemeReader;

public class Assignment4_track_LineFollower {
    static{
        RobotContext.setStartPosition(80,438);
        RobotContext.useBackground("sprites/track.png");
    }
    Assignment4_track_LineFollower()
    {
        LegoRobot r = new LegoRobot();
        Gear g = new Gear();
        LightSensor ls = new LightSensor(SensorPort.S3);
        
        r.addPart(g);
        r.addPart(ls);
        
        g.forward();
        g.setSpeed(30);
        
        while(true)
        { 
            int v = ls.getValue();
            System.out.println(v);
            if (v > 10) {
                g.forward();
            }
            else {
                g.rightArc(0.03);
            }
            
           
            //438, 84
        }
    }
    public static void main(String args[])
    {
        new Assignment4_track_LineFollower();
    }
}

