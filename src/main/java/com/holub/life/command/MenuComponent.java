package com.holub.life.command;

import com.holub.ui.MenuSite;

import java.awt.event.ActionListener;

public class MenuComponent {

    private Object requester;
    private String name;
    private ActionListener modifier;

    public MenuComponent(Object requester, String name, ActionListener modifier) {
        this.requester = requester;
        this.name = name;
        this.modifier = modifier;
    }

    public void add(){
        MenuSite.addLine(requester,"Go",name, modifier);
    }
}
