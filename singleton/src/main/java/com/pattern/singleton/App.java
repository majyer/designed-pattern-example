package com.pattern.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        IvoryTower ivoryTower1=IvoryTower.getinstance();
        IvoryTower ivoryTower2=IvoryTower.getinstance();
        LOGGER.info("ivoryTower1={}",ivoryTower1);
        LOGGER.info("ivoryTower2={}",ivoryTower2);

        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower1=ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower2=ThreadSafeLazyLoadedIvoryTower.getInstance();
        LOGGER.info("threadSafeLazyLoadedIvoryTower1={}",threadSafeLazyLoadedIvoryTower1);
        LOGGER.info("threadSafeLazyLoadedIvoryTower2={}",threadSafeLazyLoadedIvoryTower2);

        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking1=ThreadSafeDoubleCheckLocking.getInstance();
        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking2=ThreadSafeDoubleCheckLocking.getInstance();
        LOGGER.info("threadSafeDoubleCheckLocking1={}",threadSafeDoubleCheckLocking1);
        LOGGER.info("threadSafeDoubleCheckLocking2={}",threadSafeDoubleCheckLocking2);

        EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        LOGGER.info("enumIvoryTower1={}", enumIvoryTower1);
        LOGGER.info("enumIvoryTower2={}", enumIvoryTower2);

        InitializingOnDemandHolderIdiom initializingOnDemandHolderIdiom1= InitializingOnDemandHolderIdiom.getInstance();
        InitializingOnDemandHolderIdiom initializingOnDemandHolderIdiom2= InitializingOnDemandHolderIdiom.getInstance();
        LOGGER.info("initializingOnDemandHolderIdiom1={}",initializingOnDemandHolderIdiom1);
        LOGGER.info("initializingOnDemandHolderIdiom2={}",initializingOnDemandHolderIdiom2);
    }
}
