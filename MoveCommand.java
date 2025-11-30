public class MoveCommand implements AbstractCommand {
    
    Turtle turtle;

    public MoveCommand(Turtle theTurtle){
        turtle = theTurtle;
    }

    public void interpret(int distance){
        turtle.setLocation(distance);
    }

    public void accept(Visitor v){
        v.visitConcreteMoveElement(this);
    }
}
