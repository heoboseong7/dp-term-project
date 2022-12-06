package com.holub.life.strategy;

import com.holub.life.Clock;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcreteActionListener implements ActionListener {

    private TickAction tickAction;

    private Clock clock;

    public ConcreteActionListener(Clock clock){
        this.clock = clock;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = ((JMenuItem)e.getSource()).getName();
        char toDo = name.charAt(0);

        if(toDo == 'T'){
            this.tickAction = new JustTick(clock);
        }else{
            this.tickAction = new StartTicking(clock, toDo);
        }
        tick();
    }

    public void setAction(TickAction tickAction){
        this.tickAction = tickAction;
    }

    public void tick(){
        tickAction.tick();
    }
}
