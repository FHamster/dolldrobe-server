package com.fhamster.dolldrobe.model;

import java.util.Date;

public class OrderEvaluation {
    private String oNum;

    private Integer oeClevel;

    private Date oeTime;

    private String oeContent;

    public OrderEvaluation(String oNum, Integer oeClevel, Date oeTime, String oeContent) {
        this.oNum = oNum;
        this.oeClevel = oeClevel;
        this.oeTime = oeTime;
        this.oeContent = oeContent;
    }

    public OrderEvaluation() {
        super();
    }

    public String getoNum() {
        return oNum;
    }

    public void setoNum(String oNum) {
        this.oNum = oNum == null ? null : oNum.trim();
    }

    public Integer getOeClevel() {
        return oeClevel;
    }

    public void setOeClevel(Integer oeClevel) {
        this.oeClevel = oeClevel;
    }

    public Date getOeTime() {
        return oeTime;
    }

    public void setOeTime(Date oeTime) {
        this.oeTime = oeTime;
    }

    public String getOeContent() {
        return oeContent;
    }

    public void setOeContent(String oeContent) {
        this.oeContent = oeContent == null ? null : oeContent.trim();
    }
}