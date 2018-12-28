package com.example.administrator.vehicle.bean;

/**
 * Created by yangsong on 2017/5/25.
 */

public class User {


    /**
     * status : 0
     * statusText : Success
     * data : {"userJson":{"userCode":"U2018000003","identificationCode":"","passWord":"Digest_MD5_E1-0A-DC-39-49-BA-59-AB-BE-56-E0-57-F2-0F-88-3E","nickName":"","userPhone":"18664570155","roleType":"1","photo":"","sex":"","birthday":"","address":"","autograph":"","lastPasswordResetDate":"","remark":"","validind":"1"},"token":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJVMjAxODAwMDAwMyIsImNyZWF0ZWQiOjE1NDU5NzU4MzQxODcsImV4cCI6MTU0NTk3NzYzNH0.DP2OquyoAdDpggZMr1gOaEowMkSBj7Aubmks0q3iXf5uFbKf2DezOC7vaOrdLY9Lx4ygOI3arJP9lArqkUCiag"}
     */

    private int status;
    private String statusText;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * userJson : {"userCode":"U2018000003","identificationCode":"","passWord":"Digest_MD5_E1-0A-DC-39-49-BA-59-AB-BE-56-E0-57-F2-0F-88-3E","nickName":"","userPhone":"18664570155","roleType":"1","photo":"","sex":"","birthday":"","address":"","autograph":"","lastPasswordResetDate":"","remark":"","validind":"1"}
         * token : eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJVMjAxODAwMDAwMyIsImNyZWF0ZWQiOjE1NDU5NzU4MzQxODcsImV4cCI6MTU0NTk3NzYzNH0.DP2OquyoAdDpggZMr1gOaEowMkSBj7Aubmks0q3iXf5uFbKf2DezOC7vaOrdLY9Lx4ygOI3arJP9lArqkUCiag
         */

        private UserJsonBean userJson;
        private String token;

        public UserJsonBean getUserJson() {
            return userJson;
        }

        public void setUserJson(UserJsonBean userJson) {
            this.userJson = userJson;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class UserJsonBean {
            /**
             * userCode : U2018000003
             * identificationCode :
             * passWord : Digest_MD5_E1-0A-DC-39-49-BA-59-AB-BE-56-E0-57-F2-0F-88-3E
             * nickName :
             * userPhone : 18664570155
             * roleType : 1
             * photo :
             * sex :
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
}
