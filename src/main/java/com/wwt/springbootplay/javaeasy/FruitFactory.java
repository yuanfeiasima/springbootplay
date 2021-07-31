package com.wwt.springbootplay.javaeasy;

/**
 * @author wangwentao09
 * @date 2021-07-31 11:18
 * @desc
 */
public class FruitFactory {

    //new Apple();  调用构造函数
    public Apple getApple(String color) {
        Apple apple = new Apple();
        if ("red".equals(color)) {
            apple.setColor(color);
        } else {
            apple.setColor("green");
        }

        apple.color2 = "yellow";
//        Apple.color2 = "yellow";
        return apple;
    }
}
