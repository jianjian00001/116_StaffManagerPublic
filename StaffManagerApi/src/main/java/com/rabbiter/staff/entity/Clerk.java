package com.rabbiter.staff.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 职员表
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
@ApiModel(value="Clerk对象", description="职员表")
public class Clerk implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "职员姓名")
    private String name;

    @ApiModelProperty(value = "性别:0->女,1->男")
    private String sex;

    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    @ApiModelProperty(value = "照片")
    private String photo;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "家庭住址")
    private String address;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "部门编号")
    private String departmentId;

    @ApiModelProperty(value = "用户账号编号")
    private String userId;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        return "Clerk{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", photo='" + photo + '\'' +
                ", idCard='" + idCard + '\'' +
                ", address='" + address + '\'' +
                ", position='" + position + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", userId='" + userId + '\'' +
                ", isDeleted=" + isDeleted +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clerk clerk = (Clerk) o;
        return Objects.equals(id, clerk.id) && Objects.equals(name, clerk.name) && Objects.equals(sex, clerk.sex) && Objects.equals(phoneNumber, clerk.phoneNumber) && Objects.equals(photo, clerk.photo) && Objects.equals(idCard, clerk.idCard) && Objects.equals(address, clerk.address) && Objects.equals(position, clerk.position) && Objects.equals(departmentId, clerk.departmentId) && Objects.equals(userId, clerk.userId) && Objects.equals(isDeleted, clerk.isDeleted) && Objects.equals(gmtCreate, clerk.gmtCreate) && Objects.equals(gmtModified, clerk.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, phoneNumber, photo, idCard, address, position, departmentId, userId, isDeleted, gmtCreate, gmtModified);
    }
}
