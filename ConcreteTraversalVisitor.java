import java.util.ArrayList;

public class ConcreteTraversalVisitor extends Visitor {
    ArrayList<AbstractCommand> mementos;

    public ConcreteTraversalVisitor(){
        mementos = new ArrayList<>();
    }

    void visitConcreteMoveElement(MoveCommand move){
        mementos.add(move);
    }

    void visitConcreteDrawElement(DrawCommand draw){
        mementos.add(draw);
    }

    void visitConcreteTurnElement(TurnCommand turn){
        mementos.add(turn);
    }
    public ArrayList<AbstractCommand> getMementos(){
        return mementos;
    }

    @Override
    public String toString(){
        return mementos.toString();
    }
}
