/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roboticsprac1;

import ch.aplu.robotsim.*;

/**
 *
 * @author admin
 */
public class MoveWithMotors {
    MoveWithMotors()
    {
    NxtRobot r = new NxtRobot();
    Motor m1 = new Motor(MotorPort.A);
    Motor m2 = new Motor(MotorPort.B);
    r.addPart(m1);
    r.addPart(m2);
    m1.forward();
    Tools.delay(1000);
    m2.forward();
    Tools.delay(1000);
    m1.stop();
    Tools.delay(1000);
    m1.forward();
    Tools.delay(1000);
    m2.stop();
    Tools.delay(1000);   
    m2.forward();
    Tools.delay(1000);
    r.exit();
}
     public static void main(String a[]) 
   {
       new MoveWithMotors();
       
   }
}