package com.example.administrator.vehicle.bean;

public class DeviceInfo {


    /**
     * data : {"carLogo":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/4C31.png?Expires=1861293287&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=qqVFClm6T5nZGvUX%2Fuj%2BOZ18ono%3D","tRemindPO":{"deviceId":"CY0150000047","frameNo":"JTHBT1GG5H2046253","id":0,"remindType":"02","uploadTime":1544413221000},"tcarDataPO":{"brandName":"雷克萨斯","carType":"轿车","logoPath":"brand/4C31.png","modelName":"ES200","saleName":"2.0 手自一体 精英版","vinno":"JTHBT1GG5H2046253"},"tdeviceDataVO":{"averageFuelConsumption":85.9,"averageHotTime":5,"averageSpeed":7,"batteryVoltage":13.5,"coolantTemperature":42,"countNum":481,"cumulativeFuelConsumption":70.01,"deviceId":"CY0150000047","engineLoad":44,"engineSpeed":2578,"frameNo":"JTHBT1GG5H2046253","fuelConsumption":0.04,"instantaneousFuelConsumption":16.69,"maximumSpeed":167,"maximumZSpeed":5942,"runningSpeed":12,"sharpSlowdown":1,"theMileage":0.04,"throttleOpening":20,"totalCumulativeAcceleration":6062,"totalIdleTime":37,"totalIgnition":474,"totalMileage":474,"totalSharpSlowdown":4871,"totalTravelTime":72,"travelId":387,"uploadTime":1545890461000,"urgentAcceleration":0},"tdevicePO":{"deviceId":"CY0150000047","deviceKey":"58220603","deviceType":"0","imei":"869696040582913","registerTime":1543334518000,"simNo":"1064793601659","simccid":"898607b9191730051549"},"tfaultCodeVO":{"faultCodes":{}}}
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
         * carLogo : http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/4C31.png?Expires=1861293287&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=qqVFClm6T5nZGvUX%2Fuj%2BOZ18ono%3D
         * tRemindPO : {"deviceId":"CY0150000047","frameNo":"JTHBT1GG5H2046253","id":0,"remindType":"02","uploadTime":1544413221000}
         * tcarDataPO : {"brandName":"雷克萨斯","carType":"轿车","logoPath":"brand/4C31.png","modelName":"ES200","saleName":"2.0 手自一体 精英版","vinno":"JTHBT1GG5H2046253"}
         * tdeviceDataVO : {"averageFuelConsumption":85.9,"averageHotTime":5,"averageSpeed":7,"batteryVoltage":13.5,"coolantTemperature":42,"countNum":481,"cumulativeFuelConsumption":70.01,"deviceId":"CY0150000047","engineLoad":44,"engineSpeed":2578,"frameNo":"JTHBT1GG5H2046253","fuelConsumption":0.04,"instantaneousFuelConsumption":16.69,"maximumSpeed":167,"maximumZSpeed":5942,"runningSpeed":12,"sharpSlowdown":1,"theMileage":0.04,"throttleOpening":20,"totalCumulativeAcceleration":6062,"totalIdleTime":37,"totalIgnition":474,"totalMileage":474,"totalSharpSlowdown":4871,"totalTravelTime":72,"travelId":387,"uploadTime":1545890461000,"urgentAcceleration":0}
         * tdevicePO : {"deviceId":"CY0150000047","deviceKey":"58220603","deviceType":"0","imei":"869696040582913","registerTime":1543334518000,"simNo":"1064793601659","simccid":"898607b9191730051549"}
         * tfaultCodeVO : {"faultCodes":{}}
         */

        private String carLogo;
        private TRemindPOBean tRemindPO;
        private TcarDataPOBean tcarDataPO;
        private TdeviceDataVOBean tdeviceDataVO;
        private TdevicePOBean tdevicePO;
        private TfaultCodeVOBean tfaultCodeVO;

        public String getCarLogo() {
            return carLogo;
        }

        public void setCarLogo(String carLogo) {
            this.carLogo = carLogo;
        }

