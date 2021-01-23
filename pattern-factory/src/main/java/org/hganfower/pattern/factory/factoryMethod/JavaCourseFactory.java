package org.hganfower.pattern.factory.factoryMethod;

import org.hganfower.pattern.factory.ICourse;
import org.hganfower.pattern.factory.JavaCourse;

/**
 * @program: pattern-factory
 * @description: java工厂
 * @author: renfei.huang
 * @create: 2021-01-20 22:32
 */
public class JavaCourseFactory {

    public ICourse create(){
        return  new JavaCourse();
    }
}
