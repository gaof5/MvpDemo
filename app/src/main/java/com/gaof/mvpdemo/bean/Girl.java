package com.gaof.mvpdemo.bean;

public class Girl {

    private String imgStr;
    private int imgRes;
    private String describe;

    public Girl() {
    }

    public Girl(int imgRes, String describe) {
        this.imgRes = imgRes;
        this.describe = describe;
    }

    public String getImgStr() {
        return imgStr;
    }

    public void setImgStr(String imgStr) {
        this.imgStr = imgStr;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
