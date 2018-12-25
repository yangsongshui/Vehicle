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
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.bean.Device;
import com.ocnyang.pagetransformerhelp.BannerItemBean;
import com.ocnyang.pagetransformerhelp.BannerViewPager;

import java.util.ArrayList;
import java.util.List;

public class DeviceAdapter extends RecyclerView.Adapter<DeviceAdapter.ViewHolder>{
    private Device mData;
    Context mContext;
    public DeviceAdapter(Device data , Context context) {
        this.mData = data;
        this.mContext = context;
    }
    public void updateData(Device data) {
        this.mData = data;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // 实例化展示的view
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_device, viewGroup, false);
        // 实例化viewholder
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        // 绑定数据
        Device.DataBean item=mData.getData().get(position);
        viewHolder.device_number.setText(item.getConsumerCode());
        viewHolder.device_num.setText(item.getModelName());
        viewHolder.device_name.setText(item.getBrandName());
        if (item.getLogoPath()!=null){
            MyApplication.newInstance().getGlide() .load(item.getLogoPath()).into( viewHolder.device_logo);
        }
        if (item.getFaultCodes()!=null){
            viewHolder.devicee_start.setText("异常");

            viewHolder.devicee_start.setTextColor(mContext.getResources().getColor(R.color.mandy));
        }else {
            viewHolder.devicee_start.setText("正常");

            viewHolder.devicee_start.setTextColor(mContext.getResources().getColor(R.color.zircon));
        }

    }

    @Override
    public int getItemCount() {
        return mData.getData() == null ? 0 : mData.getData().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView device_number;
        TextView device_num;
        TextView device_name;
        TextView devicee_start;
        ImageView device_logo;

        public ViewHolder(View itemView) {
            super(itemView);
            device_number =  itemView.findViewById(R.id.device_number);
            device_logo =  itemView.findViewById(R.id.device_logo);
            device_num =  itemView.findViewById(R.id.device_num);
            device_name =  itemView.findViewById(R.id.device_name);
            devicee_start =  itemView.findViewById(R.id.devicee_start);

        }
    }

}
