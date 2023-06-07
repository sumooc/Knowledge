package com.xiwei.logger;

/**
 * 数据库日志记录器工厂类：具体工厂
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 连接数据库...
        //创建数据库日志记录器对象
        Logger databaseLogger = new DatabaseLogger();
        //初始化数据库日志记录器...
        return databaseLogger;
    }
}
