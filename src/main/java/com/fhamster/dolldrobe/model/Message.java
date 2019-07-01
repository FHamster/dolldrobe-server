package com.fhamster.dolldrobe.model;

import java.util.Date;

public class Message extends MessageKey {
    private Date mSendtime;

    private String mSentcontent;

    public Message(String useUAccountnumber, String uAccountnumber, String mNum, Date mSendtime, String mSentcontent) {
        super(useUAccountnumber, uAccountnumber, mNum);
        this.mSendtime = mSendtime;
        this.mSentcontent = mSentcontent;
    }

    public Message() {
        super();
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