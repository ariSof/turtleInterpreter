// import java.util.Deque;


/* attempt to revise and correct my original memento design pattern implementation -JG */
// public class TurtleHistory {
//     private final Turtle turtle;
//     private final Deque<Turtle.TurtleMemento> undoStack = new ArrayDeque<>();
//     private final Deque<Turtle.TurtleMemento> redoStack = new ArrayDeque<>();
//     public TurtleHistory(Turtle turtle) {
//         this.turtle = turtle;
//     }
//     public void backup() {
//         undoStack.push(turtle.save());
//         redoStack.clear();
//     }
//     public void undo() {
//         if (!undoStack.isEmpty()) {
//             redoStack.push(turtle.save());
//             Turtle.TurtleMemento memento = undoStack.pop();
//             turtle.restore(memento);
//         }
//     }
//     public void redo() {
//         if (!redoStack.isEmpty()) {
//             undoStack.push(turtle.save());
//             Turtle.TurtleMemento memento = redoStack.pop();
//             turtle.restore(memento);    
// }
