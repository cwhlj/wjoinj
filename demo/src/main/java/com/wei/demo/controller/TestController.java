package com.wei.demo.controller;

import com.wei.demo.model.UserExcelModel;
import com.wei.demo.utils.ValidationUtils;

import javax.validation.ConstraintViolation;
import java.util.Set;

/**
 * @Author chengwei
 * @Description:
 * @Date 2020/8/9 9:34 下午
 */
public class TestController {
//    @PostMapping("/v2/importExcel")
//    public UserExcelModel importExcelV2(@RequestParam("file") MultipartFile file){
//        List<UserExcelModel> list = null;
//        List<UserExcelModel> fail = new ArrayList<>();
//        UserExcelVO userExcelVO = new UserExcelVO();
//        try {
//            list = EasyExcel.read(file.getInputStream(),UserExcelModel.class,new ModelExcelListener()).sheet().doReadSync();
//            list.forEach(data->{
//                Set<ConstraintViolation<UserExcelModel>> violations  =  ValidationUtils.getValidator().validate(data);
//                if(violations.size()>0){
//                    fail.add(data);
//                }
//            });
//            userExcelVO.setFail(fail);
//            list.removeAll(fail);
//            userExcelVO.setSuccess(list);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return userExcelVO;
//    }

    public static void main(String[] args) {
        UserExcelModel excelModel = new UserExcelModel();

        Set<ConstraintViolation<UserExcelModel>> violations  =  ValidationUtils.getValidator().validate(excelModel);
        for (ConstraintViolation<UserExcelModel> violation : violations) {
            violation.getMessage();
            violation.getPropertyPath();
            System.out.println(violation);
        }
//        if(violations.size()>0){
//            fail.add(data);
//        }
//        excelModel = new UserExcelModel();
//        excelModel.setName("name");
//        list.add(excelModel);
//
//        excelModel = new UserExcelModel();
//        excelModel.setName("name");
//        excelModel.setAge(1);
//        list.add(excelModel);
//
//        excelModel = new UserExcelModel();
//        excelModel.setName("name");
//        excelModel.setAge(1);
//        excelModel.setSex("1");
//        list.add(excelModel);
//
//        List<UserExcelModel> fail = new ArrayList<>();
//        list.forEach(data->{
//            Set<ConstraintViolation<UserExcelModel>> violations  =  ValidationUtils.getValidator().validate(data);
//            if(violations.size()>0){
//                fail.add(data);
//            }
//        });
//        System.out.println(fail.size());
    }
}
