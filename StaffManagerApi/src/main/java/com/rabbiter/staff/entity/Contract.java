package com.rabbiter.staff.entity;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 合同表
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
@ApiModel(value="Contract对象", description="合同表")
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

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

    @ApiModelProperty(value = "员工id")
    private String clerkId;

    @ApiModelProperty(value = "图片")
    private String url;

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

    public String getClerkId() {
        return clerkId;
    }

    public void setClerkId(String clerkId) {
        this.clerkId = clerkId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        Contract contract = (Contract) o;
        return Objects.equals(id, contract.id) && Objects.equals(name, contract.name) && Objects.equals(time, contract.time) && Objects.equals(timeout, contract.timeout) && Objects.equals(clerkId, contract.clerkId) && Objects.equals(url, contract.url) && Objects.equals(isDeleted, contract.isDeleted) && Objects.equals(gmtCreate, contract.gmtCreate) && Objects.equals(gmtModified, contract.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, time, timeout, clerkId, url, isDeleted, gmtCreate, gmtModified);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", timeout=" + timeout +
                ", clerkId='" + clerkId + '\'' +
                ", url='" + url + '\'' +
                ", isDeleted=" + isDeleted +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
