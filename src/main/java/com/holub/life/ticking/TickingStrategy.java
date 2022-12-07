package com.holub.life.ticking;

import com.holub.life.Clock;

import java.awt.event.ActionEvent;

public class TickingStrategy extends TickingActionListener {
    private int millisecondsBetweenTicks;

    public TickingStrategy(Clock clock, int millisecondsBetweenTicks) {
        super(clock);
        this.millisecondsBetweenTicks = millisecondsBetweenTicks;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clock.startTicking(millisecondsBetweenTicks);
    }
}
