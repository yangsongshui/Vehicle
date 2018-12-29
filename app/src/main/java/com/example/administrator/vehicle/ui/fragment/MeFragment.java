package com.example.administrator.vehicle.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseFragment;
import com.example.administrator.vehicle.base.IBaseView;
import com.example.administrator.vehicle.bean.User;
import com.example.administrator.vehicle.bean.Userinfo;
import com.example.administrator.vehicle.ui.DeviceListActivity;
import com.example.administrator.vehicle.ui.SettingActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
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
    Unbinder unbinder;

    @Override
    protected void initData(View layout, Bundle savedInstanceState) {
        User user = MyApplication.newInstance().getUser();
        if (!user.getData().getUserJson().getNickName().isEmpty()) {
            meName.setText(user.getData().getUserJson().getNickName());
        } else {
            meName.setText(user.getData().getUserJson().getUserPhone());
        }
        if (user.getData().getUserJson().getAutograph() != null) {
            meMsg.setText(user.getData().getUserJson().getAutograph());
        }
        if (!user.getData().getUserJson().getPhoto() .isEmpty()) {
            MyApplication.newInstance().getGlide().load(user.getData().getUserJson().getPhoto()).into(mePic);

        }

    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_me;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();

    }

    @OnClick({R.id.me_ed, R.id.iv1,R.id.device_list, R.id.my_service, R.id.news_rl, R.id.setting_rl})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.me_ed:
                break;
            case R.id.iv1:
                break;
            case R.id.device_list:
                startActivity(new Intent(getActivity(),DeviceListActivity.class));
                break;
            case R.id.my_service:
                break;
            case R.id.news_rl:
                break;
            case R.id.setting_rl:
                startActivity(new Intent(getActivity(),SettingActivity.class));
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
