package com.fhamster.dolldrobe.model;

import java.util.Date;

public class SketchSamplelFeedback {
    private String ssfId;

    private String sNum;

    private String uAccountnumber;

    private String ssfCategory;

    private Integer ssfEvaluationlevel;

    private Date ssfDate;

    private String ssfEvaluationcontent;

    public SketchSamplelFeedback(String ssfId, String sNum, String uAccountnumber, String ssfCategory, Integer ssfEvaluationlevel, Date ssfDate, String ssfEvaluationcontent) {
        this.ssfId = ssfId;
        this.sNum = sNum;
        this.uAccountnumber = uAccountnumber;
        this.ssfCategory = ssfCategory;
        this.ssfEvaluationlevel = ssfEvaluationlevel;
        this.ssfDate = ssfDate;
        this.ssfEvaluationcontent = ssfEvaluationcontent;
    }

    public SketchSamplelFeedback() {
        super();
    }

    public String getSsfId() {
        return ssfId;
    }

    public void setSsfId(String ssfId) {
        this.ssfId = ssfId == null ? null : ssfId.trim();
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

    public String getSsfCategory() {
        return ssfCategory;
    }

    public void setSsfCategory(String ssfCategory) {
        this.ssfCategory = ssfCategory == null ? null : ssfCategory.trim();
    }

    public Integer getSsfEvaluationlevel() {
        return ssfEvaluationlevel;
    }

    public void setSsfEvaluationlevel(Integer ssfEvaluationlevel) {
        this.ssfEvaluationlevel = ssfEvaluationlevel;
    }

    public Date getSsfDate() {
        return ssfDate;
    }

    public void setSsfDate(Date ssfDate) {
        this.ssfDate = ssfDate;
    }

    public String getSsfEvaluationcontent() {
        return ssfEvaluationcontent;
    }

    public void setSsfEvaluationcontent(String ssfEvaluationcontent) {
        this.ssfEvaluationcontent = ssfEvaluationcontent == null ? null : ssfEvaluationcontent.trim();
    }
}