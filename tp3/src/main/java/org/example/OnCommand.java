package org.example;

public class OnCommand extends Command {
    public OnCommand(Device device) {
        setDevice(device);
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
    @Override
    public String toString() {
        return "On";
    }
}
