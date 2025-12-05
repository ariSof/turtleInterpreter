public class MoveCommand implements AbstractCommand {
    
    Turtle turtle;
    private int distance;
    public MoveCommand(Turtle theTurtle){
        turtle = theTurtle;
    }

    public void interpret(int distance){
        this.distance = distance;
        turtle.setLocation(distance);
    }

    public void accept(Visitor v){
        v.visitConcreteMoveElement(this);
    }
    public int getDistance(){
        return distance;
    }
  

}
