package com.gaof.mvpdemo.model;

import com.gaof.mvpdemo.R;
import com.gaof.mvpdemo.bean.Girl;

import java.util.ArrayList;
import java.util.List;

public class GirlModelImpl implements IGirlModel{
    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> data=new ArrayList<>();
        data.add(new Girl(R.mipmap.girl1,"美女1"));
        data.add(new Girl(R.mipmap.girl2,"美女2"));
        data.add(new Girl(R.mipmap.girl3,"美女3"));
        data.add(new Girl(R.mipmap.girl4,"美女4"));
        girlOnLoadListener.onComplete(data);
    }
}
