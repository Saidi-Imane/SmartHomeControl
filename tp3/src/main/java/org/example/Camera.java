package org.example;

public class Camera implements Device{

    @Override
    public void on() {
        System.out.println("Camera is on");

    }
    @Override
    public void off() {
        System.out.println("Camera is off");
    }
}
