package org.hganfower.pattern.factory.factoryMethod;

import org.hganfower.pattern.factory.ICourse;

/**
 * @program: pattern-factory
 * @description: 工厂方法测试
 * @author: renfei.huang
 * @create: 2021-01-20 22:34
 */
public class FactoryMethodTest {


    public static void main(String[] args) {

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse iCourse = pythonCourseFactory.create();
        iCourse.recode();

        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        iCourse = javaCourseFactory.create();
        iCourse.recode();
    }
}
