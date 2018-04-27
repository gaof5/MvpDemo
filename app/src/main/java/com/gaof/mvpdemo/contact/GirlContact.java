package com.gaof.mvpdemo.contact;

import com.gaof.mvpdemo.base.IBaseView;
import com.gaof.mvpdemo.base.IPresenter;
import com.gaof.mvpdemo.bean.Girl;

import java.util.List;

public class GirlContact {

    public interface View extends IBaseView{
        //显示数据
        void showGirl(List<Girl> girls);
    }

    public interface Presenter extends IPresenter<View>{
        //执行UI逻辑
        void fetch();
    }

}
