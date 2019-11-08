package com.example.demomockrest.controller;

/**
 * 百行征信查询请求model
 */
public class BaiHangCreditReportRequestModel {
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号码
     */
    private String pid;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 查询原因 1 授信审批
     */
    private int queryReason;
    /**
     * 贷款担保类型1-信用
     */
    private int guaranteeType;
    /**
     * 贷款用途 10 企业经营
     */
    private int loanPurpose;
    /**
     * 	客户类型：3-自雇人员
     */
    private int customType;
    /**
     * 	申请贷款金额填写-1
     */
    private int applyAmount;


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

    public int getQueryReason() {
        return queryReason;
    }

    public void setQueryReason(int queryReason) {
        this.queryReason = queryReason;
    }

    public int getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(int guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public int getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(int loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public int getCustomType() {
        return customType;
    }

    public void setCustomType(int customType) {
        this.customType = customType;
    }

    public int getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(int applyAmount) {
        this.applyAmount = applyAmount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaiHangCreditReportRequestModel{");
        sb.append("name='").append(name).append('\'');
        sb.append(", pid='").append(pid).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", queryReason=").append(queryReason);
        sb.append(", guaranteeType=").append(guaranteeType);
        sb.append(", loanPurpose=").append(loanPurpose);
        sb.append(", customType=").append(customType);
        sb.append(", applyAmount=").append(applyAmount);
        sb.append('}');
        return sb.toString();
    }
}
