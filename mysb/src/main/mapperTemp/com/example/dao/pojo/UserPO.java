package com.example.dao.pojo;

public class UserPO {
    private Integer id;

    private String uid;

    private String uname;

    private Integer uage;

    private String uphone;

    private String uemail;

    public UserPO(Integer id, String uid, String uname, Integer uage, String uphone, String uemail) {
        this.id = id;
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
        this.uphone = uphone;
        this.uemail = uemail;
    }

    public UserPO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }
}