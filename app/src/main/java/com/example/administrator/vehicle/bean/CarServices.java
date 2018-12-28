package com.example.administrator.vehicle.bean;

public class CarServices {
    int name;
    int ico;

    public CarServices(int name, int ico) {
        this.name = name;
        this.ico = ico;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getIco() {
        return ico;
    }

    public void setIco(int ico) {
        this.ico = ico;
    }
}
