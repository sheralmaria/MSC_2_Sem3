/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roboticsprac1;
import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;

public class yellowpathfollower {
     static {
        RobotContext.useBackground("sprites/yellowpath.gif");
        RobotContext.setStartPosition(430,230);
        RobotContext.setStartDirection(-90);
    }
    public yellowpathfollower() {
LegoRobot legoRobot = new LegoRobot();
        Gear gear = new Gear();
        LightSensor lightSensorL = new LightSensor(SensorPort.S2);
        LightSensor lightSensorR = new LightSensor(SensorPort.S1);
        LightSensor lightSensorM = new LightSensor(SensorPort.S3);
        legoRobot.addPart(gear);
        legoRobot.addPart(lightSensorL);
        legoRobot.addPart(lightSensorR);
        legoRobot.addPart(lightSensorM);

        gear.forward();
        gear.setSpeed(100);
        
        double arcLength = 0.1;

        while (true) {           
            int lightSensorRValue = lightSensorR.getValue(); 
            int lightSensorDiff = lightSensorRValue - lightSensorL.getValue();
            
            if (lightSensorM.getValue() < 100) {
                gear.stop();
            }

            if(lightSensorDiff > 100) {
                gear.rightArc(arcLength);
            }
            else if (lightSensorDiff < -100) {
                gear.leftArc(arcLength);
            }
            else {
                if (lightSensorRValue > 500) {
                    gear.forward();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        new yellowpathfollower();
    }
}

