package com.lee.entity;

/**
 * Author:ljq
 * Date: 2018/5/30
 **/
public class PCData {
    private final int intData;

    public PCData(int d) {
        this.intData = d;
    }

    public PCData(String d) {
        intData = Integer.parseInt(d);
    }

    public int getIntData() {
        return intData;
    }

    @Override
    public String toString() {
        return "PCData{" +
                "intData=" + intData +
                '}';
    }
}
