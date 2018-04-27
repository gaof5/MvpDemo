package com.gaof.mvpdemo.base;

public interface IPresenter<V> {

    void attachView(V mRootView);

    void detachView();

}
