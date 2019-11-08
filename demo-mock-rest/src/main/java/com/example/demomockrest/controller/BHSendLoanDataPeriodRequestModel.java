package com.example.demomockrest.controller;

import java.util.Date;

/**
 * @author by duanmulixiang@zijinph.com
 * @date 2019/11/1.
 * @desc 贷后报送数据
 */
public class BHSendLoanDataPeriodRequestModel {
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
    /**
     * 本 笔 贷 款 的 第 几 期 还
     * 款，从 1 开始， 取值范
     * 围 1-36,000。
     * */
    private int termNo;
    /*
     * 正常还款填写 normal,如果逾期填写 overdue。
     * */
    private String termStatus;

    /**
     * 本 期 应
     * 还款日YYYY-MM-DD
     */
    private String targetRepaymentDate;
    /**
     * 实 际 还
     * 款时间时间格式 2016-03-08T10:03:10
     * 有还款流水发生
     * （本次还款金额大于 0）
     * 时 ， 该 字 段 为 必 填 字
     * 段，
     */
    private String realRepaymentDate;

    /**
     * 本 期 计
     * 划 应 还
     * 款金额
     */
    private String plannedPayment;
    /**
     * 本期
     * 应还款金额扣除本期累
     * 计已还款金额，加上或有的逾期罚息之后的金
     * 额
     * 不存在部分还款 为0
     */
    private String targetRepayment;
    /**
     * 本 次 还
     * 款金额保留小
     * 数点后两位。
     */
    private String realRepayment;
    /**
     * 当 前 逾
     * 期天数
     *如果本笔贷款状态为正
     * 常， 该字段为空。否则
     * 填写“ D” +本笔贷款已
     * 逾 期 天 数 。
     *
     *
     */
    private String overdueStatus;
    /**
     * 机构确认本期还款的状
     * 态时间
     * 取计划表的 CHARGE_TIME
     */
    private String statusConfirmAt;
    /**
     * 截至到本次报送，累计
     * 的逾期贷款金额
     */
    private String overdueAmount;

    /**
     *本笔贷款的未还金额
     */
    private String remainingAmount;
    /**
     * 本比贷款状态 1 正常 2逾期
     */
    private int loanStatus;
    private String applCode;
    /**
     * 计划表的主键
     */
    private String id;
    private String createTimeStr;
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

    public int getTermNo() {
        return termNo;
    }

    public void setTermNo(int termNo) {
        this.termNo = termNo;
    }

    public String getTermStatus() {
        return termStatus;
    }

    public void setTermStatus(String termStatus) {
        this.termStatus = termStatus;
    }


    public String getTargetRepaymentDate() {
        return targetRepaymentDate;
    }

    public void setTargetRepaymentDate(String targetRepaymentDate) {
        this.targetRepaymentDate = targetRepaymentDate;
    }

    public String getRealRepaymentDate() {
        return realRepaymentDate;
    }

    public void setRealRepaymentDate(String realRepaymentDate) {
        this.realRepaymentDate = realRepaymentDate;
    }

    public String getPlannedPayment() {
        return plannedPayment;
    }

    public void setPlannedPayment(String plannedPayment) {
        this.plannedPayment = plannedPayment;
    }

    public String getTargetRepayment() {
        return targetRepayment;
    }

    public void setTargetRepayment(String targetRepayment) {
        this.targetRepayment = targetRepayment;
    }

    public String getRealRepayment() {
        return realRepayment;
    }

    public void setRealRepayment(String realRepayment) {
        this.realRepayment = realRepayment;
    }

    public String getOverdueStatus() {
        return overdueStatus;
    }

    public void setOverdueStatus(String overdueStatus) {
        this.overdueStatus = overdueStatus;
    }

    public String getStatusConfirmAt() {
        return statusConfirmAt;
    }

    public void setStatusConfirmAt(String statusConfirmAt) {
        this.statusConfirmAt = statusConfirmAt;
    }

    public String getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(String overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public String getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public int getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(int loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getApplCode() {
        return applCode;
    }

    public void setApplCode(String applCode) {
        this.applCode = applCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BHSendLoanDataPeriodRequestModel{");
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
        sb.append(", termNo=").append(termNo);
        sb.append(", termStatus='").append(termStatus).append('\'');
        sb.append(", targetRepaymentDate='").append(targetRepaymentDate).append('\'');
        sb.append(", realRepaymentDate='").append(realRepaymentDate).append('\'');
        sb.append(", plannedPayment='").append(plannedPayment).append('\'');
        sb.append(", targetRepayment='").append(targetRepayment).append('\'');
        sb.append(", realRepayment='").append(realRepayment).append('\'');
        sb.append(", overdueStatus='").append(overdueStatus).append('\'');
        sb.append(", statusConfirmAt='").append(statusConfirmAt).append('\'');
        sb.append(", overdueAmount='").append(overdueAmount).append('\'');
        sb.append(", remainingAmount='").append(remainingAmount).append('\'');
        sb.append(", loanStatus=").append(loanStatus);
        sb.append(", applCode='").append(applCode).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", createTimeStr='").append(createTimeStr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
