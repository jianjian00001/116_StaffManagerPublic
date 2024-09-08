package com.rabbiter.staff.service.impl;

import com.rabbiter.staff.entity.Announcement;
import com.rabbiter.staff.mapper.AnnouncementMapper;
import com.rabbiter.staff.service.AnnouncementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公告表 服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
@Service
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, Announcement> implements AnnouncementService {

}
