package com.pattern.acyclicvisitor;

public interface HayesVisitor extends ModemVisitor{
    void visit(Hayes hayes);
}
