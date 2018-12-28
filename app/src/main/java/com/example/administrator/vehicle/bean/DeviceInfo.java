package com.example.administrator.vehicle.bean;

public class DeviceInfo {


    /**
     * status : 0
     * statusText : Success
     * data : {"carLogo":"http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/4C31.png?Expires=1861336269&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=Ux%2BlESkOlMraRnrGK%2B6ItfpQ6z0%3D","tdeviceDataVO":{"deviceId":"CY0150000047","frameNo":"JTHBT1GG5H2046253","travelId":387,"uploadTime":"2018-12-28 10:18:12","batteryVoltage":13.5,"engineSpeed":2578,"runningSpeed":12,"throttleOpening":20,"engineLoad":44,"coolantTemperature":42,"instantaneousFuelConsumption":16.69,"averageFuelConsumption":85.9,"theMileage":0.04,"totalMileage":474,"fuelConsumption":0.04,"cumulativeFuelConsumption":70.01,"urgentAcceleration":0,"sharpSlowdown":1,"faultCodes":"","countNum":498,"totalIgnition":491,"totalTravelTime":74,"totalIdleTime":38,"averageHotTime":0,"averageSpeed":3,"maximumSpeed":167,"maximumZSpeed":5942,"totalCumulativeAcceleration":6201,"totalSharpSlowdown":4982},"tfaultCodeVO":{"deviceId":"","frameNo":"","faultCodes":{},"faultCodeInfoList":"","uploadTime":""},"tdevicePO":{"deviceId":"CY0150000047","deviceKey":"58220603","deviceType":"0","simccid":"898607b9191730051549","simNo":"1064793601659","imei":"869696040582913","registerTime":"2018-11-28 00:01:58"},"tcarDataPO":{"vinno":"JTHBT1GG5H2046253","brandName":"雷克萨斯","modelName":"ES200","carType":"轿车","saleName":"2.0 手自一体 精英版","logoPath":"brand/4C31.png"},"tRemindPO":{"id":0,"deviceId":"CY0150000047","frameNo":"JTHBT1GG5H2046253","uploadTime":"2018-12-10 11:40:21","remindType":"02","carType":""}}
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
         * carLogo : http://chejian-new.oss-cn-shenzhen.aliyuncs.com/brand/4C31.png?Expires=1861336269&OSSAccessKeyId=LTAIn6UZtImlVLaW&Signature=Ux%2BlESkOlMraRnrGK%2B6ItfpQ6z0%3D
         * tdeviceDataVO : {"deviceId":"CY0150000047","frameNo":"JTHBT1GG5H2046253","travelId":387,"uploadTime":"2018-12-28 10:18:12","batteryVoltage":13.5,"engineSpeed":2578,"runningSpeed":12,"throttleOpening":20,"engineLoad":44,"coolantTemperature":42,"instantaneousFuelConsumption":16.69,"averageFuelConsumption":85.9,"theMileage":0.04,"totalMileage":474,"fuelConsumption":0.04,"cumulativeFuelConsumption":70.01,"urgentAcceleration":0,"sharpSlowdown":1,"faultCodes":"","countNum":498,"totalIgnition":491,"totalTravelTime":74,"totalIdleTime":38,"averageHotTime":0,"averageSpeed":3,"maximumSpeed":167,"maximumZSpeed":5942,"totalCumulativeAcceleration":6201,"totalSharpSlowdown":4982}
         * tfaultCodeVO : {"deviceId":"","frameNo":"","faultCodes":{},"faultCodeInfoList":"","uploadTime":""}
         * tdevicePO : {"deviceId":"CY0150000047","deviceKey":"58220603","deviceType":"0","simccid":"898607b9191730051549","simNo":"1064793601659","imei":"869696040582913","registerTime":"2018-11-28 00:01:58"}
         * tcarDataPO : {"vinno":"JTHBT1GG5H2046253","brandName":"雷克萨斯","modelName":"ES200","carType":"轿车","saleName":"2.0 手自一体 精英版","logoPath":"brand/4C31.png"}
         * tRemindPO : {"id":0,"deviceId":"CY0150000047","frameNo":"JTHBT1GG5H2046253","uploadTime":"2018-12-10 11:40:21","remindType":"02","carType":""}
         */

