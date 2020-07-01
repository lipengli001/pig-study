package com.lpl.pig.study.test;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * log4j学习
 *
 * @Author lipengli
 * @Date 2020/6/23 11:04 上午
 */
public class Log4jDemo {
    public static void main (String [] args) {
        Logger logger = LoggerFactory.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.trace("trace log");
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }
}
