package com.buba.aoyo.utils;

import lombok.Data;

@Data
public class JsonData {
    private Integer code;
    private String msg;
    private Object data;
    private Long count=0L;

    public JsonData(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonData(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonData(Integer code, String msg,  Long count,Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
}
