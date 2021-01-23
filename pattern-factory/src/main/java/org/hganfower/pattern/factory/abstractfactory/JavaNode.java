package org.hganfower.pattern.factory.abstractfactory;

/**
 * @program: pattern-factory
 * @description: Java笔记
 * @author: renfei.huang
 * @create: 2021-01-23 19:45
 */
public class JavaNode implements INote{
    @Override
    public void edit() {
        System.out.println("编写java笔记");
    }
}
