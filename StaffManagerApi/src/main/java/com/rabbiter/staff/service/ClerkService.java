package com.rabbiter.staff.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rabbiter.staff.entity.Clerk;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbiter.staff.entity.vo.ClerkQueryVo;

/**
 * <p>
 * 职员表 服务类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
public interface ClerkService extends IService<Clerk> {
    //员工分页查询
    IPage<Clerk> pageListQuery(Page<Clerk> clerkPage, ClerkQueryVo clerkQueryVo);

    boolean addClerk(Clerk clerk);

    boolean updateClerk(Clerk clerk);

    boolean deleteClerkById(String id);
}
