package com.xiwei.logger;

/**
 * 文件日志记录器工厂类：具体工厂
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger fileLogger = new FileLogger();
        //创建文件...
        return fileLogger;
    }
}
