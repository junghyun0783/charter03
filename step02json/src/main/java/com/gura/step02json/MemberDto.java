package com.gura.step02json;

import java.io.Serializable;

/**
 * Created by 김중현 on 2017-02-15.
 */

public class MemberDto implements Serializable{
    private int num;
    private String name;
    private String addr;

    public MemberDto(){}

    public MemberDto(int num, String name, String addr) {
        this.num = num;
        this.name = name;
        this.addr = addr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}