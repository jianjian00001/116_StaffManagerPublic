package com.rabbiter.staff.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rabbiter.staff.entity.Contract;
import com.rabbiter.staff.entity.vo.ContractQueryVo;
import com.rabbiter.staff.mapper.ContractMapper;
import com.rabbiter.staff.service.ContractService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 合同表 服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
@Service
public class ContractServiceImpl extends ServiceImpl<ContractMapper, Contract> implements ContractService {

    @Override
    public IPage<Contract> pageListQuery(Page<Contract> clerkPage, ContractQueryVo contractQueryVo) {
        IPage<Contract> contractIPage = baseMapper.pageListQuery(clerkPage,contractQueryVo);
        return contractIPage;
    }
}
