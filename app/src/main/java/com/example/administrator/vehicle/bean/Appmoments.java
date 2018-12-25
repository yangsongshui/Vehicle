package com.example.administrator.vehicle.bean;

import java.util.List;

public class Appmoments {

    /**
     * data : {"data":[{"contents":"朋友圈内容","inputDate":1541771308000,"listAgree":[{"id":2,"inputDate":1541826558000,"momentsId":1,"userCode":"boat","valid":"1"}],"listComment":[{"contents":"哎呀妈呀，写的太好了","id":1,"inputDate":1541824131000,"momentsId":1,"type":"1","userCode":"U2018004","userName":"用户D","valid":"1","arguedId":1,"arguedUserCode":"U2018004","arguedUserName":"用户D"},{"arguedId":1,"arguedUserCode":"U2018004","arguedUserName":"用户D","contents":"一般般啦","id":2,"inputDate":1541824197000,"momentsId":1,"type":"2","userCode":"U2018005","userName":"用户E","valid":"1"}],"momentsId":1,"resourcePath":"F:/firstDemoFile/2018-11-09/表结构2018110921482853.png","title":"发个朋友圈AA","userCode":"U2018001","userName":"用户A","valid":"1"},{"contents":"朋友圈内容","inputDate":1541771682000,"listAgree":[],"listComment":[],"momentsId":2,"resourcePath":"F:/firstDemoFile/2018-11-09/表结构20181109215442130.png","title":"发个朋友圈BB","userCode":"U2018002","userName":"用户B","valid":"1"},{"contents":"朋友圈内容","inputDate":1541824360000,"listAgree":[],"listComment":[],"momentsId":3,"resourcePath":"F:/firstDemoFile/2018-11-10/表结构20181110123240301.png","title":"发个朋友圈","userCode":"U2018003","userName":"用户C","valid":"1"}],"pageNo":1,"perPage":4,"totalCount":3}
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
         * data : [{"contents":"朋友圈内容","inputDate":1541771308000,"listAgree":[{"id":2,"inputDate":1541826558000,"momentsId":1,"userCode":"boat","valid":"1"}],"listComment":[{"contents":"哎呀妈呀，写的太好了","id":1,"inputDate":1541824131000,"momentsId":1,"type":"1","userCode":"U2018004","userName":"用户D","valid":"1"},{"arguedId":1,"arguedUserCode":"U2018004","arguedUserName":"用户D","contents":"一般般啦","id":2,"inputDate":1541824197000,"momentsId":1,"type":"2","userCode":"U2018005","userName":"用户E","valid":"1"}],"momentsId":1,"resourcePath":"F:/firstDemoFile/2018-11-09/表结构2018110921482853.png","title":"发个朋友圈AA","userCode":"U2018001","userName":"用户A","valid":"1"},{"contents":"朋友圈内容","inputDate":1541771682000,"listAgree":[],"listComment":[],"momentsId":2,"resourcePath":"F:/firstDemoFile/2018-11-09/表结构20181109215442130.png","title":"发个朋友圈BB","userCode":"U2018002","userName":"用户B","valid":"1"},{"contents":"朋友圈内容","inputDate":1541824360000,"listAgree":[],"listComment":[],"momentsId":3,"resourcePath":"F:/firstDemoFile/2018-11-10/表结构20181110123240301.png","title":"发个朋友圈","userCode":"U2018003","userName":"用户C","valid":"1"}]
         * pageNo : 1
         * perPage : 4
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
             * contents : 朋友圈内容
             * inputDate : 1541771308000
             * listAgree : [{"id":2,"inputDate":1541826558000,"momentsId":1,"userCode":"boat","valid":"1"}]
             * listComment : [{"contents":"哎呀妈呀，写的太好了","id":1,"inputDate":1541824131000,"momentsId":1,"type":"1","userCode":"U2018004","userName":"用户D","valid":"1"},{"arguedId":1,"arguedUserCode":"U2018004","arguedUserName":"用户D","contents":"一般般啦","id":2,"inputDate":1541824197000,"momentsId":1,"type":"2","userCode":"U2018005","userName":"用户E","valid":"1"}]
             * momentsId : 1
             * resourcePath : F:/firstDemoFile/2018-11-09/表结构2018110921482853.png
             * title : 发个朋友圈AA
             * userCode : U2018001
             * userName : 用户A
             * valid : 1
             */

            private String contents;
            private long inputDate;
            private int momentsId;
            private String resourcePath;
            private String title;
            private String userCode;
            private String userName;
            private String valid;
            private List<ListAgreeBean> listAgree;
            private List<ListCommentBean> listComment;

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

            public List<ListAgreeBean> getListAgree() {
                return listAgree;
            }

            public void setListAgree(List<ListAgreeBean> listAgree) {
                this.listAgree = listAgree;
            }

            public List<ListCommentBean> getListComment() {
                return listComment;
            }

            public void setListComment(List<ListCommentBean> listComment) {
                this.listComment = listComment;
            }

            public static class ListAgreeBean {
                /**
                 * id : 2
                 * inputDate : 1541826558000
                 * momentsId : 1
                 * userCode : boat
                 * valid : 1
                 */

                private int id;
                private long inputDate;
                private int momentsId;
                private String userCode;
                private String valid;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
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

                public String getUserCode() {
                    return userCode;
                }

                public void setUserCode(String userCode) {
                    this.userCode = userCode;
                }

                public String getValid() {
                    return valid;
                }

                public void setValid(String valid) {
                    this.valid = valid;
                }
            }

            public static class ListCommentBean {
                /**
                 * contents : 哎呀妈呀，写的太好了
                 * id : 1
                 * inputDate : 1541824131000
                 * momentsId : 1
                 * type : 1
                 * userCode : U2018004
                 * userName : 用户D
                 * valid : 1
                 * arguedId : 1
                 * arguedUserCode : U2018004
                 * arguedUserName : 用户D
                 */

                private String contents;
                private int id;
                private long inputDate;
                private int momentsId;
                private String type;
                private String userCode;
                private String userName;
                private String valid;
                private int arguedId;
                private String arguedUserCode;
                private String arguedUserName;

                public String getContents() {
                    return contents;
                }

                public void setContents(String contents) {
                    this.contents = contents;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
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

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
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

                public int getArguedId() {
                    return arguedId;
                }

                public void setArguedId(int arguedId) {
                    this.arguedId = arguedId;
                }

                public String getArguedUserCode() {
                    return arguedUserCode;
                }

                public void setArguedUserCode(String arguedUserCode) {
                    this.arguedUserCode = arguedUserCode;
                }

                public String getArguedUserName() {
                    return arguedUserName;
                }

                public void setArguedUserName(String arguedUserName) {
                    this.arguedUserName = arguedUserName;
                }
            }
        }
    }
}
