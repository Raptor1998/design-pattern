package com.raptor.designpattern.factory;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/16 14:22
 * @description
 */
public class Rectangle implements Shape{
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
