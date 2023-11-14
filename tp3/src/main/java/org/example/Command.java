package org.example;

public abstract class Command {
    protected Device device;

    public void setDevice(Device device) {
        this.device = device;
    }
    abstract void  execute();
    abstract void  undo();

    public Device getDevice() {
        return device;
    }
}
