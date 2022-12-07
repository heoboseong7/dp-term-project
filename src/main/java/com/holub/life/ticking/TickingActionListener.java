package com.holub.life.ticking;

import com.holub.life.Clock;

import java.awt.event.ActionListener;

abstract class TickingActionListener implements ActionListener {
    protected Clock clock;

    public TickingActionListener(Clock clock) {
        this.clock = clock;
    }
}
