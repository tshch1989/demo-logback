package com.example.demologback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogMain {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogMain.class);
        logger.info("我会被打印到控制台");
        logger.debug("我不会被打印到控制台,因为有更细粒度的日志记录级别com.example.demologback设置为INFO");
    }
}
