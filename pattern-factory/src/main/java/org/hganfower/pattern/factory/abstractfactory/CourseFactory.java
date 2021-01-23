package org.hganfower.pattern.factory.abstractfactory;

/**
 * @program: pattern-factory
 * @description: 抽象工厂是用户的入口
 * @author: renfei.huang
 * @create: 2021-01-23 19:44
 */
public interface CourseFactory {

    INote createNode();
    IVideo createVideo();
}
