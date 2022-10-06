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
public class Movement {
   Movement()
   {
       TurtleRobot t=new TurtleRobot();
       t.forward(20);
       t.left(45);
       t.forward(20);
       t.right(45);
       t.forward(200);
       t.right(90);
       t.forward(200);
       t.backward(20);
       t.exit();
   }
   public static void main(String a[])
   {
       Movement m=new Movement();
       
   }
}
