package com.example.administrator.vehicle.bean;

/**
 * Created by yangsong on 2017/5/25.
 */

public class User {


    /**
     * data : {"userJson":{"address":"address","birthday":1544112000000,"lastPasswordResetDate":1541598964000,"nickName":"用户","passWord":"Digest_MD5_E1-0A-DC-39-49-BA-59-AB-BE-56-E0-57-F2-0F-88-3E","photo":"photo","remark":"remark","roleType":"1","sex":"1","userCode":"U2018026","userPhone":"13188999988","validind":"1"},"token":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJVMjAxODAwMDAwMyIsImNyZWF0ZWQiOjE1NDU2NDkzNTM0ODgsImV4cCI6MTU0NTY1MTE1M30.F-lmzu29lMgg7VR15aCGK73OzpFR8o6SZU4j2Rxox8Td6A4Eymk5e8JLZC70l1-dq5wztsLYMJcR3yK4KYdpJA"}
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
         * userJson : {"address":"address","birthday":1544112000000,"lastPasswordResetDate":1541598964000,"nickName":"用户","passWord":"Digest_MD5_E1-0A-DC-39-49-BA-59-AB-BE-56-E0-57-F2-0F-88-3E","photo":"photo","remark":"remark","roleType":"1","sex":"1","userCode":"U2018026","userPhone":"13188999988","validind":"1"}
         * token : eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJVMjAxODAwMDAwMyIsImNyZWF0ZWQiOjE1NDU2NDkzNTM0ODgsImV4cCI6MTU0NTY1MTE1M30.F-lmzu29lMgg7VR15aCGK73OzpFR8o6SZU4j2Rxox8Td6A4Eymk5e8JLZC70l1-dq5wztsLYMJcR3yK4KYdpJA
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
             * address : address
             * birthday : 1544112000000
             * lastPasswordResetDate : 1541598964000
             * nickName : 用户
             * passWord : Digest_MD5_E1-0A-DC-39-49-BA-59-AB-BE-56-E0-57-F2-0F-88-3E
             * photo : photo
             * remark : remark
             * roleType : 1
             * sex : 1
             * userCode : U2018026
             * userPhone : 13188999988
             * validind : 1
             */

            private String address;
            private long birthday;
            private long lastPasswordResetDate;
            private String nickName;
            private String passWord;
            private String photo;
            private String remark;
            private String roleType;
            private String sex;
            private String userCode;
            private String userPhone;
            private String validind;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public long getBirthday() {
                return birthday;
            }

            public void setBirthday(long birthday) {
                this.birthday = birthday;
            }

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

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getRoleType() {
                return roleType;
            }

            public void setRoleType(String roleType) {
                this.roleType = roleType;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
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
