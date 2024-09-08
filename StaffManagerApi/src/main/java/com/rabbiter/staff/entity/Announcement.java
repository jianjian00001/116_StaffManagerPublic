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
 * 公告表
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
@ApiModel(value="Announcement对象", description="公告表")
public class Announcement implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "公告标题")
    private String title;

    @ApiModelProperty(value = "内容")
    private String content;

    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "发布时间")
    private Date time;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
        return "Announcement{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", isDeleted=" + isDeleted +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Announcement that = (Announcement) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(content, that.content) && Objects.equals(time, that.time) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(gmtCreate, that.gmtCreate) && Objects.equals(gmtModified, that.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, time, isDeleted, gmtCreate, gmtModified);
    }
}
