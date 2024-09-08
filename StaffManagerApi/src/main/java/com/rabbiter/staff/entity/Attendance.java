package com.rabbiter.staff.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 考勤表
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
@ApiModel(value="Attendance对象", description="考勤表")
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "考勤名称")
    private String name;

    @ApiModelProperty(value = "正常0,事假1,迟到2,早退3,病假4,旷工5,休补6")
    private String status;
    
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "考勤日期")
    private Date time;

    @ApiModelProperty(value = "审核状态:0正在审核，1审核通过，2审核不通过")
    private String audit;

    @ApiModelProperty(value = "员工id")
    private String clerkId;

    @ApiModelProperty(value = "部门编号")
    private String departmentId;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    @TableLogic
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public String getClerkId() {
        return clerkId;
    }

    public void setClerkId(String clerkId) {
        this.clerkId = clerkId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", time=" + time +
                ", audit='" + audit + '\'' +
                ", clerkId='" + clerkId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", isDeleted=" + isDeleted +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendance that = (Attendance) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(status, that.status) && Objects.equals(time, that.time) && Objects.equals(audit, that.audit) && Objects.equals(clerkId, that.clerkId) && Objects.equals(departmentId, that.departmentId) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(gmtCreate, that.gmtCreate) && Objects.equals(gmtModified, that.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, time, audit, clerkId, departmentId, isDeleted, gmtCreate, gmtModified);
    }
}
