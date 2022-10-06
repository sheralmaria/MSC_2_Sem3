/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roboticsprac1;
import ch.aplu.robotsim.*;
/**
 *
 * @author micha
 */
public class ResistObstacles {
    public ResistObstacles()
    {
        LegoRobot r = new LegoRobot();
        Gear g = new Gear();
        TouchSensor t1 = new TouchSensor(SensorPort.S1);
        TouchSensor t2 = new TouchSensor(SensorPort.S2);
        
        r.addPart(g);
        r.addPart(t1);
        r.addPart(t2);
        
        g.setSpeed(100);
        g.right(200);
        g.forward();
        
        while(true)
        {
            Boolean b1 = t1.isPressed();
            Boolean b2 = t2.isPressed();
            
            if (b1 && b2) {
                g.backward(100);
                g.left(150);
                g.forward();
            }
            else if (b1) {
                g.backward(100);
                g.left(100);
                g.forward();
            }
            else if (b2) {
                g.backward(100);
                g.right(100);
                g.forward();
            }
        }
    }
    
    public static void main(String args[])
    {
        new ResistObstacles();
    }
    
    static
    {
        RobotContext.setStartPosition(50, 220);
        RobotContext.useObstacle(RobotContext.channel);
    }
    }

