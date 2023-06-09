package com.xiwei;

public class ProxySearcher implements Searcher {
    // 维持一个对真实主题的引用
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        //如果身份验证成功，则执行查询
        if (validate(userId)) {
            //调用真实主题对象的查询方法
            String search = searcher.doSearch(userId, keyword);
            this.log(userId);
            return search;
        } else {
            return null;
        }
    }

    //创建访问验证对象并调用其validate()方法实现身份验证
    private boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    //创建日志记录对象并调用log()方法实现日志记录
    private void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
