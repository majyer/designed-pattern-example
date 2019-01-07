package com.pattern.abstractfactory;

public class EIfKingdomFactory implements KingdomFactory{
    public Castle createCastle(){return new EIfCastle();}
    public Amy createAmy(){return new EIfAmy();}
    public King createKing(){return new EIfKing();}
}
