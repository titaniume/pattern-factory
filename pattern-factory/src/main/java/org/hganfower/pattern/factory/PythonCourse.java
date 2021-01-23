package org.hganfower.pattern.factory;

/**
 * @program: pattern-factory
 * @description: 爬虫课程录制
 * @author: renfei.huang
 * @create: 2021-01-20 22:11
 */
public class PythonCourse implements ICourse{
    @Override
    public void recode() {
        System.out.println("正在录制pyhhon课程");
    }
}
