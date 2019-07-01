package com.fhamster.dolldrobe.model;

public class friendKey {
    private String useUAccountnumber;

    private String uAccountnumber;

    public friendKey(String useUAccountnumber, String uAccountnumber) {
        this.useUAccountnumber = useUAccountnumber;
        this.uAccountnumber = uAccountnumber;
    }

    public friendKey() {
        super();
    }

    public String getUseUAccountnumber() {
        return useUAccountnumber;
    }

    public void setUseUAccountnumber(String useUAccountnumber) {
        this.useUAccountnumber = useUAccountnumber == null ? null : useUAccountnumber.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }
}