        public TRemindPOBean getTRemindPO() {
            return tRemindPO;
        }

        public void setTRemindPO(TRemindPOBean tRemindPO) {
            this.tRemindPO = tRemindPO;
        }

        public TcarDataPOBean getTcarDataPO() {
            return tcarDataPO;
        }

        public void setTcarDataPO(TcarDataPOBean tcarDataPO) {
            this.tcarDataPO = tcarDataPO;
        }

        public TdeviceDataVOBean getTdeviceDataVO() {
            return tdeviceDataVO;
        }

        public void setTdeviceDataVO(TdeviceDataVOBean tdeviceDataVO) {
            this.tdeviceDataVO = tdeviceDataVO;
        }

        public TdevicePOBean getTdevicePO() {
            return tdevicePO;
        }

        public void setTdevicePO(TdevicePOBean tdevicePO) {
            this.tdevicePO = tdevicePO;
        }

        public TfaultCodeVOBean getTfaultCodeVO() {
            return tfaultCodeVO;
        }

        public void setTfaultCodeVO(TfaultCodeVOBean tfaultCodeVO) {
            this.tfaultCodeVO = tfaultCodeVO;
        }

        public static class TRemindPOBean {
            /**
             * deviceId : CY0150000047
             * frameNo : JTHBT1GG5H2046253
             * id : 0
             * remindType : 02
             * uploadTime : 1544413221000
             */

            private String deviceId;
            private String frameNo;
            private int id;
            private String remindType;
            private long uploadTime;

            public String getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(String deviceId) {
                this.deviceId = deviceId;
            }

            public String getFrameNo() {
                return frameNo;
            }

            public void setFrameNo(String frameNo) {
                this.frameNo = frameNo;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getRemindType() {
                return remindType;
            }

            public void setRemindType(String remindType) {
                this.remindType = remindType;
            }

            public long getUploadTime() {
                return uploadTime;
            }

            public void setUploadTime(long uploadTime) {
                this.uploadTime = uploadTime;
            }
        }

        public static class TcarDataPOBean {
            /**
             * brandName : 雷克萨斯
             * carType : 轿车
             * logoPath : brand/4C31.png
             * modelName : ES200
             * saleName : 2.0 手自一体 精英版
             * vinno : JTHBT1GG5H2046253
             */

            private String brandName;
            private String carType;
            private String logoPath;
            private String modelName;
            private String saleName;
            private String vinno;

            public String getBrandName() {
                return brandName;
            }

            public void setBrandName(String brandName) {
                this.brandName = brandName;
            }

            public String getCarType() {
                return carType;
            }

            public void setCarType(String carType) {
                this.carType = carType;
            }

            public String getLogoPath() {
                return logoPath;
            }

            public void setLogoPath(String logoPath) {
                this.logoPath = logoPath;
            }

            public String getModelName() {
                return modelName;
            }

            public void setModelName(String modelName) {
                this.modelName = modelName;
            }

            public String getSaleName() {
                return saleName;
            }

            public void setSaleName(String saleName) {
                this.saleName = saleName;
            }

            public String getVinno() {
                return vinno;
            }

            public void setVinno(String vinno) {
                this.vinno = vinno;
            }
        }

        public static class TdeviceDataVOBean {
            /**
             * averageFuelConsumption : 85.9
             * averageHotTime : 5
             * averageSpeed : 7
             * batteryVoltage : 13.5
             * coolantTemperature : 42
             * countNum : 481
             * cumulativeFuelConsumption : 70.01
             * deviceId : CY0150000047
             * engineLoad : 44
             * engineSpeed : 2578
             * frameNo : JTHBT1GG5H2046253
             * fuelConsumption : 0.04
             * instantaneousFuelConsumption : 16.69
             * maximumSpeed : 167
             * maximumZSpeed : 5942
             * runningSpeed : 12
             * sharpSlowdown : 1
             * theMileage : 0.04
             * throttleOpening : 20
             * totalCumulativeAcceleration : 6062
             * totalIdleTime : 37
             * totalIgnition : 474
             * totalMileage : 474
             * totalSharpSlowdown : 4871
             * totalTravelTime : 72
             * travelId : 387
             * uploadTime : 1545890461000
             * urgentAcceleration : 0
             */

