
package roboticsprac1;
import ch.aplu.robotsim.*;

public class CircleWithMotors {
    public CircleWithMotors(){
        NxtRobot nxtRobot=new NxtRobot();
        Motor motorLeft=new Motor(MotorPort.A);
        Motor motorRight=new Motor(MotorPort.B);
        nxtRobot.addPart(motorLeft);
        nxtRobot.addPart(motorRight);
        while(true){
            motorLeft.forward();
            motorRight.forward();
            Tools.delay(300);
            motorLeft.stop();
            Tools.delay(300);
        }
    }
    public static void main(String[] args){
    new CircleWithMotors();
    }
}
