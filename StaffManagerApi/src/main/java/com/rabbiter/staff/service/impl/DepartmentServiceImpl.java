package com.rabbiter.staff.service.impl;

import com.rabbiter.staff.entity.Department;
import com.rabbiter.staff.mapper.DepartmentMapper;
import com.rabbiter.staff.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
