package org.hganfower.pattern.factory.simplefactory;

import org.hganfower.pattern.factory.ICourse;
import org.hganfower.pattern.factory.JavaCourse;
import org.hganfower.pattern.factory.PythonCourse;

/**
 * @program: pattern-factory
 * @description: 简单工厂
 * @author: renfei.huang
 * @create: 2021-01-20 22:18
 */
public class CourseFactory {

//    public ICourse create(String name){
//        if("java".equals(name)){
//            return  new JavaCourse();
//        }else if("pyphon".equals(name)){
//            return  new PythonCourse();
//        }else{
//            return null;
//        }
//    }

//    public ICourse create(String className){
//        try {
//            if (!(null == className || "".equals(className))) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }

    public  ICourse create (Class<? extends ICourse> clazz){
        try {
            if(null!=clazz){
                return  clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }




}
