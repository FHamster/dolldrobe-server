package com.fhamster.dolldrobe.model;

public class DDToken {
    private String tokenid;

    private String uAccountnumber;

    private Integer uRight;

    public DDToken(String tokenid, String uAccountnumber, Integer uRight) {
        this.tokenid = tokenid;
        this.uAccountnumber = uAccountnumber;
        this.uRight = uRight;
    }

    public DDToken() {
        super();
    }

    public String getTokenid() {
        return tokenid;
    }

    public void setTokenid(String tokenid) {
        this.tokenid = tokenid == null ? null : tokenid.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }

    public Integer getuRight() {
        return uRight;
    }

    public void setuRight(Integer uRight) {
        this.uRight = uRight;
    }
}