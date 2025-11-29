public class DrawCommand implements AbstractCommand {
    
    Turtle turtle;

    public DrawCommand(Turtle theTurtle){
        turtle = theTurtle;
    }

    public void interpret(int distance){
        turtle.setPenUp(0);
        turtle.setLocation(distance);
        turtle.setPenUp(1);
    }
}
