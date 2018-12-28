package com.example.administrator.vehicle.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.bean.CarServices;
import com.example.administrator.vehicle.bean.ErroerCode;
import com.ocnyang.pagetransformerhelp.BannerItemBean;

import java.util.ArrayList;
import java.util.List;

public class ErroerAdapter extends RecyclerView.Adapter<ErroerAdapter.ViewHolder>{
    private List<ErroerCode> mData;
    Context mContext;
    public ErroerAdapter(List<ErroerCode> list , Context context) {
        this.mData = list;
        this.mContext = context;
    }
    public void updateData(List<ErroerCode> data) {
        this.mData = data;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // 实例化展示的view
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_error, viewGroup, false);
        // 实例化viewholder
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        // 绑定数据
        ErroerCode item=mData.get(position);
        viewHolder.error_code.setText(item.getCode());
        viewHolder.error_name.setText(item.getName());
        viewHolder.error_status.setText(item.getStatus());



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

        TextView error_code;
        TextView error_name;
        TextView error_status;

        public ViewHolder(View itemView) {
            super(itemView);
            error_code =  itemView.findViewById(R.id.error_code);
            error_name =  itemView.findViewById(R.id.error_name);
            error_status =  itemView.findViewById(R.id.error_status);

        }
    }

}
