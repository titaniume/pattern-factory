package org.hganfower.pattern.factory.abstractfactory;

/**
 * @program: pattern-factory
 * @description: 录制java视频
 * @author: renfei.huang
 * @create: 2021-01-23 19:48
 */
public class JavaVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
