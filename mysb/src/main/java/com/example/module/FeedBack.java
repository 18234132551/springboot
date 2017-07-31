package com.example.module;

/**
 * Created by Administrator on 2017/7/30.
 */
public class FeedBack<T> {
    private Integer code;
    private String info;
    private T data;
    public FeedBack() {
    }
    public FeedBack(Integer code,String info,T data) {
        this.code = code;
        this.info = info;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public T getT() {
        return data;
    }

    public void setT(T t) {
        this.data = t;
    }
}
