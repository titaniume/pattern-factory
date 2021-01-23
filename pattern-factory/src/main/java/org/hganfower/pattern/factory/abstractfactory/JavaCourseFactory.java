package org.hganfower.pattern.factory.abstractfactory;

/**
 * @program: pattern-factory
 * @description: Java课程工厂
 * @author: renfei.huang
 * @create: 2021-01-23 19:55
 */
public class JavaCourseFactory implements  CourseFactory {


    @Override
    public INote createNode() {
        return new JavaNode();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
