package org.hganfower.pattern.factory.factoryMethod;

import org.hganfower.pattern.factory.ICourse;

/**
 * @program: pattern-factory
 * @description: 工厂模型
 * @author: renfei.huang
 * @create: 2021-01-20 22:32
 */
public interface ICourseFactory {

    ICourse create();
}
