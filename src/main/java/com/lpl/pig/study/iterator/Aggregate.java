package com.lpl.pig.study.iterator;

/**
 * 聚合类
 *
 * @Author lipengli
 * @Date 2020/6/22 12:16 下午
 */
public interface Aggregate {

    void add(Object obj);

    Object remoce(Object obj);

    Itetator getItetator();
}
