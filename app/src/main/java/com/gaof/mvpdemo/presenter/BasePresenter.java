package com.gaof.mvpdemo.presenter;

import java.lang.ref.WeakReference;

public class BasePresenter<T> {
    //1.View层调用
    public WeakReference<T> mViewRef;
    //绑定activity
    public void attachView(T view){
        this.mViewRef=new WeakReference<>(view);
    }
    //解绑activity
    public void detachView(){
        mViewRef.clear();
    }
}
