package com.pattern.acyclicvisitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigureForDosVisitor implements AllModemVisitor {
    private static final Logger LOGGER=LoggerFactory.getLogger(ConfigureForDosVisitor.class);

    public void visit(Hayes hayes){LOGGER.info(hayes+" used with Dos configurator.");}

    public void visit(Zoom zoom){LOGGER.info(zoom +" used with Dos condiguration.");}
}
