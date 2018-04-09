package com.gaof.mvpdemo.model;

import com.gaof.mvpdemo.bean.Girl;

import java.util.ArrayList;
import java.util.List;

public class GirlModelImpl implements IGirlModel{
    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> data=new ArrayList<>();
        data.add(new Girl(1,"美女1"));
        data.add(new Girl(2,"美女2"));
        data.add(new Girl(3,"美女3"));
        girlOnLoadListener.onComplete(data);
    }
}
