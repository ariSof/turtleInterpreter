public interface AbstractCommand {
    void interpret(int amount);
    void accept(Visitor v);
}
