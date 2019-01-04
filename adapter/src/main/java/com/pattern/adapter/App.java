package com.pattern.adapter;

public class App {
    public static void main(String[] args){
        Captian captian=new Captian(new FishingBoatAdapter());
        captian.row();
    }
}
