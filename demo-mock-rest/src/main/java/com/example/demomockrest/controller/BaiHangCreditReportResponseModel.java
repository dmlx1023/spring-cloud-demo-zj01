package com.example.demomockrest.controller;

import java.util.Date;

/**
 * 百行征信查询结果返回,未说明的都为必填
 */
public class BaiHangCreditReportResponseModel {
    private String errorCode;
    private String errorMessage;
    /**
     * 身份证号码
     */
    private String pid;
    /**
     * 姓名
     */
    private String name;

    /**
     * 报告头 Json
     */
    private String reportHeader;

    /**
     * 个人基本信息 Json
     */
    private String personalProfile;
    /**
     * 返回最新报送的 5 条居
     * 住信息， 按信息的更新
     * 时间倒序排列
     */
    private String homeInfo;

    /**
     * 非必填
     * 统计数据更新日期在 24
     * 个 月 以 内 的 工 作 单 位
     * （不去重）
     */
    private String workInfo;
    /**
     * 单笔贷款信息
     */
    private String nonRevolvingLoan;
    /**
     * 循环授信信息
     */
    private String revolvingLoan;
    /**
     * 显示近 12 个月的查询明
     * 细信息， 按查询日期倒
     * 序排列
     */
    private String queryHistory;
    /**
     * 记录创建时间
     */
    private Date createTime;

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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReportHeader() {
        return reportHeader;
    }

    public void setReportHeader(String reportHeader) {
        this.reportHeader = reportHeader;
    }

    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile;
    }

    public String getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(String homeInfo) {
        this.homeInfo = homeInfo;
    }

    public String getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(String workInfo) {
        this.workInfo = workInfo;
    }

    public String getNonRevolvingLoan() {
        return nonRevolvingLoan;
    }

    public void setNonRevolvingLoan(String nonRevolvingLoan) {
        this.nonRevolvingLoan = nonRevolvingLoan;
    }

    public String getRevolvingLoan() {
        return revolvingLoan;
    }

    public void setRevolvingLoan(String revolvingLoan) {
        this.revolvingLoan = revolvingLoan;
    }

    public String getQueryHistory() {
        return queryHistory;
    }

    public void setQueryHistory(String queryHistory) {
        this.queryHistory = queryHistory;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaiHangCreditReportResponseModel{");
        sb.append("errorCode='").append(errorCode).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append(", pid='").append(pid).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", reportHeader='").append(reportHeader).append('\'');
        sb.append(", personalProfile='").append(personalProfile).append('\'');
        sb.append(", homeInfo='").append(homeInfo).append('\'');
        sb.append(", workInfo='").append(workInfo).append('\'');
        sb.append(", nonRevolvingLoan='").append(nonRevolvingLoan).append('\'');
        sb.append(", revolvingLoan='").append(revolvingLoan).append('\'');
        sb.append(", queryHistory='").append(queryHistory).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
