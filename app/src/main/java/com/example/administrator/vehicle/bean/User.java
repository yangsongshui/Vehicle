package com.example.administrator.vehicle.bean;

/**
 * Created by yangsong on 2017/5/25.
 */

public class User {


    /**
     * data : {"userJson":{"lastPasswordResetDate":1541598964000,"nickName":"管理员","passWord":"Digest_MD5_E1-0A-DC-39-49-BA-59-AB-BE-56-E0-57-F2-0F-88-3E","roleType":"0","userCode":"admin","userPhone":"admin","validind":"1"},"token":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE1NDQwODEzNjA4NTgsImV4cCI6MTU0NDA4MzE2MH0.GSgCDrtKJ8EEmkoLoDupQnmZdduQC0MG0Q5IZGtSf0zx9551r_zrGn6y2QN7gJCr_e3B6uMt8IihrsY0wTY_mA"}
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
         * userJson : {"lastPasswordResetDate":1541598964000,"nickName":"管理员","passWord":"Digest_MD5_E1-0A-DC-39-49-BA-59-AB-BE-56-E0-57-F2-0F-88-3E","roleType":"0","userCode":"admin","userPhone":"admin","validind":"1"}
         * token : eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE1NDQwODEzNjA4NTgsImV4cCI6MTU0NDA4MzE2MH0.GSgCDrtKJ8EEmkoLoDupQnmZdduQC0MG0Q5IZGtSf0zx9551r_zrGn6y2QN7gJCr_e3B6uMt8IihrsY0wTY_mA
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
             * lastPasswordResetDate : 1541598964000
             * nickName : 管理员
             * passWord : Digest_MD5_E1-0A-DC-39-49-BA-59-AB-BE-56-E0-57-F2-0F-88-3E
             * roleType : 0
             * userCode : admin
             * userPhone : admin
             * validind : 1
             */

            private long lastPasswordResetDate;
            private String nickName;
            private String passWord;
            private String roleType;
            private String userCode;
            private String userPhone;
            private String validind;

            public long getLastPasswordResetDate() {
                return lastPasswordResetDate;
            }

            public void setLastPasswordResetDate(long lastPasswordResetDate) {
                this.lastPasswordResetDate = lastPasswordResetDate;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public String getPassWord() {
                return passWord;
            }

            public void setPassWord(String passWord) {
                this.passWord = passWord;
            }

            public String getRoleType() {
                return roleType;
            }

            public void setRoleType(String roleType) {
                this.roleType = roleType;
            }

            public String getUserCode() {
                return userCode;
            }

            public void setUserCode(String userCode) {
                this.userCode = userCode;
            }

            public String getUserPhone() {
                return userPhone;
            }

            public void setUserPhone(String userPhone) {
                this.userPhone = userPhone;
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
