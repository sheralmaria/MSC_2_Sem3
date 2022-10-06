/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roboticsprac1;
import ch.aplu.robotsim.*;


public class MoveWithGear {
   MoveWithGear()
    {
        NxtRobot robot = new NxtRobot();
        Gear g=new Gear();
        robot.addPart(g);
        g.forward(500);
        g.setSpeed(30);
        g.left(300);
        g.forward(2000);
        g.leftArc(500);
        g.right(500);
        g.forward(300);
        robot.exit();
       
    }
    public static void main(String a[]) 
   {
       new MoveWithGear();
       
   }
}