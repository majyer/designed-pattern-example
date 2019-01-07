package com.pattern.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory{
    public Castle createCastle(){return new OrcCastle();}
    public Amy createAmy(){return new OrcAmy();}
    public King createKing(){return new OrcKing();}
}
