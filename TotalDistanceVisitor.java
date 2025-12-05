public class TotalDistanceVisitor extends Visitor {
    private int totalDistance = 0;

    @Override
    public void visitConcreteMoveElement(MoveCommand move) {
        totalDistance += Math.abs(move.getDistance());
    }
    @Override
    void visitConcreteDrawElement(DrawCommand draw) {
        //super.visitConcreteTurnElement(turn);
    }
    @Override
    void visitConcreteTurnElement(TurnCommand turn) {
        //super.visitConcreteTurnElement(turn);
    }
    public int getTotalDistance() {
        return totalDistance;
    }
    @Override
    public String toString() {
        return "Total Distance Turtle Travel: " + totalDistance + " meters";
    }

}


