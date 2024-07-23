package bank.domain.commands;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {
    List<Command> commandList = new ArrayList<Command>();
    List<Command> undoList = new ArrayList<>();

    public void undo(){
        if(commandList.isEmpty()) return;
        Command removedCommand = commandList.remove(commandList.size() - 1);
        removedCommand.unexecute();
        undoList.add(removedCommand);
    }

    public void redo(){
        if(undoList.isEmpty()) return;
        Command removedCommand = undoList.remove(undoList.size() - 1);
        removedCommand.execute();
        commandList.add(removedCommand);
    }

    public void add(Command command){
        commandList.add(command);
    }
}
