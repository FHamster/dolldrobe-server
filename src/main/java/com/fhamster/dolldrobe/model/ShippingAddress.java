package com.fhamster.dolldrobe.model;

public class ShippingAddress {
    private String saNum;

    private String arNum;

    private String uAccountnumber;

    private String saDetail;

    private String saDefault;

    private String saEmail;

    private String saTelphone;

    private String saPhone;

    private String saName;

    public ShippingAddress(String saNum, String arNum, String uAccountnumber, String saDetail, String saDefault, String saEmail, String saTelphone, String saPhone, String saName) {
        this.saNum = saNum;
        this.arNum = arNum;
        this.uAccountnumber = uAccountnumber;
        this.saDetail = saDetail;
        this.saDefault = saDefault;
        this.saEmail = saEmail;
        this.saTelphone = saTelphone;
        this.saPhone = saPhone;
        this.saName = saName;
    }

    public ShippingAddress() {
        super();
    }

    public String getSaNum() {
        return saNum;
    }

    public void setSaNum(String saNum) {
        this.saNum = saNum == null ? null : saNum.trim();
    }

    public String getArNum() {
        return arNum;
    }

    public void setArNum(String arNum) {
        this.arNum = arNum == null ? null : arNum.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }

    public String getSaDetail() {
        return saDetail;
    }

    public void setSaDetail(String saDetail) {
        this.saDetail = saDetail == null ? null : saDetail.trim();
    }

    public String getSaDefault() {
        return saDefault;
    }

    public void setSaDefault(String saDefault) {
        this.saDefault = saDefault == null ? null : saDefault.trim();
    }

    public String getSaEmail() {
        return saEmail;
    }

    public void setSaEmail(String saEmail) {
        this.saEmail = saEmail == null ? null : saEmail.trim();
    }

    public String getSaTelphone() {
        return saTelphone;
    }

    public void setSaTelphone(String saTelphone) {
        this.saTelphone = saTelphone == null ? null : saTelphone.trim();
    }

    public String getSaPhone() {
        return saPhone;
    }

    public void setSaPhone(String saPhone) {
        this.saPhone = saPhone == null ? null : saPhone.trim();
    }

    public String getSaName() {
        return saName;
    }

    public void setSaName(String saName) {
        this.saName = saName == null ? null : saName.trim();
    }

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "saNum='" + saNum + '\'' +
                ", arNum='" + arNum + '\'' +
                ", uAccountnumber='" + uAccountnumber + '\'' +
                ", saDetail='" + saDetail + '\'' +
                ", saDefault='" + saDefault + '\'' +
                ", saEmail='" + saEmail + '\'' +
                ", saTelphone='" + saTelphone + '\'' +
                ", saPhone='" + saPhone + '\'' +
                ", saName='" + saName + '\'' +
                '}';
    }
}