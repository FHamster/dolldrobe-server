package com.fhamster.dolldrobe.model;

import java.util.Date;

public class Sketch {
    private String sNum;

    private String uAccountnumber;

    private String sName;

    private Date sCtime;

    private Integer sState;

    private Long sPageview;

    public Sketch(String sNum, String uAccountnumber, String sName, Date sCtime, Integer sState, Long sPageview) {
        this.sNum = sNum;
        this.uAccountnumber = uAccountnumber;
        this.sName = sName;
        this.sCtime = sCtime;
        this.sState = sState;
        this.sPageview = sPageview;
    }

    public Sketch() {
        super();
    }

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum == null ? null : sNum.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Date getsCtime() {
        return sCtime;
    }

    public void setsCtime(Date sCtime) {
        this.sCtime = sCtime;
    }

    public Integer getsState() {
        return sState;
    }

    public void setsState(Integer sState) {
        this.sState = sState;
    }

    public Long getsPageview() {
        return sPageview;
    }

    public void setsPageview(Long sPageview) {
        this.sPageview = sPageview;
    }
}