        private String carLogo;
        private TdeviceDataVOBean tdeviceDataVO;
        private TfaultCodeVOBean tfaultCodeVO;
        private TdevicePOBean tdevicePO;
        private TcarDataPOBean tcarDataPO;
        private TRemindPOBean tRemindPO;

        public String getCarLogo() {
            return carLogo;
        }

        public void setCarLogo(String carLogo) {
            this.carLogo = carLogo;
        }

        public TdeviceDataVOBean getTdeviceDataVO() {
            return tdeviceDataVO;
        }

        public void setTdeviceDataVO(TdeviceDataVOBean tdeviceDataVO) {
            this.tdeviceDataVO = tdeviceDataVO;
        }

        public TfaultCodeVOBean getTfaultCodeVO() {
            return tfaultCodeVO;
        }

        public void setTfaultCodeVO(TfaultCodeVOBean tfaultCodeVO) {
            this.tfaultCodeVO = tfaultCodeVO;
        }

        public TdevicePOBean getTdevicePO() {
            return tdevicePO;
        }

        public void setTdevicePO(TdevicePOBean tdevicePO) {
            this.tdevicePO = tdevicePO;
        }

        public TcarDataPOBean getTcarDataPO() {
            return tcarDataPO;
        }

        public void setTcarDataPO(TcarDataPOBean tcarDataPO) {
            this.tcarDataPO = tcarDataPO;
        }

        public TRemindPOBean getTRemindPO() {
            return tRemindPO;
        }

        public void setTRemindPO(TRemindPOBean tRemindPO) {
            this.tRemindPO = tRemindPO;
        }

        public static class TdeviceDataVOBean {
            /**
             * deviceId : CY0150000047
             * frameNo : JTHBT1GG5H2046253
             * travelId : 387
             * uploadTime : 2018-12-28 10:18:12
             * batteryVoltage : 13.5
             * engineSpeed : 2578.0
             * runningSpeed : 12.0
             * throttleOpening : 20.0
             * engineLoad : 44.0
             * coolantTemperature : 42.0
             * instantaneousFuelConsumption : 16.69
             * averageFuelConsumption : 85.9
             * theMileage : 0.04
             * totalMileage : 474.0
             * fuelConsumption : 0.04
             * cumulativeFuelConsumption : 70.01
             * urgentAcceleration : 0
             * sharpSlowdown : 1
             * faultCodes :
             * countNum : 498
             * totalIgnition : 491
             * totalTravelTime : 74.0
             * totalIdleTime : 38.0
             * averageHotTime : 0.0
             * averageSpeed : 3.0
             * maximumSpeed : 167.0
             * maximumZSpeed : 5942.0
             * totalCumulativeAcceleration : 6201
             * totalSharpSlowdown : 4982
             */

            private String deviceId;
            private String frameNo;
            private int travelId;
            private String uploadTime;
            private double batteryVoltage;
            private double engineSpeed;
            private double runningSpeed;
            private double throttleOpening;
            private double engineLoad;
            private double coolantTemperature;
            private double instantaneousFuelConsumption;
            private double averageFuelConsumption;
            private double theMileage;
            private double totalMileage;
            private double fuelConsumption;
            private double cumulativeFuelConsumption;
            private int urgentAcceleration;
            private int sharpSlowdown;
            private String faultCodes;
            private int countNum;
            private int totalIgnition;
            private double totalTravelTime;
            private double totalIdleTime;
            private double averageHotTime;
            private double averageSpeed;
            private double maximumSpeed;
            private double maximumZSpeed;
            private int totalCumulativeAcceleration;
            private int totalSharpSlowdown;

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

            public int getTravelId() {
                return travelId;
            }

            public void setTravelId(int travelId) {
                this.travelId = travelId;
            }

            public String getUploadTime() {
                return uploadTime;
            }

            public void setUploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
            }

            public double getBatteryVoltage() {
                return batteryVoltage;
            }

            public void setBatteryVoltage(double batteryVoltage) {
                this.batteryVoltage = batteryVoltage;
            }

            public double getEngineSpeed() {
                return engineSpeed;
            }

