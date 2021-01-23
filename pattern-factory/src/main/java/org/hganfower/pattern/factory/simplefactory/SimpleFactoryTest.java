package org.hganfower.pattern.factory.simplefactory;

import org.hganfower.pattern.factory.ICourse;
import org.hganfower.pattern.factory.JavaCourse;
import org.hganfower.pattern.factory.PythonCourse;

/**
 * @program: pattern-factory
 * @description: 简单工厂测试
 * @author: renfei.huang
 * @create: 2021-01-20 22:19
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse  iCourse = new JavaCourse();
//        iCourse.recode();

        CourseFactory courseFactory = new CourseFactory();
//        ICourse iCourse = courseFactory.create("java");
//        ICourse iCourse = courseFactory.create("pyphon");
//        iCourse.recode();



//        ICourse iCourse = courseFactory.create("org.hganfower.pattern.factory.JavaCourse");
//        iCourse.recode();


//        ICourse iCourse = courseFactory.create(JavaCourse.class);
          ICourse  iCourse= courseFactory.create(PythonCourse.class);
          iCourse.recode();


    }
}
