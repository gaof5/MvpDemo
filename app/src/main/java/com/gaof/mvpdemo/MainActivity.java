package com.gaof.mvpdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.gaof.mvpdemo.bean.Girl;
import com.gaof.mvpdemo.presenter.GirlPresenter;
import com.gaof.mvpdemo.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView{

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
//        girlPresenter=new GirlPresenter<>();
//        girlPresenter.attachView(this);
        presenter.fetch();
    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this,"显示数据",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirl(List<Girl> girls) {
        listView.setAdapter(new ArrayAdapter<Girl>(this,android.R.layout.simple_list_item_1,girls));
    }
}