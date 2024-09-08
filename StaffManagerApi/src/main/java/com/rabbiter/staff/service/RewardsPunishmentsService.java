package com.rabbiter.staff.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rabbiter.staff.entity.RewardsPunishments;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbiter.staff.entity.vo.RPQueryVo;

/**
 * <p>
 * 奖惩表 服务类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
public interface RewardsPunishmentsService extends IService<RewardsPunishments> {

    IPage<RewardsPunishments> pageListQuery(Page<RewardsPunishments> clerkPage, RPQueryVo rpQueryVo);
}
