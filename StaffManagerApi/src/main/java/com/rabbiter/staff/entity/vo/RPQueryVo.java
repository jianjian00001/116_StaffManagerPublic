package com.rabbiter.staff.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class RPQueryVo {

    @ApiModelProperty(value = "奖惩类型:0奖励，1惩罚")
    private String type;

    private String name;

    @ApiModelProperty(value = "奖惩原因")
    private String reason;

    @ApiModelProperty(value = "奖惩金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "员工")
    private String clerkName;

    @ApiModelProperty(value = "部门")
    private String departmentName;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getClerkName() {
        return clerkName;
    }

    public void setClerkName(String clerkName) {
        this.clerkName = clerkName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "RPQueryVo{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                ", amount=" + amount +
                ", clerkName='" + clerkName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
