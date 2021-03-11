package com.personal.examples.structural;

import com.personal.examples.structural.bridge.abstraction.AdvancedRemoteControl;
import com.personal.examples.structural.bridge.abstraction.BasicRemoteControl;
import com.personal.examples.structural.bridge.implementation.Device;
import com.personal.examples.structural.bridge.implementation.Radio;
import com.personal.examples.structural.bridge.implementation.TV;
import junit.framework.TestCase;

public class BridgeTest extends TestCase {

    public void testTV() {
        Device tv = new TV();
        BasicRemoteControl basicRemoteControl = new BasicRemoteControl(tv);
        basicRemoteControl.power();
        basicRemoteControl.volumeDown();
        tv.printStatus();

        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(tv);
        advancedRemoteControl.power();
        advancedRemoteControl.mute();
        advancedRemoteControl.channelDown();
        tv.printStatus();
    }

    public void testRadio() {
        Device radio = new Radio();
        BasicRemoteControl basicRemoteControl = new BasicRemoteControl(radio);
        basicRemoteControl.power();
        basicRemoteControl.volumeDown();
        radio.printStatus();

        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
        advancedRemoteControl.power();
        advancedRemoteControl.mute();
        advancedRemoteControl.channelDown();
        radio.printStatus();
    }

}