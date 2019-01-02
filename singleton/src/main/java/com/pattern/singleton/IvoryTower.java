package com.pattern.singleton;

public class IvoryTower {
    private IvoryTower(){}
    private static final IvoryTower INSTANCE = new IvoryTower();
    public static IvoryTower getinstance(){
        return INSTANCE;
    }
}
