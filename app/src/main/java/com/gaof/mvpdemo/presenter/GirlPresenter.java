package com.gaof.mvpdemo.presenter;

import com.gaof.mvpdemo.bean.Girl;
import com.gaof.mvpdemo.contact.GirlContact;
import com.gaof.mvpdemo.model.GirlModelImpl;
import com.gaof.mvpdemo.model.IGirlModel;
import com.gaof.mvpdemo.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * 表示层
 */
public class GirlPresenter extends BasePresenter<GirlContact.View> implements GirlContact.Presenter{

    //1.View层调用
//    IGirlView girlView;
//    private WeakReference<T> mViewRef;
    //2.model层的引用
    private IGirlModel girlModel=new GirlModelImpl();
    //3.构造方法
//    public GirlPresenter(T girlView){
//
//    }
    //绑定activity
//    public void attachView(T view){
//        this.mViewRef=new WeakReference<>(view);
//    }
//    //解绑activity
//    public void detachView(){
//        mViewRef.clear();
//    }
    //4.执行UI逻辑
    public void fetch(){
        if(mViewRef.get()!=null){
            mViewRef.get().showLoading();
            if(girlModel!=null){
                girlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        mViewRef.get().showGirl(girls);
                    }
                });
            }
        }
    }
}
