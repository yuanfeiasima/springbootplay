package com.wwt.springbootplay.javaeasy;

/**
 * @author wangwentao09
 * @date 2021-07-31 11:18
 * @desc
 */
public class Apple {

    //类的构造函数，与类同名的方法
    public Apple() {
    }

    //苹果的颜色
    //访问修饰符：public  private
    //访问修饰符  属性的类型    属性的名字
    private     String       color;
    public     String       color2;
    public   static  String    from2 = "北京";

    //获取颜色
    public String getColor() {
        return this.color;
    }

    //设置颜色
    public void setColor(String paramColor) {
        //         赋值  不是等于
        //       <--
        this.color = paramColor;
    }

}
