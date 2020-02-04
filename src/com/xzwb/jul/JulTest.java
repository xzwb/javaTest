package com.xzwb.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JulTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.xzwb.jul.JulTest");
        // jul默认提供的日志级别是info
        logger.severe("sever");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");


        //logger.log(Level.INFO, "用户信息: {0}, {1}", new Object[]{"xzwb", 1});
    }
}
