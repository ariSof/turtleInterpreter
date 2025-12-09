/**
 * Class used to interpret the turn command for turtle
 * 
 * Accepts a Visitor
 */
public class TurnCommand implements AbstractCommand {
    
    Turtle turtle;
    private int angle;

    public TurnCommand(Turtle theTurtle){
        turtle = theTurtle;
    }
    
    public void interpret(int angle){
       // turtle.setOrientation(angle);
       this.angle = angle;
         turtle.turn(angle);

    }
    public int getAngle(){
        return angle;
    }
    

    public void accept(Visitor v){
        v.visitConcreteTurnElement(this);
    }
}
    