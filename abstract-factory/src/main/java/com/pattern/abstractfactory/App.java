package com.pattern.abstractfactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

public class App {

    private static final Logger LOGGER=LoggerFactory.getLogger(App.class);

    private King king;
    private Amy amy;
    private Castle castle;

    public void createKingdom(final KingdomFactory factory){
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setAmy(factory.createAmy());
    }

    King getKing(final KingdomFactory factory){return factory.createKing();}
    Castle getCastle(final KingdomFactory factory){return factory.createCastle();}
    Amy getAmy(final KingdomFactory factory){return factory.createAmy();}

    public King getKing(){return king;}
    public Amy getAmy(){return amy;}

    public Castle getCastle() {
        return castle;
    }

    private void setKing(final King king){
        this.king=king;
    }
    private void setAmy(final  Amy amy){
        this.amy=amy;
    }
    private void setCastle(final  Castle castle){
        this.castle=castle;
    }

    public static class FactoryMaker{
        public enum KingdomType{
            EIF,ORC
        }

        public static KingdomFactory makeFactory(KingdomType type){
            switch(type){
                case EIF:
                    return new EIfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");

            }
        }
    }
    public static void main(String[] args){

    }
}
