package org.example;

public class OffCommand extends Command{
    public OffCommand(Device device) {
        setDevice(device);
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
    @Override
    public String toString() {
        return "Off";
    }
}
