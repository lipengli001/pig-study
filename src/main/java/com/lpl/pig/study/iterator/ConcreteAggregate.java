package com.lpl.pig.study.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚合类实现
 *
 * @Author lipengli
 * @Date 2020/6/22 12:27 下午
 */
public class ConcreteAggregate implements Aggregate {
    List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public Object remoce(Object obj) {
        return list.remove(obj);
    }

    @Override
    public Itetator getItetator() {
        return new ConcreteIterator(list);
    }
}
