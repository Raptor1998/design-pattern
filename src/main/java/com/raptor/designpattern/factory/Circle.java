package com.raptor.designpattern.factory;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/16 14:24
 * @description
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
