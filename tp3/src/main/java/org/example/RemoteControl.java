package org.example;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private Integer nbrSlot;
    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;
    private List<Command> commands=new ArrayList<>();;
    public StringBuilder report;
    public RemoteControl(int nbrSlot) {
        this.nbrSlot=nbrSlot;
        onCommand = new Command[nbrSlot];
        offCommand = new Command[nbrSlot];
    }

    public void init(Device...device){
        for(int i=0;i<device.length;i++){
            onCommand[i]=new OnCommand(device[i]);
            offCommand[i]=new OffCommand(device[i]);
            report=new StringBuilder();
        }
    }
    public void onButtonPressed(Integer i){
        onCommand[i].execute();
        undoCommand = onCommand[i];
        commands.add(onCommand[i]);
        report.append(onCommand[i].toString()).append("-");
    }
    public void offButtonPressed(int i) {
        offCommand[i].execute();
        undoCommand = offCommand[i];
        commands.add(offCommand[i]);
        report.append(offCommand[i].toString()).append("-");
    }
    public void undo() {
        undoCommand.undo();
        commands.add(undoCommand);
        report.append(undoCommand.toString()).append("-");
    }


    public Command[] getOnCommand() {
        return onCommand;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public Command[] getOffCommand() {
        return offCommand;
    }

    public Command getUndoCommand() {
        return undoCommand;
    }
}
