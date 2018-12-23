package com.example.administrator.vehicle.bean;

public class Device {
    String name;
    String num;
    String image;
    String number;
    String status;

    public Device() {
    }

    public Device(String name, String num, String image, String number, String status) {
        this.name = name;
        this.num = num;
        this.image = image;
        this.number = number;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
