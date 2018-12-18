package com.example.administrator.vehicle.ui.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseFragment;
import com.ocnyang.pagetransformerhelp.BannerItemBean;
import com.ocnyang.pagetransformerhelp.BannerViewPager;
import com.ocnyang.pagetransformerhelp.ImageLoaderInterface;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuFragment extends BaseFragment {
    private final int[] mData = {R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img0, R.drawable.img1,R.drawable.img3, R.drawable.img4,R.drawable.img0, R.drawable.img1,};
    @BindView(R.id.viewPager2)
    BannerViewPager mBannerViewPager;
    private ViewPager mViewPager1;

    @Override
    protected void initData(View layout, Bundle savedInstanceState) {

        mBannerViewPager.setData(getViewPagerDatas(),//设置数据
                new ImageLoaderInterface() {//设置图片加载器
                    @Override
                    public void displayImage(Context context, Object imgPath, ImageView imageView) {
                        Glide.with(context).load(imgPath).into(imageView);
                    }
                }).setPageTransformer(null)//设置切换效果
                .setAutoPlay(false)//设置是否自动播放
                .setOnBannerItemClickListener(new BannerViewPager.OnBannerItemClickListener() {//设置item的监听事件
                    @Override
                    public void OnClickLister(View view, int currentItem) {
                        Toast.makeText(getActivity(), "" + currentItem, Toast.LENGTH_SHORT).show();
                    }
                })
                .setHaveTitle(false);//设置是否显示标题
    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_qu;
    }
    private List<BannerItemBean> getViewPagerDatas() {
        List<BannerItemBean> pagerItemBeanList = new ArrayList<>(mData.length);

        for (int i = 0; i < mData.length; i++) {
            pagerItemBeanList.add(new BannerItemBean(mData[i], "欧神是世界上最帅的男人 +" + (i + 1)));
        }
        return pagerItemBeanList;
    }
}
