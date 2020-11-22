package com.wei.demo.utils;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @Author chengwei
 * @Description:
 * @Date 2020/8/9 9:26 下午
 */
public class ValidationUtils {
    public static Validator getValidator(){
        return validator;
    }

    static Validator validator;
    static{
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator=validatorFactory.getValidator();
    }
}
