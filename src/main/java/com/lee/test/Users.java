package com.lee.test;

import java.io.Serializable;
import java.util.List;

/**
 * Author:ljq
 * Date: 2018/5/21
 **/
public class Users implements Serializable {
    private static final long serialVersionUID = -7596793865766208113L;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
