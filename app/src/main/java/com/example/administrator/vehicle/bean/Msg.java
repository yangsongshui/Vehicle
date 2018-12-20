package com.example.administrator.vehicle.bean;

public class Msg {

    /**
     * data :
     * status : 0
     * statusText : Success
     */

    private String data;
    private int status;
    private String statusText;

    public String getData() {
        return data;
    }

    public void setData(String data) {
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

    @Override
    public String toString() {
        return "Msg{" +
                "data='" + data + '\'' +
                ", status=" + status +
                ", statusText='" + statusText + '\'' +
                '}';
    }
}
