package com.xiwei.logger;

public class TestClient {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();

        //文件日志记录器工厂模式测试略
    }
}
