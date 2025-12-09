/**
 * Abstract Command interface implemented by DrawCommand
 * and MoveCommand classes. 
 */
public interface AbstractCommand {
    void interpret(int amount);
    void accept(Visitor v);
}
