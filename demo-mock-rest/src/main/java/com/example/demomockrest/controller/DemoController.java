package com.example.demomockrest.controller;

import com.example.demomockrest.BHLoanDataModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@RestController
public class DemoController {
    @RequestMapping("/api/v1/credit/report")
    public BaiHangCreditReportResponseModel demo(HttpServletRequest request,@RequestBody  BaiHangCreditReportRequestModel baiHangCreditReportRequestModel) {
//        Map map = new HashMap() {{
//            put("errorCode", "ERR-20001");
//            put("errorMessage", "Not Authorized");
//        }};
        System.out.println("=======================================");
        System.out.println(baiHangCreditReportRequestModel);
        System.out.println("=======================================");
        BaiHangCreditReportResponseModel b = new BaiHangCreditReportResponseModel();
        System.out.println(b);
        System.out.println("=======================================");
        b.setHomeInfo("1111111");
        b.setNonRevolvingLoan("111111111");
        b.setPersonalProfile("22222222222");
        b.setQueryHistory("22222222222222");
        b.setReportHeader("asssssss");
        b.setWorkInfo("222222222");
        b.setRevolvingLoan("888888888");
        return b;
    }

    /**
     * truncate table BH_RESPONSE_DATA_WHEN_LOAN;
     * truncate table BH_RESPONSE_DATA_AFTER_LOAN;
     * @param request
     * @param baiHangCreditReportRequestModel
     * @return
     */
    @RequestMapping("/api/v1/credit/loan/issue")
    public BHLoanDataModel demo1(HttpServletRequest request, @RequestBody  BHSendLoanDataOnceRequestModel baiHangCreditReportRequestModel) {
        System.out.println("===================================");
        System.out.println(baiHangCreditReportRequestModel);
        System.out.println("===================================");
        BHLoanDataModel b = new BHLoanDataModel();
        Random random = new Random();
        if (random.nextInt()%2==1){
            b.setErrorCode("#FF9999");
            b.setErrorMessage("测试错误");
        }else {

            b.setStatus("success");
        }

        return b;
    }


    @RequestMapping("/api/v1/credit/loan/track")
    public BHLoanDataModel demo12(HttpServletRequest request, @RequestBody  BHSendLoanDataPeriodRequestModel baiHangCreditReportRequestModel) {
        System.out.println("===================================");
        System.out.println(baiHangCreditReportRequestModel);
        System.out.println("===================================");
        BHLoanDataModel b = new BHLoanDataModel();
        Random random = new Random();
        if (random.nextInt()%2==1){
            b.setErrorCode("#FF9999");
            b.setErrorMessage("测试错误");
        }else {
            b.setStatus("success");
        }

        return b;
    }
}
