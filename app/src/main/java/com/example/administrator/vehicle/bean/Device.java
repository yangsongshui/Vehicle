package com.example.administrator.vehicle.bean;

import java.io.Serializable;
import java.util.List;

public class Device implements Serializable {


    /**
     * status : 0
     * statusText : Success
     * data : [{"deviceId":"CY0150000047","consumerCode":"U2018000003","salesmanCode":"","merchantsCode":"","inputDate":"2018-11-28 00:01:58","frameNo":"JTHBT1GG5H2046253","faultCodes":"","brandName":"雷克萨斯","modelName":"ES200","logoPath":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/4C31.png?Expires=1861336194&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=XWfxqsaaB6qus8tXS9ptjgwMkm0%3D"}]
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
         * deviceId : CY0150000047
         * consumerCode : U2018000003
         * salesmanCode :
         * merchantsCode :
         * inputDate : 2018-11-28 00:01:58
         * frameNo : JTHBT1GG5H2046253
         * faultCodes :
         * brandName : 雷克萨斯
         * modelName : ES200
         * logoPath : http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/4C31.png?Expires=1861336194&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=XWfxqsaaB6qus8tXS9ptjgwMkm0%3D
         */

        private String deviceId;
        private String consumerCode;
        private String salesmanCode;
        private String merchantsCode;
        private String inputDate;
        private String frameNo;
        private String faultCodes;
        private String brandName;
        private String modelName;
        private String logoPath;

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getConsumerCode() {
            return consumerCode;
        }

        public void setConsumerCode(String consumerCode) {
            this.consumerCode = consumerCode;
        }

        public String getSalesmanCode() {
            return salesmanCode;
        }

        public void setSalesmanCode(String salesmanCode) {
            this.salesmanCode = salesmanCode;
        }

        public String getMerchantsCode() {
            return merchantsCode;
        }

        public void setMerchantsCode(String merchantsCode) {
            this.merchantsCode = merchantsCode;
        }

        public String getInputDate() {
            return inputDate;
        }

        public void setInputDate(String inputDate) {
            this.inputDate = inputDate;
        }

        public String getFrameNo() {
            return frameNo;
        }

        public void setFrameNo(String frameNo) {
            this.frameNo = frameNo;
        }

        public String getFaultCodes() {
            return faultCodes;
        }

        public void setFaultCodes(String faultCodes) {
            this.faultCodes = faultCodes;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getLogoPath() {
            return logoPath;
        }

        public void setLogoPath(String logoPath) {
            this.logoPath = logoPath;
        }
    }
}
