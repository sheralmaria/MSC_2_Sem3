package robotics;

import ch.aplu.robotsim.*;
import java.io.BufferedReader;
import java.io.*;

public class Ass3_MoveWithMotors_WithSwitchCase {
   
    public static void MoveWithMotor(String dir)
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
        
        switch(dir)
        {
            case "Left":
                for (int i = 0; i < 4; i++) {
                    m1.stop();
                    Tools.delay(1000);
        
                    m1.forward();
                    Tools.delay(1000);
                }
            break;
            
            case "Right":
                for (int i = 0; i < 4; i++) {
                    m2.stop();
                    Tools.delay(1000);
        
                    m2.forward();
                    Tools.delay(1000);
                }
            break;
        }
        
        r.exit();
    }
    
    public static String getInput() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Which direct you want to select (Left/Righ) ?");
        String dir = br.readLine();
        
        return dir;
    }
    
    public static void main(String a[]) throws IOException
    {
        String dir = getInput();
        System.out.println("Direction : " + dir);
        MoveWithMotor(dir);
    }
}
