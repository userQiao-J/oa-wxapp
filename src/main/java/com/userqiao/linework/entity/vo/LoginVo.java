package com.userqiao.linework.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * 登录接口VO
 * @author：userqiao
 * @email：userqiao@163.com
 * @date：2021/2/19 23:01
 */
@ApiModel("登录传入的对象")
@Getter
@Setter
public class LoginVo {

    @NotBlank(message = "临时授权不能为空")
    private String code;
}
