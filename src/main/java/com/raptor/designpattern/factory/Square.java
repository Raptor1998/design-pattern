package com.raptor.designpattern.factory;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/16 14:23
 * @description
 */
public class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
