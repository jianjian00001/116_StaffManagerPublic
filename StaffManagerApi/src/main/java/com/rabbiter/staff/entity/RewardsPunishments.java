package com.rabbiter.staff.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 奖惩表
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
@ApiModel(value="RewardsPunishments对象", description="奖惩表")
public class RewardsPunishments implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "奖惩类型:0奖励，1惩罚")
    private String type;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "奖惩日期")
    private Date time;

    @ApiModelProperty(value = "奖惩原因")
    private String reason;

    @ApiModelProperty(value = "奖惩金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "备注")
    private String note;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardsPunishments that = (RewardsPunishments) o;
        return Objects.equals(id, that.id) && Objects.equals(type, that.type) && Objects.equals(time, that.time) && Objects.equals(reason, that.reason) && Objects.equals(amount, that.amount) && Objects.equals(note, that.note) && Objects.equals(clerkId, that.clerkId) && Objects.equals(departmentId, that.departmentId) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(gmtCreate, that.gmtCreate) && Objects.equals(gmtModified, that.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, time, reason, amount, note, clerkId, departmentId, isDeleted, gmtCreate, gmtModified);
    }

    @Override
    public String toString() {
        return "RewardsPunishments{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                ", reason='" + reason + '\'' +
                ", amount=" + amount +
                ", note='" + note + '\'' +
                ", clerkId='" + clerkId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", isDeleted=" + isDeleted +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
