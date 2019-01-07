package com.pattern.acyclicvisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigureForUnixVisitor implements ZoomVisitor{
    private static final Logger LOGGER=LoggerFactory.getLogger(ConfigureForUnixVisitor.class);
    public void visit(Zoom zoom){LOGGER.info(zoom +" used with unix configuration.");}
}
