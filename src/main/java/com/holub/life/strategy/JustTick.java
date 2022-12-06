package com.holub.life.strategy;

import com.holub.life.Clock;

public class JustTick extends TickAction{
    private Clock clock;

    public JustTick(Clock clock){
        this.clock = clock;
    }
    @Override
    public void tick() {
        clock.tick();
    }
}