            public void setEngineSpeed(double engineSpeed) {
                this.engineSpeed = engineSpeed;
            }

            public double getRunningSpeed() {
                return runningSpeed;
            }

            public void setRunningSpeed(double runningSpeed) {
                this.runningSpeed = runningSpeed;
            }

            public double getThrottleOpening() {
                return throttleOpening;
            }

            public void setThrottleOpening(double throttleOpening) {
                this.throttleOpening = throttleOpening;
            }

            public double getEngineLoad() {
                return engineLoad;
            }

            public void setEngineLoad(double engineLoad) {
                this.engineLoad = engineLoad;
            }

            public double getCoolantTemperature() {
                return coolantTemperature;
            }

            public void setCoolantTemperature(double coolantTemperature) {
                this.coolantTemperature = coolantTemperature;
            }

            public double getInstantaneousFuelConsumption() {
                return instantaneousFuelConsumption;
            }

            public void setInstantaneousFuelConsumption(double instantaneousFuelConsumption) {
                this.instantaneousFuelConsumption = instantaneousFuelConsumption;
            }

            public double getAverageFuelConsumption() {
                return averageFuelConsumption;
            }

            public void setAverageFuelConsumption(double averageFuelConsumption) {
                this.averageFuelConsumption = averageFuelConsumption;
            }

            public double getTheMileage() {
                return theMileage;
            }

            public void setTheMileage(double theMileage) {
                this.theMileage = theMileage;
            }

            public double getTotalMileage() {
                return totalMileage;
            }

            public void setTotalMileage(double totalMileage) {
                this.totalMileage = totalMileage;
            }

            public double getFuelConsumption() {
                return fuelConsumption;
            }

            public void setFuelConsumption(double fuelConsumption) {
                this.fuelConsumption = fuelConsumption;
            }

            public double getCumulativeFuelConsumption() {
                return cumulativeFuelConsumption;
            }

            public void setCumulativeFuelConsumption(double cumulativeFuelConsumption) {
                this.cumulativeFuelConsumption = cumulativeFuelConsumption;
            }

            public int getUrgentAcceleration() {
                return urgentAcceleration;
            }

            public void setUrgentAcceleration(int urgentAcceleration) {
                this.urgentAcceleration = urgentAcceleration;
            }

            public int getSharpSlowdown() {
                return sharpSlowdown;
            }

            public void setSharpSlowdown(int sharpSlowdown) {
                this.sharpSlowdown = sharpSlowdown;
            }

            public String getFaultCodes() {
                return faultCodes;
            }

            public void setFaultCodes(String faultCodes) {
                this.faultCodes = faultCodes;
            }

            public int getCountNum() {
                return countNum;
            }

            public void setCountNum(int countNum) {
                this.countNum = countNum;
            }

            public int getTotalIgnition() {
                return totalIgnition;
            }

            public void setTotalIgnition(int totalIgnition) {
                this.totalIgnition = totalIgnition;
            }

            public double getTotalTravelTime() {
                return totalTravelTime;
            }

            public void setTotalTravelTime(double totalTravelTime) {
                this.totalTravelTime = totalTravelTime;
            }

            public double getTotalIdleTime() {
                return totalIdleTime;
            }

            public void setTotalIdleTime(double totalIdleTime) {
                this.totalIdleTime = totalIdleTime;
            }

            public double getAverageHotTime() {
                return averageHotTime;
            }

            public void setAverageHotTime(double averageHotTime) {
                this.averageHotTime = averageHotTime;
            }

            public double getAverageSpeed() {
                return averageSpeed;
            }

            public void setAverageSpeed(double averageSpeed) {
                this.averageSpeed = averageSpeed;
            }

            public double getMaximumSpeed() {
                return maximumSpeed;
            }

            public void setMaximumSpeed(double maximumSpeed) {
                this.maximumSpeed = maximumSpeed;
            }

            public double getMaximumZSpeed() {
                return maximumZSpeed;
            }

            public void setMaximumZSpeed(double maximumZSpeed) {
                this.maximumZSpeed = maximumZSpeed;
            }

            public int getTotalCumulativeAcceleration() {
                return totalCumulativeAcceleration;
            }

