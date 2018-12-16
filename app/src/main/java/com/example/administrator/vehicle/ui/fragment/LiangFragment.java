package com.example.administrator.vehicle.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseFragment;
import com.example.administrator.vehicle.widget.CircleProgressBar;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiangFragment extends BaseFragment {
    CircleProgressBar color_progress_view;

    public LiangFragment() {
        // Required empty public constructor
    }


    @Override
    protected void initData(View layout, Bundle savedInstanceState) {

        color_progress_view = (CircleProgressBar) layout.findViewById(R.id.color_progress_view);
        color_progress_view.setMaxStepNum(100);
        color_progress_view.update(50, 1000);
    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_liang;
    }

}
