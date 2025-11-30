public abstract class Visitor {
    void visitConcreteMoveElement(MoveCommand move){}
    void visitConcreteDrawElement(DrawCommand draw){}
    void visitConcreteTurnElement(TurnCommand turn){}
}
