package com.example.demozjcloudcore.helper;

import com.zijinph.core.dto.BaseResponse;
import com.zijinph.core.enums.ReturnCode;
import com.zijinph.core.exception.BusinessException;
import com.zijinph.core.util.StringUtil;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author duanmulixiang
 */
@RestControllerAdvice
public class ZJResponseAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        ZJResponse[] clzz = returnType.getDeclaringClass().getAnnotationsByType(ZJResponse.class);
        ZJResponse methAnnoation = returnType.getMethodAnnotation(ZJResponse.class);
        if (clzz.length == 0 && methAnnoation==null){
            return false;
        }
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (BaseResponse.class.isAssignableFrom(body.getClass())) {
            return body;
        } else {
            return ResponseHelper.success(body);
        }
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResponse handleExcepion() {
        return ResponseHelper.fail(ReturnCode.SYS_ERROR);
    }

    @ExceptionHandler(BusinessException.class)
    public BaseResponse handleException(Exception e) {
        String errorMessage = e.getMessage();
        if (StringUtil.isEmpty(errorMessage)) {
            errorMessage = ReturnCode.BIZ_ERROR.getMessage();
        }
        return ResponseHelper.buildResponse(ReturnCode.BIZ_ERROR.getCode(), errorMessage, null);
    }

}
