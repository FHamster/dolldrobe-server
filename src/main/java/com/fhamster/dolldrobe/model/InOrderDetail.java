package com.fhamster.dolldrobe.model;

import java.util.Date;

public class InOrderDetail {
    private String iId;

    private String sNum;

    private Date iodPaytime;

    public InOrderDetail(String iId, String sNum, Date iodPaytime) {
        this.iId = iId;
        this.sNum = sNum;
        this.iodPaytime = iodPaytime;
    }

    public InOrderDetail() {
        super();
    }

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId == null ? null : iId.trim();
    }

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum == null ? null : sNum.trim();
    }

    public Date getIodPaytime() {
        return iodPaytime;
    }

    public void setIodPaytime(Date iodPaytime) {
        this.iodPaytime = iodPaytime;
    }
}