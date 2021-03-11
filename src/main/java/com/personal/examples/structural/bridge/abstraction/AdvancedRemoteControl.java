package com.personal.examples.structural.bridge.abstraction;

import com.personal.examples.structural.bridge.implementation.Device;

public class AdvancedRemoteControl extends BasicRemoteControl {

    public AdvancedRemoteControl(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        this.device.setVolume(0);
    }

}
