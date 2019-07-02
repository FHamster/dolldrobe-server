package com.fhamster.dolldrobe.model;

import java.util.Date;

public class Message {
    private String mNum;

    private String uAccountnumber;

    private String useUAccountnumber;

    private Date mSendtime;

    private String mSentcontent;

    public Message(String mNum, String uAccountnumber, String useUAccountnumber, Date mSendtime, String mSentcontent) {
        this.mNum = mNum;
        this.uAccountnumber = uAccountnumber;
        this.useUAccountnumber = useUAccountnumber;
        this.mSendtime = mSendtime;
        this.mSentcontent = mSentcontent;
    }

    public Message() {
        super();
    }

    public String getmNum() {
        return mNum;
    }

    public void setmNum(String mNum) {
        this.mNum = mNum == null ? null : mNum.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }

    public String getUseUAccountnumber() {
        return useUAccountnumber;
    }

    public void setUseUAccountnumber(String useUAccountnumber) {
        this.useUAccountnumber = useUAccountnumber == null ? null : useUAccountnumber.trim();
    }

    public Date getmSendtime() {
        return mSendtime;
    }

    public void setmSendtime(Date mSendtime) {
        this.mSendtime = mSendtime;
    }

    public String getmSentcontent() {
        return mSentcontent;
    }

    public void setmSentcontent(String mSentcontent) {
        this.mSentcontent = mSentcontent == null ? null : mSentcontent.trim();
    }
}