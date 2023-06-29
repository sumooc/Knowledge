package com.xiwei;

import java.util.List;

public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objects) {
        super(objects);
    }

    // 实现创建迭代器对象的具体工厂方法
    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
