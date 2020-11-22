package com.wei.demo.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @Author chengwei
 * @Description:
 * @Date 2020/8/9 9:30 下午
 */
@Data
public class UserExcelModel implements Serializable {
    @NotBlank(message = "手机号不能为空")
    @Size(max = 4)
    private String name;

    @NotNull(message = "年龄不能为空")
    private Integer age;

    @Pattern(regexp = "^[1][3,4,5,7,8][0-9]{9}$$", message = "手机号不合法")
    @NotBlank(message = "手机号不能为空")
    private String mobile;

    @NotBlank(message = "性别不能为空")
    private String sex;


    public UserExcelModel(String name, Integer age, String mobile, String sex) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.sex = sex;
    }
    public UserExcelModel(){}
}
