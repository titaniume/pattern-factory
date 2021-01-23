package org.hganfower.pattern.factory.factoryMethod;

import org.hganfower.pattern.factory.ICourse;
import org.hganfower.pattern.factory.PythonCourse;

/**
 * @program: pattern-factory
 * @description: python工厂
 * @author: renfei.huang
 * @create: 2021-01-20 22:33
 */
public class PythonCourseFactory {

    public  ICourse create(){
        return  new PythonCourse();
    }
}
