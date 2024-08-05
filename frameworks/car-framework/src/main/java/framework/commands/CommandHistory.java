package framework.commands;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    List<Command> commandList;
    List<Command> undoList;

    public CommandHistory(){
        commandList = new ArrayList<>();
        undoList = new ArrayList<>();
    }

    public void add(Command command){
        this.commandList.add(command);
    }

    public void undo(){
        if(commandList.isEmpty()) return;
        Command command = commandList.removeLast();
        command.unexecute();
        undoList.add(command);
    }

    public void redo(){
        if(undoList.isEmpty()) return;
        Command command = undoList.removeLast();
        command.execute();
        commandList.add(command);
    }
}
