package com.rabbiter.staff.entity.vo;

import io.swagger.annotations.ApiModelProperty;
public class ClerkQueryVo {
    @ApiModelProperty(value = "职员姓名")
    private String name;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "部门名称")
    private String departmentName;

    private Integer isDeleted;

    public ClerkQueryVo() {
    }

    public ClerkQueryVo(String name, String position, String departmentName, Integer isDeleted) {
        this.name = name;
        this.position = position;
        this.departmentName = departmentName;
        this.isDeleted = isDeleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "ClerkQueryVo{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
