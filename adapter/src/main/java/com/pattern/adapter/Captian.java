package com.pattern.adapter;

public class Captian {
    private RowingBoat rowingBoat;
    public Captian(){}

    public Captian(RowingBoat rowingBoat){this.rowingBoat=rowingBoat;}

    public void setRowingBoat(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row(){
        rowingBoat.row();
    }
}
