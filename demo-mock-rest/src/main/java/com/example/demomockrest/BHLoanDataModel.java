package com.example.demomockrest;

import java.util.Date;

/**
 * @author by duanmulixiang@zijinph.com
 * @date 2019/11/1.
 * @desc 百行数据放送返回
 */
public class BHLoanDataModel {
    private String errorCode;
    private String errorMessage;

    private String reqId;
    /**
     * 贷款编号
     */
    private String loanId;
    /**
     * 总是“ success” 。
     */
    private String status;
    private Date createTime;
    /**
     * 计划表的主键
     */
    private String id;
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
