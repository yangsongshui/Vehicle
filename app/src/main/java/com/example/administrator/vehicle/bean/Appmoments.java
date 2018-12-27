package com.example.administrator.vehicle.bean;

import java.util.List;

public class Appmoments {


    /**
     * data : {"data":[{"agreenForMe":"1","agreenTimes":2,"cllectForMe":"1","commentsTimes":2,"contents":"朋友圈内容","inputDate":1541771308000,"momentsId":1,"resourcePath":"brand/001.png","title":"发个朋友圈AA","userCode":"U2018001","userName":"用户A","valid":"1"},{"agreenForMe":"1","agreenTimes":0,"cllectForMe":"1","commentsTimes":0,"contents":"朋友圈内容","inputDate":1541771682000,"momentsId":2,"resourcePath":"brand/4131.png","title":"发个朋友圈BB","userCode":"U2018002","userName":"用户B","valid":"1"},{"agreenForMe":"1","agreenTimes":0,"cllectForMe":"1","commentsTimes":0,"contents":"朋友圈内容","inputDate":1541824360000,"momentsId":3,"resourcePath":"brand/001.png","title":"发个朋友圈","userCode":"U2018003","userName":"用户C","valid":"1"}],"pageNo":1,"perPage":20,"totalCount":3}
     * status : 0
     * statusText : Success
     */

    private DataBeanX data;
    private int status;
    private String statusText;

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
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

    public static class DataBeanX {
        /**
         * data : [{"agreenForMe":"1","agreenTimes":2,"cllectForMe":"1","commentsTimes":2,"contents":"朋友圈内容","inputDate":1541771308000,"momentsId":1,"resourcePath":"brand/001.png","title":"发个朋友圈AA","userCode":"U2018001","userName":"用户A","valid":"1"},{"agreenForMe":"1","agreenTimes":0,"cllectForMe":"1","commentsTimes":0,"contents":"朋友圈内容","inputDate":1541771682000,"momentsId":2,"resourcePath":"brand/4131.png","title":"发个朋友圈BB","userCode":"U2018002","userName":"用户B","valid":"1"},{"agreenForMe":"1","agreenTimes":0,"cllectForMe":"1","commentsTimes":0,"contents":"朋友圈内容","inputDate":1541824360000,"momentsId":3,"resourcePath":"brand/001.png","title":"发个朋友圈","userCode":"U2018003","userName":"用户C","valid":"1"}]
         * pageNo : 1
         * perPage : 20
         * totalCount : 3
         */

        private int pageNo;
        private int perPage;
        private int totalCount;
        private List<DataBean> data;

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public int getPerPage() {
            return perPage;
        }

        public void setPerPage(int perPage) {
            this.perPage = perPage;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * agreenForMe : 1
             * agreenTimes : 2
             * cllectForMe : 1
             * commentsTimes : 2
             * contents : 朋友圈内容
             * inputDate : 1541771308000
             * momentsId : 1
             * resourcePath : brand/001.png
             * title : 发个朋友圈AA
             * userCode : U2018001
             * userName : 用户A
             * valid : 1
             */

            private String agreenForMe;
            private int agreenTimes;
            private String cllectForMe;
            private int commentsTimes;
            private String contents;
            private long inputDate;
            private int momentsId;
            private String resourcePath;
            private String title;
            private String userCode;
            private String userName;
            private String valid;

            public String getAgreenForMe() {
                return agreenForMe;
            }

            public void setAgreenForMe(String agreenForMe) {
                this.agreenForMe = agreenForMe;
            }

            public int getAgreenTimes() {
                return agreenTimes;
            }

            public void setAgreenTimes(int agreenTimes) {
                this.agreenTimes = agreenTimes;
            }

            public String getCllectForMe() {
                return cllectForMe;
            }

            public void setCllectForMe(String cllectForMe) {
                this.cllectForMe = cllectForMe;
            }

            public int getCommentsTimes() {
                return commentsTimes;
            }

            public void setCommentsTimes(int commentsTimes) {
                this.commentsTimes = commentsTimes;
            }

            public String getContents() {
                return contents;
            }

            public void setContents(String contents) {
                this.contents = contents;
            }

            public long getInputDate() {
                return inputDate;
            }

            public void setInputDate(long inputDate) {
                this.inputDate = inputDate;
            }

            public int getMomentsId() {
                return momentsId;
            }

            public void setMomentsId(int momentsId) {
                this.momentsId = momentsId;
            }

            public String getResourcePath() {
                return resourcePath;
            }

            public void setResourcePath(String resourcePath) {
                this.resourcePath = resourcePath;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUserCode() {
                return userCode;
            }

            public void setUserCode(String userCode) {
                this.userCode = userCode;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getValid() {
                return valid;
            }

            public void setValid(String valid) {
                this.valid = valid;
            }
        }
    }
}
