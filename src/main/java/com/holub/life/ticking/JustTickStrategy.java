package com.holub.life.ticking;

import com.holub.life.Clock;

import java.awt.event.ActionEvent;

public class JustTickStrategy extends TickingActionListener {

    public JustTickStrategy(Clock clock) {
        super(clock);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clock.tick();
    }
}
