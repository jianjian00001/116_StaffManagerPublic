package com.rabbiter.staff.entity.vo;

import io.swagger.annotations.ApiModelProperty;

public class AttendanceQueryVo {
    @ApiModelProperty(value = "考勤名称")
    private String name;

    @ApiModelProperty(value = "正常0,事假1,迟到2,早退3,病假4,旷工5,休补6")
    private String status;

    @ApiModelProperty(value = "审核状态:0正在审核，1审核通过，2审核不通过")
    private String audit;

    @ApiModelProperty(value = "员工姓名")
    private String clerkName;

    @ApiModelProperty(value = "部门姓名")
    private String departmentName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
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
        return "AttendanceQueryVo{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", audit='" + audit + '\'' +
                ", clerkName='" + clerkName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
