package com.fhamster.dolldrobe.model;

public class MessageKey {
    private String useUAccountnumber;

    private String uAccountnumber;

    private String mNum;

    public MessageKey(String useUAccountnumber, String uAccountnumber, String mNum) {
        this.useUAccountnumber = useUAccountnumber;
        this.uAccountnumber = uAccountnumber;
        this.mNum = mNum;
    }

    public MessageKey() {
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

    public String getmNum() {
        return mNum;
    }

    public void setmNum(String mNum) {
        this.mNum = mNum == null ? null : mNum.trim();
    }
}