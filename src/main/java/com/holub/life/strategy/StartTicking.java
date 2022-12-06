package com.holub.life.strategy;

import com.holub.life.Clock;

public class StartTicking extends TickAction{
    private Clock clock;
    private char toDo;

    public StartTicking(Clock clock, char toDo){
        this.clock = clock;
        this.toDo = toDo;
    }

    @Override
    public void tick() {
        int tickTime = toDo=='A'?500:toDo=='S'?150:toDo=='M'?70:toDo=='F'?30:0;
        clock.startTicking(tickTime);
    }
}
