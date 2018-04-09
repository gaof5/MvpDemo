package com.gaof.mvpdemo.model;

import com.gaof.mvpdemo.bean.Girl;

import java.util.List;

/**
 * 用来加载数据
 */
public interface IGirlModel {
    void loadGirl(GirlOnLoadListener girlOnLoadListener);
    //回调接口方式返回数据
    interface GirlOnLoadListener{
        void onComplete(List<Girl> girls);
    }
}
