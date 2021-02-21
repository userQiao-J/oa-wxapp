package com.userqiao.linework.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * 常量封装类
 * @author：userqiao
 * @email：userqiao@163.com
 * @date：2021/2/21 22:45
 */
@Getter
@Setter
@Component
public class SystemConstants {
    public String attendanceStartTime;
    public String attendanceTime;
    public String attendanceEndTime;
    public String closingStartTime;
    public String closingTime;
    public String closingEndTime;
}
