package com.holub.life.command;

public class AddCommand extends Command {

    private MenuComponent menuComponent;

    public AddCommand(MenuComponent menuComponent){
        this.menuComponent = menuComponent;
    }

    @Override
    void execute() {
        menuComponent.add();
    }
}
