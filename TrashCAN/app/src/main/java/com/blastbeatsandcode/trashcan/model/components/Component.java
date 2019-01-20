package com.blastbeatsandcode.trashcan.model.components;

import com.blastbeatsandcode.trashcan.model.states.StatusEnum;

public interface Component {
    private StatusEnum _status;

    public StatusEnum getStatus();
    public boolean turnOn();
    public boolean turnOff();
}
