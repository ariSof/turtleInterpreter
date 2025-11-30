public class TurnCommand implements AbstractCommand {
    
    Turtle turtle;
    
    public TurnCommand(Turtle theTurtle){
        turtle = theTurtle;
    }
    
    public void interpret(int angle){
        turtle.setOrientation(angle);
    }

    public void accept(Visitor v){
        v.visitConcreteTurnElement(this);
    }
}
    