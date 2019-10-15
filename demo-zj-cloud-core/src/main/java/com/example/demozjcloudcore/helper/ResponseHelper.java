package com.example.demozjcloudcore.helper;

import com.zijinph.core.dto.BaseResponse;
import com.zijinph.core.enums.ReturnCode;

/**
 * @author duanmulixiang
 */
public class ResponseHelper {
    private ResponseHelper() {
    }

    public static BaseResponse success() {
        BaseResponse response = new BaseResponse();
        response.setCode(ReturnCode.SUCCESS.getCode());
        response.setMessage(ReturnCode.SUCCESS.getMessage());
        return response;
    }

    public static BaseResponse success(Object result) {
        BaseResponse response = new BaseResponse();
        response.setCode(ReturnCode.SUCCESS.getCode());
        response.setMessage(ReturnCode.SUCCESS.getMessage());
        response.setResult(result);
        return response;
    }


    public static BaseResponse fail(ReturnCode returnCode) {
        BaseResponse response = new BaseResponse();
        response.setCode(returnCode.getCode());
        response.setMessage(returnCode.getMessage());
        return response;
    }

    public static BaseResponse fail(ReturnCode returnCode, Object result) {
        BaseResponse response = new BaseResponse();
        response.setCode(returnCode.getCode());
        response.setMessage(returnCode.getMessage());
        response.setResult(result);
        return response;
    }

    public static BaseResponse buildResponse(ReturnCode returnCode) {
        BaseResponse response = new BaseResponse();
        response.setCode(returnCode.getCode());
        response.setMessage(returnCode.getMessage());
        return response;
    }

    public static BaseResponse buildResponse(ReturnCode returnCode, Object result) {
        BaseResponse response = new BaseResponse();
        response.setCode(returnCode.getCode());
        response.setMessage(returnCode.getMessage());
        response.setResult(result);
        return response;
    }
    public static BaseResponse buildResponse(String code, String message,Object result) {
        BaseResponse response = new BaseResponse();
        response.setCode(code);
        response.setMessage(message);
        response.setResult(result);
        return response;
    }

}