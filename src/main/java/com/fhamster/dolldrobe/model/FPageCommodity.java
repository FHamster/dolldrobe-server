package com.fhamster.dolldrobe.model;

import java.util.Date;

public class FPageCommodity extends FPageCommodityKey {
    private Date fgDate;

    public FPageCommodity(String cNum, String uAccountnumber, Date fgDate) {
        super(cNum, uAccountnumber);
        this.fgDate = fgDate;
    }

    public FPageCommodity() {
        super();
    }

    public Date getFgDate() {
        return fgDate;
    }

    public void setFgDate(Date fgDate) {
        this.fgDate = fgDate;
    }
}