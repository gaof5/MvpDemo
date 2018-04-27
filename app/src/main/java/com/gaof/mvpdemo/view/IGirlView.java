package com.gaof.mvpdemo.view;

import com.gaof.mvpdemo.base.IBaseView;
import com.gaof.mvpdemo.bean.Girl;

import java.util.List;

public interface IGirlView extends IBaseView{

    //加载数据框
    void showLoading();
    //显示数据
    void showGirl(List<Girl> girls);

}
