package com.xzwb.jul;

import java.io.IOException;
import java.util.logging.*;

/**
 * 自定义配置日志级别
 */

public class JulTest1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("com.xzwb.jul.JulTest1");
        // 关闭系统默认配置
        logger.setUseParentHandlers(false);
        // 控制台输出
        ConsoleHandler consoleHandler = new ConsoleHandler();
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        consoleHandler.setFormatter(simpleFormatter);
        logger.addHandler(consoleHandler);

        // 配置日志级别
        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        // 文件输出
        FileHandler fileHandler = new FileHandler("/home/xzwb/jul.log");
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);



        logger.severe("sever");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
    }
}
