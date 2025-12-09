/*
    DrawCommand class is interpreted by first setting the turtles
    pen down [0], using moveCommand to move the distance specified,
    interpreting that distance, and setting the penUp [1] again.
    
    The visitor is used here.
*/
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
