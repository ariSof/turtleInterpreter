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

    @Override
    public String toString(){
        return mementos.toString();
    }
}
