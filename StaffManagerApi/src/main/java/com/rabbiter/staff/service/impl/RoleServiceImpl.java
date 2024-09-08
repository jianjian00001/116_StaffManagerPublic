package com.rabbiter.staff.service.impl;

import com.rabbiter.staff.entity.Role;
import com.rabbiter.staff.mapper.RoleMapper;
import com.rabbiter.staff.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-06
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
