/* 
  Turtle Graphics Interpreter
  Main uses a fileReader that reads from a text file.
  The commands listed in the file are Interpreted and using Visitor pattern,
  we traverse the abstract tree created from interpreting file, and use 
  a separate Visitor for calculating the total distance traveled in the given program. 

  Collaborators:
  Sofia Villalpando and Julian Grado

  The following example is from reading a file that would draw a square.

  Example from the terminal:
  Run Main.java

****************************************
Begining Turtle: location (0.00, 0.00) Orientation= 0.0 degrees, is pen up? true
Traversal=[DrawCommand@2d140a7, MoveCommand@347bdeef, TurnCommand@2aa27288, DrawCommand@7f34a967, MoveCommand@77e80a5e, TurnCommand@1d8e2eea, DrawCommand@240139e1, MoveCommand@7ea4d397, TurnCommand@49298ce7, DrawCommand@253c1256, MoveCommand@8dfe921]
End Turtle: location (-0.00, 0.00) Orientation= 270.0 degrees, is pen up? true
Total Distance Turtle Travel: 20 meters
*/ 

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        reader.setFileName("turtleProgram.txt");

        //Visitor visitor = new ConcreteTraversalVisitor();
        ConcreteTraversalVisitor traversalVisitor = new ConcreteTraversalVisitor();
        Turtle myTurtle = new Turtle();
        ArrayList<String> commands = reader.readFile();
        AbstractCommand theCommand;
        int distance = 0;

        //Initial turtle check:
        System.out.println(myTurtle.toString());

        for (String line : commands) {
            String[] word = line.split("\\s+");
            //System.out.println(word[0] +": "+ word[1]);

            try{
                distance = Integer.parseInt(word[1]);
            }catch(NumberFormatException e){
                System.out.println("Error reading your file: " + e);
            }


            if(word[0].equals("move")){
                theCommand = new MoveCommand(myTurtle);
                
                //System.out.println("Created Move command");
            }
            else if(word[0].equals("draw")){
                theCommand = new DrawCommand(myTurtle);
                //System.out.println("created Draw command");
            }
            else if(word[0].equals("turn")){
                theCommand = new TurnCommand(myTurtle);
               // System.out.println("created Turn command");
            }
            else{
               // System.out.println("else line? " + line);
                theCommand = new MoveCommand(myTurtle);
                System.out.println("Error reading your file.");
            }

            theCommand.accept(traversalVisitor);
            theCommand.interpret(distance);
        }
        //System.out.println(myTurtle.toString());
        System.out.println("Traversal="+traversalVisitor.toString());

        TotalDistanceVisitor distanceVisitor = new TotalDistanceVisitor();
        for (AbstractCommand cmd: traversalVisitor.getMementos()){
            //traversalVisitor.getCommandsList().get(0).accept(distanceVisitor);
        cmd.accept(distanceVisitor);
        }


        //Turtle check after:
        System.out.println(myTurtle.toString());
        //System.out.println(visitor.toString());
       System.out.println(distanceVisitor.toString());
    }
}
