package org.hganfower.pattern.factory.abstractfactory;

/**
 * @program: pattern-factory
 * @description: python课程工厂
 * @author: renfei.huang
 * @create: 2021-01-23 20:01
 */
public class PythonCourseFactory implements  CourseFactory{
    @Override
    public INote createNode() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVodeo();
    }
}
