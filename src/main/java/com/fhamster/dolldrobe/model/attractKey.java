package com.fhamster.dolldrobe.model;

public class attractKey {
    private String desUAccountnumber;

    private String uAccountnumber;

    public attractKey(String desUAccountnumber, String uAccountnumber) {
        this.desUAccountnumber = desUAccountnumber;
        this.uAccountnumber = uAccountnumber;
    }

    public attractKey() {
        super();
    }

    public String getDesUAccountnumber() {
        return desUAccountnumber;
    }

    public void setDesUAccountnumber(String desUAccountnumber) {
        this.desUAccountnumber = desUAccountnumber == null ? null : desUAccountnumber.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }
}