package com.fhamster.dolldrobe.model;

public class User {
    private String uAccountnumber;

    private String uName;

    private String uPsw;

    private String uSex;

    private String uEmail;

    private String uQq;

    private String uWx;

    private String uTel;

    private String uPicurl;

    public User(String uAccountnumber, String uName, String uPsw, String uSex, String uEmail, String uQq, String uWx, String uTel, String uPicurl) {
        this.uAccountnumber = uAccountnumber;
        this.uName = uName;
        this.uPsw = uPsw;
        this.uSex = uSex;
        this.uEmail = uEmail;
        this.uQq = uQq;
        this.uWx = uWx;
        this.uTel = uTel;
        this.uPicurl = uPicurl;
    }

    public User() {
        super();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
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

    public String getuPicurl() {
        return uPicurl;
    }

    public void setuPicurl(String uPicurl) {
        this.uPicurl = uPicurl == null ? null : uPicurl.trim();
    }
}