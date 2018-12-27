package com.example.administrator.vehicle.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseFragment;
import com.example.administrator.vehicle.base.IBaseView;
import com.example.administrator.vehicle.bean.User;
import com.example.administrator.vehicle.bean.Userinfo;

import butterknife.BindView;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends BaseFragment implements IBaseView<Userinfo> {


    @BindView(R.id.me_pic)
    CircleImageView mePic;
    @BindView(R.id.me_name)
    TextView meName;
    @BindView(R.id.me_msg)
    TextView meMsg;
    @Override
    protected void initData(View layout, Bundle savedInstanceState) {
        User user=MyApplication.newInstance().getUser();
        if (user.getData().getUserJson().getNickName()!=null){
            meName.setText(user.getData().getUserJson().getNickName());
        }else {
            meName.setText(user.getData().getUserJson().getUserPhone());
        }
        if (user.getData().getUserJson().getAutograph()!=null){
            meMsg.setText(user.getData().getUserJson().getAutograph());

        }
        if (user.getData().getUserJson().getPhoto()!=null){
            MyApplication.newInstance().getGlide() .load(user.getData().getUserJson().getPhoto()).into(mePic);

        }

    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_me;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    @OnClick({R.id.me_ed, R.id.iv1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.me_ed:
                break;
            case R.id.iv1:
                break;
        }
    }

    @Override
    public void disimissProgress() {

    }

    @Override
    public void loadDataSuccess(Userinfo tData) {

    }

    @Override
    public void loadDataError(Throwable throwable) {

    }
}
