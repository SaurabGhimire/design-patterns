package bank.commands;

public interface Command {
    void execute();
    void unexecute();
}
