package com.fhamster.dolldrobe.model;

public class SketchPic {
    private String spId;

    private String sNum;

    private String spUrl;

    public SketchPic(String spId, String sNum, String spUrl) {
        this.spId = spId;
        this.sNum = sNum;
        this.spUrl = spUrl;
    }

    public SketchPic() {
        super();
    }

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId == null ? null : spId.trim();
    }

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum == null ? null : sNum.trim();
    }

    public String getSpUrl() {
        return spUrl;
    }

    public void setSpUrl(String spUrl) {
        this.spUrl = spUrl == null ? null : spUrl.trim();
    }
}