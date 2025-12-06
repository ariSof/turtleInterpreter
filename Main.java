import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        reader.setFileName("turtleProgram.txt");

        Visitor visitor = new ConcreteTraversalVisitor();
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
        System.out.println(myTurtle.toString());
        System.out.println("Traversal="+traversalVisitor.toString());

        TotalDistanceVisitor distanceVisitor = new TotalDistanceVisitor();
        for (AbstractCommand cmd: traversalVisitor.getMementos()){
            //traversalVisitor.getCommandsList().get(0).accept(distanceVisitor);
        cmd.accept(distanceVisitor);
        }


        //Turtle check after:
        System.out.println(myTurtle.toString());
        System.out.println(visitor.toString());
       System.out.println(distanceVisitor.toString());
    }
}
