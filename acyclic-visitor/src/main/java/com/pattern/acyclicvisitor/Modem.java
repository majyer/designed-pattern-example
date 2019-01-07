package com.pattern.acyclicvisitor;

public abstract class Modem {
    public abstract void accept(ModemVisitor modemVisitor);
}
