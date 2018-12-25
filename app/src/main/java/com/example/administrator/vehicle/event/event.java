package com.example.administrator.vehicle.event;

import com.example.administrator.vehicle.bean.Device;

public class event {
    private Device mDevice;
    public event(Device device) {

        mDevice = device;
    }
    public Device getDevice(){
        return mDevice;
    }
}
