package org.hganfower.pattern.factory.abstractfactory;

/**
 * @program: pattern-factory
 * @description: python笔记
 * @author: renfei.huang
 * @create: 2021-01-23 19:46
 */
public class PythonNote implements INote{
    @Override
    public void edit() {
        System.out.println("编写python笔记");
    }
}
