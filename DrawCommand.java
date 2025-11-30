public class DrawCommand implements AbstractCommand {
    
    Turtle turtle;
    AbstractCommand move;
    Visitor visit;

    public DrawCommand(Turtle theTurtle){
        turtle = theTurtle;
    }

    public void interpret(int distance){
        turtle.setPenUp(0); //false
        move = new MoveCommand(turtle);
        move.interpret(distance);
        move.accept(visit);
        turtle.setPenUp(1); //true
    }

    public void accept(Visitor v){
        visit = v;
        v.visitConcreteDrawElement(this);
    }
}
