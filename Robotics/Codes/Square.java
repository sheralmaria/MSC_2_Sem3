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
public class Square {
    Square(){
        TurtleRobot t=new TurtleRobot();
        t.forward(100);
        t.left(90);
        t.forward(100);
        t.left(90);
        t.forward(100);
        t.left(90);
        t.forward(100);
       
    }
    public static void main(String a[])
   {
       Square s=new Square();
       
   }
}
