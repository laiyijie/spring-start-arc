package me.laiyijie.server.data.domain;

public class TbUser {
    private Integer ID;

    private String NAME;

    private String PHONE_NUMBER;

    private String PASSWORD;

    private String WECHAT_UNION_ID;

    private String WECHAT_OPEN_ID;

    private String REGISTER_FROM;

    private Long REGISTER_TIME;

    private Long LAST_LOGIN_TIME;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getWECHAT_UNION_ID() {
        return WECHAT_UNION_ID;
    }

    public void setWECHAT_UNION_ID(String WECHAT_UNION_ID) {
        this.WECHAT_UNION_ID = WECHAT_UNION_ID;
    }

    public String getWECHAT_OPEN_ID() {
        return WECHAT_OPEN_ID;
    }

    public void setWECHAT_OPEN_ID(String WECHAT_OPEN_ID) {
        this.WECHAT_OPEN_ID = WECHAT_OPEN_ID;
    }

    public String getREGISTER_FROM() {
        return REGISTER_FROM;
    }

    public void setREGISTER_FROM(String REGISTER_FROM) {
        this.REGISTER_FROM = REGISTER_FROM;
    }

    public Long getREGISTER_TIME() {
        return REGISTER_TIME;
    }

    public void setREGISTER_TIME(Long REGISTER_TIME) {
        this.REGISTER_TIME = REGISTER_TIME;
    }

    public Long getLAST_LOGIN_TIME() {
        return LAST_LOGIN_TIME;
    }

    public void setLAST_LOGIN_TIME(Long LAST_LOGIN_TIME) {
        this.LAST_LOGIN_TIME = LAST_LOGIN_TIME;
    }
}