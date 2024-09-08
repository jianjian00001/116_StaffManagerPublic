package com.rabbiter.staff.entity.vo;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class ContractQueryVo {
    @ApiModelProperty(value = "合同名称")
    private String name;

    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "签约日期")
    private Date time;

    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "截至日期")
    private Date timeout;

    @ApiModelProperty(value = "员工姓名")
    private String clerkName;

    public ContractQueryVo() {
    }

    public ContractQueryVo(String name, Date time, Date timeout, String clerkName) {
        this.name = name;
        this.time = time;
        this.timeout = timeout;
        this.clerkName = clerkName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public String getClerkName() {
        return clerkName;
    }

    public void setClerkName(String clerkName) {
        this.clerkName = clerkName;
    }

    @Override
    public String toString() {
        return "ContractQueryVo{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", timeout=" + timeout +
                ", clerkName='" + clerkName + '\'' +
                '}';
    }
}
