package com.holub.life.command;

public class MenuControl {
    private Command command;

    public MenuControl(){};

    public void setCommand(Command command) {
        this.command = command;
        doControl();
    }

    public void doControl(){
        command.execute();
    }
}
