package com.example.administrator.vehicle.bean;

import java.io.Serializable;
import java.util.List;

public class Device implements Serializable {


    /**
     * data : [{"brandName":"知豆","consumerCode":"U2018027","deviceId":"CY0150000001","faultCodes":"P0004,P0005","frameNo":"LJU70X1Z5HG553670","inputDate":1543334514000,"logoPath":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/5A34.png?Expires=1861061644&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=UuJti5BbU4V15tlUt70SXInHWRo%3D","merchantsCode":"C20181107-001","modelName":"D2","salesmanCode":"U2018001"}]
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
         * brandName : 知豆
         * consumerCode : U2018027
         * deviceId : CY0150000001
         * faultCodes : P0004,P0005
         * frameNo : LJU70X1Z5HG553670
         * inputDate : 1543334514000
         * logoPath : http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/5A34.png?Expires=1861061644&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=UuJti5BbU4V15tlUt70SXInHWRo%3D
         * merchantsCode : C20181107-001
         * modelName : D2
         * salesmanCode : U2018001
         */

        private String brandName;
        private String consumerCode;
        private String deviceId;
        private String faultCodes;
        private String frameNo;
        private long inputDate;
        private String logoPath;
        private String merchantsCode;
        private String modelName;
        private String salesmanCode;

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

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

        public String getFaultCodes() {
            return faultCodes;
        }

        public void setFaultCodes(String faultCodes) {
            this.faultCodes = faultCodes;
        }

        public String getFrameNo() {
            return frameNo;
        }

        public void setFrameNo(String frameNo) {
            this.frameNo = frameNo;
        }

        public long getInputDate() {
            return inputDate;
        }

        public void setInputDate(long inputDate) {
            this.inputDate = inputDate;
        }

        public String getLogoPath() {
            return logoPath;
        }

        public void setLogoPath(String logoPath) {
            this.logoPath = logoPath;
        }

        public String getMerchantsCode() {
            return merchantsCode;
        }

        public void setMerchantsCode(String merchantsCode) {
            this.merchantsCode = merchantsCode;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getSalesmanCode() {
            return salesmanCode;
        }

        public void setSalesmanCode(String salesmanCode) {
            this.salesmanCode = salesmanCode;
        }
    }
}
