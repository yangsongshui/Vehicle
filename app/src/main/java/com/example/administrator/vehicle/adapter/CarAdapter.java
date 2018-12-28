package com.example.administrator.vehicle.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.bean.Appmoments;
import com.example.administrator.vehicle.bean.CarServices;
import com.ocnyang.pagetransformerhelp.BannerItemBean;
import com.ocnyang.pagetransformerhelp.BannerViewPager;
import com.ocnyang.pagetransformerhelp.ImageLoaderInterface;

import java.util.ArrayList;
import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder>{
    private List<CarServices> mData;
    Context mContext;
    public CarAdapter(List<CarServices> list , Context context) {
        this.mData = list;
        this.mContext = context;
    }
    public void updateData(List<CarServices> data) {
        this.mData = data;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // 实例化展示的view
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_car, viewGroup, false);
        // 实例化viewholder
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        // 绑定数据
        CarServices item=mData.get(position);
        viewHolder.name.setText(mContext.getResources().getText(item.getName()));
        viewHolder.car_icon.setImageResource(item.getIco());


    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }
    private List<BannerItemBean> getViewPagerDatas(String[]  mData) {
        List<BannerItemBean> pagerItemBeanList = new ArrayList<>(mData.length);

        for (int i = 0; i < mData.length; i++) {
            pagerItemBeanList.add(new BannerItemBean(mData[i], "" ));
        }
        return pagerItemBeanList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView car_icon;

        public ViewHolder(View itemView) {
            super(itemView);
            name =  itemView.findViewById(R.id.car_name);
            car_icon =  itemView.findViewById(R.id.car_icon);

        }
    }

}
