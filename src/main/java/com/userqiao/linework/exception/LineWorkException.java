package com.userqiao.linework.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author：userqiao
 * @email：userqiao@163.com
 * @date：2021/2/16 22:43
 */
@Getter
@Setter
public class LineWorkException extends RuntimeException{

    private String msg = "";
    private int code = 500;

    public LineWorkException(String msg){
        super(msg);
        this.msg = msg;
    }

    public LineWorkException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }
    public LineWorkException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }
    public LineWorkException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

}
