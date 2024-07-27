package commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CommandHistory {
    List<Command> commandList;
    List<Command> undoList;

    public CommandHistory(){
        this.commandList = new ArrayList<>();
        this.undoList = new ArrayList<>();
    }
    public void add(Command command){
        commandList.add(command);
    }

    public void undo(){
        if(commandList.isEmpty()) return;
        Command command = commandList.get(commandList.size() - 1);
        command.unexecute();
        commandList.remove(command);
        undoList.add(command);
    }

    public void redo(){
        if(undoList.isEmpty()) return;
        Command command = undoList.get(undoList.size() - 1);
        command.execute();
        undoList.remove(command);
        commandList.add(command);
    }
}
