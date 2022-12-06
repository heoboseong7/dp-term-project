package com.holub.patterns;

import java.awt.*;

public enum SingletonEnum {

    INSTANCE;

    private Pattern pattern = new DefaultPattern();
    private Pattern pluspattern = new PlusPattern();

    public Pattern getPattern(){
        return pattern;
    }

    public Pattern getPluspattern() {
        return pluspattern;
    }




}
