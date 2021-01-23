package org.hganfower.pattern.factory;

/**
 * @program: pattern-factory
 * @description: java课程
 * @author: renfei.huang
 * @create: 2021-01-20 22:10
 */
public class JavaCourse implements ICourse{
    @Override
    public void recode() {
        System.out.println("我在录制java课程中");
    }
}