            public void setTotalCumulativeAcceleration(int totalCumulativeAcceleration) {
                this.totalCumulativeAcceleration = totalCumulativeAcceleration;
            }

            public int getTotalSharpSlowdown() {
                return totalSharpSlowdown;
            }

            public void setTotalSharpSlowdown(int totalSharpSlowdown) {
                this.totalSharpSlowdown = totalSharpSlowdown;
            }
        }

        public static class TfaultCodeVOBean {
            /**
             * deviceId :
             * frameNo :
             * faultCodes : {}
             * faultCodeInfoList :
             * uploadTime :
             */

            private String deviceId;
            private String frameNo;
            private FaultCodesBean faultCodes;
            private String faultCodeInfoList;
            private String uploadTime;

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

            public FaultCodesBean getFaultCodes() {
                return faultCodes;
            }

            public void setFaultCodes(FaultCodesBean faultCodes) {
                this.faultCodes = faultCodes;
            }

            public String getFaultCodeInfoList() {
                return faultCodeInfoList;
            }

            public void setFaultCodeInfoList(String faultCodeInfoList) {
                this.faultCodeInfoList = faultCodeInfoList;
            }

            public String getUploadTime() {
                return uploadTime;
            }

            public void setUploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
            }

            public static class FaultCodesBean {
            }
        }

        public static class TdevicePOBean {
            /**
             * deviceId : CY0150000047
             * deviceKey : 58220603
             * deviceType : 0
             * simccid : 898607b9191730051549
             * simNo : 1064793601659
             * imei : 869696040582913
             * registerTime : 2018-11-28 00:01:58
             */

            private String deviceId;
            private String deviceKey;
            private String deviceType;
            private String simccid;
            private String simNo;
            private String imei;
            private String registerTime;

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

            public String getSimccid() {
                return simccid;
            }

            public void setSimccid(String simccid) {
                this.simccid = simccid;
            }

            public String getSimNo() {
                return simNo;
            }

            public void setSimNo(String simNo) {
                this.simNo = simNo;
            }

            public String getImei() {
                return imei;
            }

            public void setImei(String imei) {
                this.imei = imei;
            }

            public String getRegisterTime() {
                return registerTime;
            }

            public void setRegisterTime(String registerTime) {
                this.registerTime = registerTime;
            }
        }

        public static class TcarDataPOBean {
            /**
             * vinno : JTHBT1GG5H2046253
             * brandName : 雷克萨斯
             * modelName : ES200
             * carType : 轿车
             * saleName : 2.0 手自一体 精英版
             * logoPath : brand/4C31.png
             */

            private String vinno;
            private String brandName;
            private String modelName;
            private String carType;
            private String saleName;
            private String logoPath;

            public String getVinno() {
                return vinno;
            }

            public void setVinno(String vinno) {
                this.vinno = vinno;
            }

            public String getBrandName() {
                return brandName;
            }

            public void setBrandName(String brandName) {
                this.brandName = brandName;
            }

            public String getModelName() {
                return modelName;
            }

            public void setModelName(String modelName) {
                this.modelName = modelName;
            }

            public String getCarType() {
                return carType;
            }

            public void setCarType(String carType) {
                this.carType = carType;
            }

            public String getSaleName() {
                return saleName;
            }

            public void setSaleName(String saleName) {
                this.saleName = saleName;
            }

            public String getLogoPath() {
                return logoPath;
            }

            public void setLogoPath(String logoPath) {
                this.logoPath = logoPath;
            }
        }

        public static class TRemindPOBean {
            /**
             * id : 0
             * deviceId : CY0150000047
             * frameNo : JTHBT1GG5H2046253
             * uploadTime : 2018-12-10 11:40:21
             * remindType : 02
             * carType :
             */

            private int id;
            private String deviceId;
            private String frameNo;
            private String uploadTime;
            private String remindType;
            private String carType;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

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

            public String getUploadTime() {
                return uploadTime;
            }

            public void setUploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
            }

            public String getRemindType() {
                return remindType;
            }

            public void setRemindType(String remindType) {
                this.remindType = remindType;
            }

            public String getCarType() {
                return carType;
            }

            public void setCarType(String carType) {
                this.carType = carType;
            }
        }
    }
}
