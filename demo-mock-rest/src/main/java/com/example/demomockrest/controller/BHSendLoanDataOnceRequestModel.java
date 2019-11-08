package com.example.demomockrest.controller;

import java.util.Date;

/**
 * @author by duanmulixiang@zijinph.com
 * @date 2019/11/1.
 * @desc 放款报送数据
 */
public class BHSendLoanDataOnceRequestModel {
    private String errorCode;
    private String errorMessage;
    /**
     * 总是“ success” 。
     */
    private String status;
    private Date createTime;
    private Date updateTime;
    /**
     * 记录唯一
     * 标识
     * 这里使用合同号
     */
    private String reqID;
    /**
     * 操作代码
     * 首次上报默认A-新增数据，若上报有误需要重新上报则选M-修改数据；
     */
    private String opCode;
    /**
     * 记录生成
     * 时间
     * ， 时间
     * 应介于 1980-01-01 和当前
     * 日期（含）之间。
     * 格式 2016-03-08T10:03:10
     */
    private String uploadTs;
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String pid;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 贷款编号
     */
    private String loanId;
    /*
     * 贷款担保类型 1-信用
     * */
    private String guaranteeType;
    /*
     * 贷款用途 10-企业经营
     * */
    private String loanPurpose;
    /**
     * 贷款申请时间格式 2016-03-08T10:03:10
     */
    private String applyDate;
    /**
     * 账户开立时间格式 2016-03-08T10:03:10
     */
    private String accountOpenDate;
    /**
     * 贷款放款时间格式 2016-03-08T10:03:10
     */
    private String issueDate;

    /**
     *
     * 贷款到期时间
     */
    private String dueDate;
    /**
     * 贷款金额
     */
    private String loanAmount;
    /**
     * 还款总期数
     */
    private int totalTerm;
    /**
     * 账单日类型 1
     */
    private int targetRepayDateType ;
    private String targetRepayDateTypeStr;
    /**
     * 每期还款周期
     */
    private int termPeriod;
    /**
     * 账单日列表
     * 对于“账单日类型”
     * 为“固定日期” 的产品，填
     * 写所有账单日的列表，每个
     * 账单日的格式为“ YYYY-MMDD” ， 不 同 账 单 日 之 间 以
     * “ ,” （逗号）分隔
     */
    private String targetRepayDateList;

    /**
     * YYYY-MM-DD
     * 首次应还
     * 款日
     */
    private String firstRepaymentDate;
    /**
     * 宽限期
     */
    private int gracePeriod;
    /**
     * 业务编号
     */
    private String applCode;

    private String createTimeStr;

    public String getReqID() {
        return reqID;
    }

    public void setReqID(String reqID) {
        this.reqID = reqID;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public String getUploadTs() {
        return uploadTs;
    }

    public void setUploadTs(String uploadTs) {
        this.uploadTs = uploadTs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getAccountOpenDate() {
        return accountOpenDate;
    }

    public void setAccountOpenDate(String accountOpenDate) {
        this.accountOpenDate = accountOpenDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }


    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTotalTerm() {
        return totalTerm;
    }

    public void setTotalTerm(int totalTerm) {
        this.totalTerm = totalTerm;
    }

    public int getTargetRepayDateType() {
        return targetRepayDateType;
    }

    public void setTargetRepayDateType(int targetRepayDateType) {
        this.targetRepayDateType = targetRepayDateType;
    }

    public int getTermPeriod() {
        return termPeriod;
    }

    public void setTermPeriod(int termPeriod) {
        this.termPeriod = termPeriod;
    }

    public String getTargetRepayDateList() {
        return targetRepayDateList;
    }

    public void setTargetRepayDateList(String targetRepayDateList) {
        this.targetRepayDateList = targetRepayDateList;
    }

    public String getFirstRepaymentDate() {
        return firstRepaymentDate;
    }

    public void setFirstRepaymentDate(String firstRepaymentDate) {
        this.firstRepaymentDate = firstRepaymentDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getApplCode() {
        return applCode;
    }

    public void setApplCode(String applCode) {
        this.applCode = applCode;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getTargetRepayDateTypeStr() {
        return targetRepayDateTypeStr;
    }

    public void setTargetRepayDateTypeStr(String targetRepayDateTypeStr) {
        this.targetRepayDateTypeStr = targetRepayDateTypeStr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BHSendLoanDataOnceRequestModel{");
        sb.append("errorCode='").append(errorCode).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", reqID='").append(reqID).append('\'');
        sb.append(", opCode='").append(opCode).append('\'');
        sb.append(", uploadTs='").append(uploadTs).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", pid='").append(pid).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", loanId='").append(loanId).append('\'');
        sb.append(", guaranteeType='").append(guaranteeType).append('\'');
        sb.append(", loanPurpose='").append(loanPurpose).append('\'');
        sb.append(", applyDate='").append(applyDate).append('\'');
        sb.append(", accountOpenDate='").append(accountOpenDate).append('\'');
        sb.append(", issueDate='").append(issueDate).append('\'');
        sb.append(", dueDate='").append(dueDate).append('\'');
        sb.append(", loanAmount='").append(loanAmount).append('\'');
        sb.append(", totalTerm=").append(totalTerm);
        sb.append(", targetRepayDateType=").append(targetRepayDateType);
        sb.append(", targetRepayDateTypeStr='").append(targetRepayDateTypeStr).append('\'');
        sb.append(", termPeriod=").append(termPeriod);
        sb.append(", targetRepayDateList='").append(targetRepayDateList).append('\'');
        sb.append(", firstRepaymentDate='").append(firstRepaymentDate).append('\'');
        sb.append(", gracePeriod=").append(gracePeriod);
        sb.append(", applCode='").append(applCode).append('\'');
        sb.append(", createTimeStr='").append(createTimeStr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
