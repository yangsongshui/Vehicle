package com.example.administrator.vehicle.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.bean.ItemArticle;
import com.ocnyang.pagetransformerhelp.BannerItemBean;
import com.ocnyang.pagetransformerhelp.BannerViewPager;
import com.ocnyang.pagetransformerhelp.ImageLoaderInterface;

import java.util.ArrayList;
import java.util.List;

public class QuAdapter extends RecyclerView.Adapter<QuAdapter.ViewHolder>{
    private ArrayList<ItemArticle> mData;
    Context mContext;
    public QuAdapter(ArrayList<ItemArticle> data ,Context context) {
        this.mData = data;
        this.mContext = context;
    }
    public void updateData(ArrayList<ItemArticle> data) {
        this.mData = data;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // 实例化展示的view
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.qu_item, viewGroup, false);
        // 实例化viewholder
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        // 绑定数据
        ItemArticle item=mData.get(position);
        viewHolder.title.setText(item.getTitle());
        viewHolder.name.setText(item.getName());
        viewHolder.like.setText(item.getLike());
        viewHolder.comments.setText(item.getComments());
        viewHolder.collect.setImageResource(item.getCollect()==0?R.drawable.community_collect:R.drawable.forgot_del);
        viewHolder.pager.setData(getViewPagerDatas(item.getmData()),
                new ImageLoaderInterface() {
                    @Override
                    public void displayImage(Context context, Object imgPath, ImageView imageView) {
                        Glide.with(context).load(imgPath).into(imageView);
                    }
                }).setPageTransformer(null)//设置切换效果
                .setAutoPlay(false)//设置是否自动播放
                .setHaveTitle(false);//设置是否显示标题
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }
    private List<BannerItemBean> getViewPagerDatas(int[]  mData) {
        List<BannerItemBean> pagerItemBeanList = new ArrayList<>(mData.length);

        for (int i = 0; i < mData.length; i++) {
            pagerItemBeanList.add(new BannerItemBean(mData[i], "" ));
        }
        return pagerItemBeanList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView name;
        TextView like;
        TextView comments;
        BannerViewPager pager;
        ImageView collect;

        public ViewHolder(View itemView) {
            super(itemView);
            title =  itemView.findViewById(R.id.item_title);
            name =  itemView.findViewById(R.id.item_name);
            comments =  itemView.findViewById(R.id.item_comments);
            like =  itemView.findViewById(R.id.item_like);
            collect =  itemView.findViewById(R.id.community_collect);
            pager =  itemView.findViewById(R.id.item_pager);
        }
    }

}
