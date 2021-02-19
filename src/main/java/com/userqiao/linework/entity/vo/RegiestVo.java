package com.userqiao.linework.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 注册
 * @author：userqiao
 * @email：userqiao@163.com
 * @date：2021/2/19 20:35
 */
@Getter
@Setter
@ApiModel
public class RegiestVo {
    @NotBlank(message = "注册码不能为空")
    @Pattern(regexp = "^[0-9]{6}$",message = "注册码必须是6位数字")
    @ApiParam("注册码")
    private String registerCode;

    @NotBlank(message = "微信临时授权码不能为空")
    @ApiParam("微信临时授权码")
    private String code;

    @NotBlank(message = "微信昵称不能为空")
    @ApiParam("微信昵称")
    private String nickName;

    @NotBlank(message = "微信头像不能为空")
    @ApiParam("微信头像地址")
    private String photo;
}
