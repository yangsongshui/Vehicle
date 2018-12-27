package com.example.administrator.vehicle.bean;

public class Userinfo {

    /**
     * data : {"userCode":"U2018001","identificationCode":"U2018001","passWord":"","nickName":"用户A","userPhone":"","roleType":"1","photo":"U2018001","sex":"1","birthday":"","address":"","autograph":"","lastPasswordResetDate":"","remark":"","validind":"1"}
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
         * userCode : U2018001
         * identificationCode : U2018001
         * passWord :
         * nickName : 用户A
         * userPhone :
         * roleType : 1
         * photo : U2018001
         * sex : 1
         * birthday :
         * address :
         * autograph :
         * lastPasswordResetDate :
         * remark :
         * validind : 1
         */

        private String userCode;
        private String identificationCode;
        private String passWord;
        private String nickName;
        private String userPhone;
        private String roleType;
        private String photo;
        private String sex;
        private String birthday;
        private String address;
        private String autograph;
        private String lastPasswordResetDate;
        private String remark;
        private String validind;

        public String getUserCode() {
            return userCode;
        }

        public void setUserCode(String userCode) {
            this.userCode = userCode;
        }

        public String getIdentificationCode() {
            return identificationCode;
        }

        public void setIdentificationCode(String identificationCode) {
            this.identificationCode = identificationCode;
        }

        public String getPassWord() {
            return passWord;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getUserPhone() {
            return userPhone;
        }

        public void setUserPhone(String userPhone) {
            this.userPhone = userPhone;
        }

        public String getRoleType() {
            return roleType;
        }

        public void setRoleType(String roleType) {
            this.roleType = roleType;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAutograph() {
            return autograph;
        }

        public void setAutograph(String autograph) {
            this.autograph = autograph;
        }

        public String getLastPasswordResetDate() {
            return lastPasswordResetDate;
        }

        public void setLastPasswordResetDate(String lastPasswordResetDate) {
            this.lastPasswordResetDate = lastPasswordResetDate;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getValidind() {
            return validind;
        }

        public void setValidind(String validind) {
            this.validind = validind;
        }
    }
}
