package com.fhamster.dolldrobe.model;

public class Designer {
    private String uAccountnumber;

    private String iId;

    private String uName;

    private String uPsw;

    private String uSex;

    private String uEmail;

    private String uQq;

    private String uWx;

    private String uTel;

    private Integer dAttention;

    private Integer dWorknum;

    private String uPicurl;

    public Designer(String uAccountnumber, String iId, String uName, String uPsw, String uSex, String uEmail, String uQq, String uWx, String uTel, Integer dAttention, Integer dWorknum, String uPicurl) {
        this.uAccountnumber = uAccountnumber;
        this.iId = iId;
        this.uName = uName;
        this.uPsw = uPsw;
        this.uSex = uSex;
        this.uEmail = uEmail;
        this.uQq = uQq;
        this.uWx = uWx;
        this.uTel = uTel;
        this.dAttention = dAttention;
        this.dWorknum = dWorknum;
        this.uPicurl = uPicurl;
    }

    public Designer() {
        super();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId == null ? null : iId.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPsw() {
        return uPsw;
    }

    public void setuPsw(String uPsw) {
        this.uPsw = uPsw == null ? null : uPsw.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuQq() {
        return uQq;
    }

    public void setuQq(String uQq) {
        this.uQq = uQq == null ? null : uQq.trim();
    }

    public String getuWx() {
        return uWx;
    }

    public void setuWx(String uWx) {
        this.uWx = uWx == null ? null : uWx.trim();
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel == null ? null : uTel.trim();
    }

    public Integer getdAttention() {
        return dAttention;
    }

    public void setdAttention(Integer dAttention) {
        this.dAttention = dAttention;
    }

    public Integer getdWorknum() {
        return dWorknum;
    }

    public void setdWorknum(Integer dWorknum) {
        this.dWorknum = dWorknum;
    }

    public String getuPicurl() {
        return uPicurl;
    }

    public void setuPicurl(String uPicurl) {
        this.uPicurl = uPicurl == null ? null : uPicurl.trim();
    }
}