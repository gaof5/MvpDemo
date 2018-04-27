package com.gaof.mvpdemo;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.gaof.mvpdemo.adapter.GirlAdapter;
import com.gaof.mvpdemo.base.BaseActivity;
import com.gaof.mvpdemo.bean.Girl;
import com.gaof.mvpdemo.contact.GirlContact;
import com.gaof.mvpdemo.presenter.GirlPresenter;
import com.gaof.mvpdemo.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<GirlContact.View,GirlContact.Presenter> implements GirlContact.View{

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
//        girlPresenter=new GirlPresenter<>();
//        girlPresenter.attachView(this);
        mPresenter.fetch();
    }

    @Override
    public GirlContact.Presenter createPresenter() {
        return new GirlPresenter();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this,"显示数据",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void showGirl(List<Girl> girls) {
        if(null!=girls){
            GirlAdapter girlAdapter=new GirlAdapter(this,girls);
            listView.setAdapter(girlAdapter);
        }
//        listView.setAdapter(new ArrayAdapter<Girl>(this,android.R.layout.simple_list_item_1,girls));
    }
}
