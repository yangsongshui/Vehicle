package com.example.administrator.vehicle.bean;

import java.util.List;

public class DeviceInfo {

    /**
     * data : [{"consumerCode":"U2018000003","deviceId":"CY0150000047","inputDate":1543334518000}]
     * status : 0
     * statusText : Success
     */

    private int status;
    private String statusText;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * consumerCode : U2018000003
         * deviceId : CY0150000047
         * inputDate : 1543334518000
         */

        private String consumerCode;
        private String deviceId;
        private long inputDate;

        public String getConsumerCode() {
            return consumerCode;
        }

        public void setConsumerCode(String consumerCode) {
            this.consumerCode = consumerCode;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public long getInputDate() {
            return inputDate;
        }

        public void setInputDate(long inputDate) {
            this.inputDate = inputDate;
        }
    }
}
