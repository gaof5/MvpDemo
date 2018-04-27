package com.gaof.mvpdemo.base;



import java.lang.ref.WeakReference;


public class BasePresenter<V extends IBaseView> implements IPresenter<V> {
    //View层
    private WeakReference<V> mViewRef;
    protected V mRootView;
    //绑定activity
    public void attachView(V view){
        mViewRef=new WeakReference<>(view);
        mRootView=mViewRef.get();
    }
    //解绑activity
    public void detachView(){
        mViewRef.clear();
        mRootView=null;
    }

    protected void checkViewAttached() {
        if (mRootView == null) throw new RuntimeException("Please call IPresenter.attachView(IBaseView) before" + " requesting data to the IPresenter");
    }

//    fun addSubscription(disposable: Disposable) {
//        compositeDisposable.add(disposable)
//    }

//    private class MvpViewNotAttachedException extends Exception{
//
////       RuntimeException ("Please call IPresenter.attachView(IBaseView) before" + " requesting data to the IPresenter")
//    }

}
