package com.study.thinking.factory.factory.idcard;

import com.wyt.headfirst.thinking.factory.factory.framework.Product;

/**
 * 继承产品类,实现如何使用卡
 *
 * @author Darcy
 *         Created by Administrator on 2017/3/21.
 */
public class IDCard extends Product {
    private String owner;
    private int serial;

    /**
     * 构造器不加修饰符,目的是无法通过new来构造对象,只能通过工厂方法createProduct构建
     * 权限:只有自己类内部,子类,同包的类 能够访问构造器
     *
     * @param owner 拥有着
     */
    IDCard(String owner, int serial) {
        System.out.println(" 制作" + owner + "(" + serial + ")" + " 的ID卡");
        this.owner = owner;
        this.serial = serial;
    }

    public int getSerial() {
        return serial;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println(" 使用" + owner + "(" + serial + ")" + " 的ID卡");
    }
}