            private double averageFuelConsumption;
            private int averageHotTime;
            private int averageSpeed;
            private double batteryVoltage;
            private int coolantTemperature;
            private int countNum;
            private double cumulativeFuelConsumption;
            private String deviceId;
            private int engineLoad;
            private int engineSpeed;
            private String frameNo;
            private double fuelConsumption;
            private double instantaneousFuelConsumption;
            private int maximumSpeed;
            private int maximumZSpeed;
            private int runningSpeed;
            private int sharpSlowdown;
            private double theMileage;
            private int throttleOpening;
            private int totalCumulativeAcceleration;
            private int totalIdleTime;
            private int totalIgnition;
            private int totalMileage;
            private int totalSharpSlowdown;
            private int totalTravelTime;
            private int travelId;
            private long uploadTime;
            private int urgentAcceleration;

            public double getAverageFuelConsumption() {
                return averageFuelConsumption;
            }

            public void setAverageFuelConsumption(double averageFuelConsumption) {
                this.averageFuelConsumption = averageFuelConsumption;
            }

            public int getAverageHotTime() {
                return averageHotTime;
            }

            public void setAverageHotTime(int averageHotTime) {
                this.averageHotTime = averageHotTime;
            }

            public int getAverageSpeed() {
                return averageSpeed;
            }

            public void setAverageSpeed(int averageSpeed) {
                this.averageSpeed = averageSpeed;
            }

            public double getBatteryVoltage() {
                return batteryVoltage;
            }

            public void setBatteryVoltage(double batteryVoltage) {
                this.batteryVoltage = batteryVoltage;
            }

            public int getCoolantTemperature() {
                return coolantTemperature;
            }

            public void setCoolantTemperature(int coolantTemperature) {
                this.coolantTemperature = coolantTemperature;
            }

            public int getCountNum() {
                return countNum;
            }

            public void setCountNum(int countNum) {
                this.countNum = countNum;
            }

            public double getCumulativeFuelConsumption() {
                return cumulativeFuelConsumption;
            }

            public void setCumulativeFuelConsumption(double cumulativeFuelConsumption) {
                this.cumulativeFuelConsumption = cumulativeFuelConsumption;
            }

            public String getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(String deviceId) {
                this.deviceId = deviceId;
            }

            public int getEngineLoad() {
                return engineLoad;
            }

            public void setEngineLoad(int engineLoad) {
                this.engineLoad = engineLoad;
            }

            public int getEngineSpeed() {
                return engineSpeed;
            }

            public void setEngineSpeed(int engineSpeed) {
                this.engineSpeed = engineSpeed;
            }

            public String getFrameNo() {
                return frameNo;
            }

            public void setFrameNo(String frameNo) {
                this.frameNo = frameNo;
            }

            public double getFuelConsumption() {
                return fuelConsumption;
            }

            public void setFuelConsumption(double fuelConsumption) {
                this.fuelConsumption = fuelConsumption;
            }

            public double getInstantaneousFuelConsumption() {
                return instantaneousFuelConsumption;
            }

            public void setInstantaneousFuelConsumption(double instantaneousFuelConsumption) {
                this.instantaneousFuelConsumption = instantaneousFuelConsumption;
            }

            public int getMaximumSpeed() {
                return maximumSpeed;
            }

            public void setMaximumSpeed(int maximumSpeed) {
                this.maximumSpeed = maximumSpeed;
            }

            public int getMaximumZSpeed() {
                return maximumZSpeed;
            }

            public void setMaximumZSpeed(int maximumZSpeed) {
                this.maximumZSpeed = maximumZSpeed;
            }

            public int getRunningSpeed() {
                return runningSpeed;
            }

            public void setRunningSpeed(int runningSpeed) {
                this.runningSpeed = runningSpeed;
            }

