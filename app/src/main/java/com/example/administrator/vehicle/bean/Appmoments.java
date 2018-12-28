package com.example.administrator.vehicle.bean;

import java.util.List;

public class Appmoments {


    /**
     * status : 0
     * statusText : Success
     * data : {"pageNo":1,"perPage":20,"totalCount":3,"data":[{"momentsId":1,"userCode":"U2018001","userName":"用户A","title":"发个朋友圈AA","contents":"朋友圈内容","resourcePath":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/001.png?Expires=1861335978&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=qPxo2DCNlHd2DKIyTlv4NqlUiUw%3D","videoPath":"","valid":"1","inputDate":"2018-11-09 21:48:28","agreenTimes":2,"agreenForMe":"1","cllectForMe":"1","commentsTimes":2,"commentPOs":""},{"momentsId":2,"userCode":"U2018002","userName":"用户B","title":"发个朋友圈BB","contents":"朋友圈内容","resourcePath":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/4131.png?Expires=1861335978&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=Frb2hytduRfSxIGjbo6hoGNA90c%3D","videoPath":"","valid":"1","inputDate":"2018-11-09 21:54:42","agreenTimes":0,"agreenForMe":"1","cllectForMe":"1","commentsTimes":0,"commentPOs":""},{"momentsId":3,"userCode":"U2018003","userName":"用户C","title":"发个朋友圈","contents":"朋友圈内容","resourcePath":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/001.png?Expires=1861335978&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=qPxo2DCNlHd2DKIyTlv4NqlUiUw%3D","videoPath":"","valid":"1","inputDate":"2018-11-10 12:32:40","agreenTimes":0,"agreenForMe":"1","cllectForMe":"1","commentsTimes":0,"commentPOs":""}]}
     */

    private int status;
    private String statusText;
    private DataBeanX data;

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

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * pageNo : 1
         * perPage : 20
         * totalCount : 3
         * data : [{"momentsId":1,"userCode":"U2018001","userName":"用户A","title":"发个朋友圈AA","contents":"朋友圈内容","resourcePath":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/001.png?Expires=1861335978&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=qPxo2DCNlHd2DKIyTlv4NqlUiUw%3D","videoPath":"","valid":"1","inputDate":"2018-11-09 21:48:28","agreenTimes":2,"agreenForMe":"1","cllectForMe":"1","commentsTimes":2,"commentPOs":""},{"momentsId":2,"userCode":"U2018002","userName":"用户B","title":"发个朋友圈BB","contents":"朋友圈内容","resourcePath":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/4131.png?Expires=1861335978&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=Frb2hytduRfSxIGjbo6hoGNA90c%3D","videoPath":"","valid":"1","inputDate":"2018-11-09 21:54:42","agreenTimes":0,"agreenForMe":"1","cllectForMe":"1","commentsTimes":0,"commentPOs":""},{"momentsId":3,"userCode":"U2018003","userName":"用户C","title":"发个朋友圈","contents":"朋友圈内容","resourcePath":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/001.png?Expires=1861335978&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=qPxo2DCNlHd2DKIyTlv4NqlUiUw%3D","videoPath":"","valid":"1","inputDate":"2018-11-10 12:32:40","agreenTimes":0,"agreenForMe":"1","cllectForMe":"1","commentsTimes":0,"commentPOs":""}]
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
             * momentsId : 1
             * userCode : U2018001
             * userName : 用户A
             * title : 发个朋友圈AA
             * contents : 朋友圈内容
             * resourcePath : http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/001.png?Expires=1861335978&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=qPxo2DCNlHd2DKIyTlv4NqlUiUw%3D
             * videoPath :
             * valid : 1
             * inputDate : 2018-11-09 21:48:28
             * agreenTimes : 2
             * agreenForMe : 1
             * cllectForMe : 1
             * commentsTimes : 2
             * commentPOs :
             */

            private int momentsId;
            private String userCode;
            private String userName;
            private String title;
            private String contents;
            private String resourcePath;
            private String videoPath;
            private String valid;
            private String inputDate;
            private int agreenTimes;
            private String agreenForMe;
            private String cllectForMe;
            private int commentsTimes;
            private String commentPOs;

            public int getMomentsId() {
                return momentsId;
            }

            public void setMomentsId(int momentsId) {
                this.momentsId = momentsId;
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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContents() {
                return contents;
            }

            public void setContents(String contents) {
                this.contents = contents;
            }

            public String getResourcePath() {
                return resourcePath;
            }

            public void setResourcePath(String resourcePath) {
                this.resourcePath = resourcePath;
            }

            public String getVideoPath() {
                return videoPath;
            }

            public void setVideoPath(String videoPath) {
                this.videoPath = videoPath;
            }

            public String getValid() {
                return valid;
            }

            public void setValid(String valid) {
                this.valid = valid;
            }

            public String getInputDate() {
                return inputDate;
            }

            public void setInputDate(String inputDate) {
                this.inputDate = inputDate;
            }

            public int getAgreenTimes() {
                return agreenTimes;
            }

            public void setAgreenTimes(int agreenTimes) {
                this.agreenTimes = agreenTimes;
            }

            public String getAgreenForMe() {
                return agreenForMe;
            }

            public void setAgreenForMe(String agreenForMe) {
                this.agreenForMe = agreenForMe;
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

            public String getCommentPOs() {
                return commentPOs;
            }

            public void setCommentPOs(String commentPOs) {
                this.commentPOs = commentPOs;
            }
        }
    }
}
