package com.lpl.pig.study.iterator;

import java.util.List;

/**
 * 迭代器实现
 *
 * @Author lipengli
 * @Date 2020/6/22 12:20 下午
 */
public class ConcreteIterator implements Itetator {
    List<Object> list = null;
    int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Object obj = null;
        if (hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }
}
