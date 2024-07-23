package bank.domain.commands;

public interface Command {
    void execute();
    void unexecute();
}
