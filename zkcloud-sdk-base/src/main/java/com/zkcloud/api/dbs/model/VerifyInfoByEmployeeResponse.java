package com.zkcloud.api.dbs.model;

import com.google.gson.annotations.Expose;

/**
 * 查询员工所在设备的核验信息 响应参数
 */
public class VerifyInfoByEmployeeResponse {

    @Expose
    private String sn;

    @Expose
    private int facePhotoCount;

    @Expose
    private int fingerCount;

    @Expose
    private int faceCount;

    @Expose
    private int palmPrintCount;

    @Expose
    private String devicePermission;

    @Expose
    private String cardNo;

    @Expose
    private String devicePassword;

    @Expose
    private String deviceVerifyMode;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public int getFacePhotoCount() {
        return facePhotoCount;
    }

    public void setFacePhotoCount(int facePhotoCount) {
        this.facePhotoCount = facePhotoCount;
    }

    public int getFingerCount() {
        return fingerCount;
    }

    public void setFingerCount(int fingerCount) {
        this.fingerCount = fingerCount;
    }

    public int getFaceCount() {
        return faceCount;
    }

    public void setFaceCount(int faceCount) {
        this.faceCount = faceCount;
    }

    public int getPalmPrintCount() {
        return palmPrintCount;
    }

    public void setPalmPrintCount(int palmPrintCount) {
        this.palmPrintCount = palmPrintCount;
    }

    public String getDevicePermission() {
        return devicePermission;
    }

    public void setDevicePermission(String devicePermission) {
        this.devicePermission = devicePermission;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDevicePassword() {
        return devicePassword;
    }

    public void setDevicePassword(String devicePassword) {
        this.devicePassword = devicePassword;
    }

    public String getDeviceVerifyMode() {
        return deviceVerifyMode;
    }

    public void setDeviceVerifyMode(String deviceVerifyMode) {
        this.deviceVerifyMode = deviceVerifyMode;
    }
}