            public int getSharpSlowdown() {
                return sharpSlowdown;
            }

            public void setSharpSlowdown(int sharpSlowdown) {
                this.sharpSlowdown = sharpSlowdown;
            }

            public double getTheMileage() {
                return theMileage;
            }

            public void setTheMileage(double theMileage) {
                this.theMileage = theMileage;
            }

            public int getThrottleOpening() {
                return throttleOpening;
            }

            public void setThrottleOpening(int throttleOpening) {
                this.throttleOpening = throttleOpening;
            }

            public int getTotalCumulativeAcceleration() {
                return totalCumulativeAcceleration;
            }

            public void setTotalCumulativeAcceleration(int totalCumulativeAcceleration) {
                this.totalCumulativeAcceleration = totalCumulativeAcceleration;
            }

            public int getTotalIdleTime() {
                return totalIdleTime;
            }

            public void setTotalIdleTime(int totalIdleTime) {
                this.totalIdleTime = totalIdleTime;
            }

            public int getTotalIgnition() {
                return totalIgnition;
            }

            public void setTotalIgnition(int totalIgnition) {
                this.totalIgnition = totalIgnition;
            }

            public int getTotalMileage() {
                return totalMileage;
            }

            public void setTotalMileage(int totalMileage) {
                this.totalMileage = totalMileage;
            }

            public int getTotalSharpSlowdown() {
                return totalSharpSlowdown;
            }

            public void setTotalSharpSlowdown(int totalSharpSlowdown) {
                this.totalSharpSlowdown = totalSharpSlowdown;
            }

            public int getTotalTravelTime() {
                return totalTravelTime;
            }

            public void setTotalTravelTime(int totalTravelTime) {
                this.totalTravelTime = totalTravelTime;
            }

            public int getTravelId() {
                return travelId;
            }

            public void setTravelId(int travelId) {
                this.travelId = travelId;
            }

            public long getUploadTime() {
                return uploadTime;
            }

            public void setUploadTime(long uploadTime) {
                this.uploadTime = uploadTime;
            }

            public int getUrgentAcceleration() {
                return urgentAcceleration;
            }

            public void setUrgentAcceleration(int urgentAcceleration) {
                this.urgentAcceleration = urgentAcceleration;
            }
        }

        public static class TdevicePOBean {
            /**
             * deviceId : CY0150000047
             * deviceKey : 58220603
             * deviceType : 0
             * imei : 869696040582913
             * registerTime : 1543334518000
             * simNo : 1064793601659
             * simccid : 898607b9191730051549
             */

            private String deviceId;
            private String deviceKey;
            private String deviceType;
            private String imei;
            private long registerTime;
            private String simNo;
            private String simccid;

            public String getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(String deviceId) {
                this.deviceId = deviceId;
            }

            public String getDeviceKey() {
                return deviceKey;
            }

            public void setDeviceKey(String deviceKey) {
                this.deviceKey = deviceKey;
            }

            public String getDeviceType() {
                return deviceType;
            }

            public void setDeviceType(String deviceType) {
                this.deviceType = deviceType;
            }

            public String getImei() {
                return imei;
            }

            public void setImei(String imei) {
                this.imei = imei;
            }

            public long getRegisterTime() {
                return registerTime;
            }

            public void setRegisterTime(long registerTime) {
                this.registerTime = registerTime;
            }

            public String getSimNo() {
                return simNo;
            }

            public void setSimNo(String simNo) {
                this.simNo = simNo;
            }

            public String getSimccid() {
                return simccid;
            }

            public void setSimccid(String simccid) {
                this.simccid = simccid;
            }
        }

        public static class TfaultCodeVOBean {
            /**
             * faultCodes : {}
             */

            private FaultCodesBean faultCodes;

            public FaultCodesBean getFaultCodes() {
                return faultCodes;
            }

            public void setFaultCodes(FaultCodesBean faultCodes) {
                this.faultCodes = faultCodes;
            }

            public static class FaultCodesBean {
            }
        }
    }
}
