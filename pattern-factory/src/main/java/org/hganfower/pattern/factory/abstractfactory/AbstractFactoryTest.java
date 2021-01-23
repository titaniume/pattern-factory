package org.hganfower.pattern.factory.abstractfactory;

/**
 * @program: pattern-factory
 * @description: 抽象工厂测试
 * @author: renfei.huang
 * @create: 2021-01-23 20:12
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNode().edit();
        javaCourseFactory.createVideo().record();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNode().edit();
        pythonCourseFactory.createVideo().record();
    }
}
