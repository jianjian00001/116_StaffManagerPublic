package com.rabbiter.staff.service;

import com.rabbiter.staff.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbiter.staff.entity.vo.UserVo;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-06
 */
public interface UserService extends IService<User> {
    //如果验证成功 返回tokrn 否则返回null或者异常
    public String login(UserVo userVo);
}
