package roboticsprac1;
import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;
public class PathFollower {
    static {
        RobotContext.setStartPosition(105, 443);
        RobotContext.useBackground("sprites/path.gif");
    }
    public PathFollower()
    {
        LegoRobot legoRobot = new LegoRobot();
        Gear gearBox = new Gear();
        LightSensor lightSensor1 = new LightSensor(SensorPort.S1);
        LightSensor lightSensor2 = new LightSensor(SensorPort.S2);
        legoRobot.addPart(gearBox);
        legoRobot.addPart(lightSensor1);
        legoRobot.addPart(lightSensor2);
        
        gearBox.forward();
        //gearBox.setSpeed(100);
        
        while(true){
        if(lightSensor1.getValue()>=10 && lightSensor2.getValue()>=10)
        {
            gearBox.forward();
        }
        else if(lightSensor1.getValue()<10 && lightSensor2.getValue()>10)
        {
             gearBox.leftArc(0.01);
        }
        else if(lightSensor1.getValue()>10 && lightSensor2.getValue()<10)
        {
             gearBox.rightArc(0.01);
        }
        }
    }
     public static void main(String[] args) {
        new PathFollower();
    }
}
