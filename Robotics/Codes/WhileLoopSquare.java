package roboticsprac1;
import ch.aplu.robotsim.*;
public class WhileLoopSquare {

    public WhileLoopSquare() {
           TurtleRobot turtleRobot=new TurtleRobot();
           while(true)
           {
               turtleRobot.forward(100);
               turtleRobot.right(90);
               //turtleRobot.exit();
           }
    }
    public static void main(String[] args){
        new WhileLoopSquare();
    }

}
    
    

