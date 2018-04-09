package com.gaof.mvpdemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gaof.mvpdemo.R;
import com.gaof.mvpdemo.bean.Girl;

import java.util.List;

public class GirlAdapter extends ArrayAdapter<Girl>{
    public GirlAdapter(@NonNull Context context,List<Girl> girls) {
        super(context, R.layout.girl_list_item,girls);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=View.inflate(getContext(),R.layout.girl_list_item,null);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        Girl girl=getItem(position);
        holder.ivGirlPhoto.setImageResource(girl.getImgRes());
        holder.tvGirlDes.setText(girl.getDescribe());
        return convertView;
    }

    class ViewHolder{

        private ImageView ivGirlPhoto;
        private TextView tvGirlDes;

        ViewHolder(View view){
            ivGirlPhoto=view.findViewById(R.id.ivGirlPhoto);
            tvGirlDes=view.findViewById(R.id.tvGirlDescribe);
        }

    }

}
