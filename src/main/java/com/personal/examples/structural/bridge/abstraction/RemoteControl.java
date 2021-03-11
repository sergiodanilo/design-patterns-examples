package com.personal.examples.structural.bridge.abstraction;

import com.personal.examples.structural.bridge.implementation.Device;

public abstract class RemoteControl {

    public Device device;

    private void togglePower() {
        if (this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }

    public void volumeUp() {
        int old = this.device.getVolume();
        this.device.setVolume(old + 10);
    }

    public void volumeDown() {
        int old = this.device.getVolume();
        this.device.setVolume(old - 10);
    }

    public void channelUp() {
        int old = this.device.getChannel();
        this.device.setChannel(old + 1);
    }

    public void channelDown() {
        int old = this.device.getChannel();
        this.device.setChannel(old - 1);
    }

}
