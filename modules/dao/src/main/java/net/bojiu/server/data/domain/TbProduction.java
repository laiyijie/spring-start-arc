package net.bojiu.server.data.domain;

public class TbProduction {
    private Integer ID;

    private Integer AUTHOR_ID;

    private String COVER_IMAGE_PATH;

    private String TITLE;

    private String VIDEO_ID;

    private Integer VIDEO_DURATION;

    private Integer COMMENT_COUNT;

    private Integer FAVORITE_COUNT;

    private Integer SHARE_COUNT;

    private Long UPLOAD_TIME;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getAUTHOR_ID() {
        return AUTHOR_ID;
    }

    public void setAUTHOR_ID(Integer AUTHOR_ID) {
        this.AUTHOR_ID = AUTHOR_ID;
    }

    public String getCOVER_IMAGE_PATH() {
        return COVER_IMAGE_PATH;
    }

    public void setCOVER_IMAGE_PATH(String COVER_IMAGE_PATH) {
        this.COVER_IMAGE_PATH = COVER_IMAGE_PATH;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getVIDEO_ID() {
        return VIDEO_ID;
    }

    public void setVIDEO_ID(String VIDEO_ID) {
        this.VIDEO_ID = VIDEO_ID;
    }

    public Integer getVIDEO_DURATION() {
        return VIDEO_DURATION;
    }

    public void setVIDEO_DURATION(Integer VIDEO_DURATION) {
        this.VIDEO_DURATION = VIDEO_DURATION;
    }

    public Integer getCOMMENT_COUNT() {
        return COMMENT_COUNT;
    }

    public void setCOMMENT_COUNT(Integer COMMENT_COUNT) {
        this.COMMENT_COUNT = COMMENT_COUNT;
    }

    public Integer getFAVORITE_COUNT() {
        return FAVORITE_COUNT;
    }

    public void setFAVORITE_COUNT(Integer FAVORITE_COUNT) {
        this.FAVORITE_COUNT = FAVORITE_COUNT;
    }

    public Integer getSHARE_COUNT() {
        return SHARE_COUNT;
    }

    public void setSHARE_COUNT(Integer SHARE_COUNT) {
        this.SHARE_COUNT = SHARE_COUNT;
    }

    public Long getUPLOAD_TIME() {
        return UPLOAD_TIME;
    }

    public void setUPLOAD_TIME(Long UPLOAD_TIME) {
        this.UPLOAD_TIME = UPLOAD_TIME;
    }
}