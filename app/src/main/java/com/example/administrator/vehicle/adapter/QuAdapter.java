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
import com.example.administrator.vehicle.bean.ItemArticle;
import com.ocnyang.pagetransformerhelp.BannerItemBean;
import com.ocnyang.pagetransformerhelp.BannerViewPager;
import com.ocnyang.pagetransformerhelp.ImageLoaderInterface;

import java.util.ArrayList;
import java.util.List;

public class QuAdapter extends RecyclerView.Adapter<QuAdapter.ViewHolder>{
    private Appmoments mData;
    Context mContext;
    public QuAdapter(Appmoments data ,Context context) {
        this.mData = data;
        this.mContext = context;
    }
    public void updateData(Appmoments data) {
        this.mData = data;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // 实例化展示的view
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_qu, viewGroup, false);
        // 实例化viewholder
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        // 绑定数据
        Appmoments.DataBeanX.DataBean item=mData.getData().getData().get(position);
        viewHolder.title.setText(item.getTitle());
        viewHolder.name.setText(item.getUserName());
        viewHolder.like.setText(item.getAgreenTimes()+"");
        viewHolder.comments.setText(item.getCommentsTimes()+"");

        String[] a ;
        if (item.getResourcePath().indexOf(",")>0){
            a = item.getResourcePath().split(",");
        }else {
            a=new String[1];
            a[0]=item.getResourcePath();
        }

        viewHolder.pager.setData(getViewPagerDatas(a),
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
        return mData.getData() == null ? 0 : mData.getData().getData().size();
    }
    private List<BannerItemBean> getViewPagerDatas(String[]  mData) {
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
        ImageView community_like;

        public ViewHolder(View itemView) {
            super(itemView);
            title =  itemView.findViewById(R.id.item_title);
            name =  itemView.findViewById(R.id.item_name);
            comments =  itemView.findViewById(R.id.item_comments);
            like =  itemView.findViewById(R.id.item_like);
            collect =  itemView.findViewById(R.id.community_collect);
            community_like =  itemView.findViewById(R.id.community_like);
            pager =  itemView.findViewById(R.id.item_pager);
        }
    }

}
