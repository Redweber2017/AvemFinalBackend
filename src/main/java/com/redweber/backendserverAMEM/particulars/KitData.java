package com.redweber.backendserverAMEM.particulars;
import java.util.List;


public class KitData {

    private String address;
    private String timestamp;
    private String location;
    private String temperature;
    private String gasLeakageStatus;
    private String crashStatus;
    private List<String> cameraFootage;



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getGasLeakageStatus() {
        return gasLeakageStatus;
    }

    public void setGasLeakageStatus(String gasLeakageStatus) {
        this.gasLeakageStatus = gasLeakageStatus;
    }

    public String getCrashStatus() {
        return crashStatus;
    }

    public void setCrashStatus(String crashStatus) {
        this.crashStatus = crashStatus;
    }

    public List<String> getCameraFootage() {
        return cameraFootage;
    }

    public void setCameraFootage(List<String> cameraFootage) {
        this.cameraFootage = cameraFootage;
    }
}

