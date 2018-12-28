package com.example.administrator.vehicle.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseActivity;
import com.ocnyang.pagetransformerhelp.BannerItemBean;
import com.ocnyang.pagetransformerhelp.BannerViewPager;
import com.ocnyang.pagetransformerhelp.ImageLoaderInterface;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class AppmomentsInfoActivity extends BaseActivity {

    private final int[] mData = {R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img0, R.drawable.img1, R.drawable.img3, R.drawable.img4, R.drawable.img0, R.drawable.img1,};
    @BindView(R.id.me_pic)
    CircleImageView mePic;
    @BindView(R.id.me_name)
    TextView meName;
    @BindView(R.id.me_time)
    TextView meTime;
    @BindView(R.id.info_msg)
    TextView infoMsg;
    @BindView(R.id.info_pager)
    BannerViewPager infoPager;
    @BindView(R.id.comments)
    TextView comments;
    @BindView(R.id.like)
    TextView like;

    @Override
    protected int getContentView() {
        return R.layout.activity_appmoments_info;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        infoPager.setData(getViewPagerDatas(mData),
                new ImageLoaderInterface() {
                    @Override
                    public void displayImage(Context context, Object imgPath, ImageView imageView) {
                        Glide.with(context).load(imgPath).into(imageView);
                    }
                }).setPageTransformer(null)//设置切换效果
                .setAutoPlay(false)//设置是否自动播放
                .setHaveTitle(false);//设置是否显示标题
    }



    @OnClick({R.id.register_left_iv, R.id.register_rig_iv, R.id.collection_iv, R.id.collection, R.id.comments_iv, R.id.like_iv, R.id.like})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register_left_iv:
                finish();
                break;
            case R.id.register_rig_iv:
                break;
            case R.id.collection_iv:
                break;
            case R.id.collection:
                break;
            case R.id.comments_iv:
                break;
            case R.id.like_iv:
                break;
            case R.id.like:
                break;
        }
    }
    private List<BannerItemBean> getViewPagerDatas(int[] mData) {
        List<BannerItemBean> pagerItemBeanList = new ArrayList<>(mData.length);

        for (int i = 0; i < mData.length; i++) {
            pagerItemBeanList.add(new BannerItemBean(mData[i], ""));
        }
        return pagerItemBeanList;
    }

}
