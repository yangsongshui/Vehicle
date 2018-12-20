package com.example.administrator.vehicle.bean;

public class Code {

    /**
     * data : {"sendTime":1544341143766,"userPhone":"13168061332","verificationCode":"4568"}
     * status : 0
     * statusText : Success
     */

    private DataBean data;
    private int status;
    private String statusText;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

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

    public static class DataBean {
        /**
         * sendTime : 1544341143766
         * userPhone : 13168061332
         * verificationCode : 4568
         */

        private long sendTime;
        private String userPhone;
        private String verificationCode;

        public long getSendTime() {
            return sendTime;
        }

        public void setSendTime(long sendTime) {
            this.sendTime = sendTime;
        }

        public String getUserPhone() {
            return userPhone;
        }

        public void setUserPhone(String userPhone) {
            this.userPhone = userPhone;
        }

        public String getVerificationCode() {
            return verificationCode;
        }

        public void setVerificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "sendTime=" + sendTime +
                    ", userPhone='" + userPhone + '\'' +
                    ", verificationCode='" + verificationCode + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Code{" +
                "data=" + data +
                ", status=" + status +
                ", statusText='" + statusText + '\'' +
                '}';
    }
}
