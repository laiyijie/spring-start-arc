package net.bojiu.server.data.domain;

public class tbUser {
    private Integer id;

    private String name;

    private String phone_number;

    private String password;

    private String wechat_union_id;

    private String wechat_open_id;

    private String register_from;

    private Long register_time;

    private Long last_login_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWechat_union_id() {
        return wechat_union_id;
    }

    public void setWechat_union_id(String wechat_union_id) {
        this.wechat_union_id = wechat_union_id;
    }

    public String getWechat_open_id() {
        return wechat_open_id;
    }

    public void setWechat_open_id(String wechat_open_id) {
        this.wechat_open_id = wechat_open_id;
    }

    public String getRegister_from() {
        return register_from;
    }

    public void setRegister_from(String register_from) {
        this.register_from = register_from;
    }

    public Long getRegister_time() {
        return register_time;
    }

    public void setRegister_time(Long register_time) {
        this.register_time = register_time;
    }

    public Long getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Long last_login_time) {
        this.last_login_time = last_login_time;
    }
}