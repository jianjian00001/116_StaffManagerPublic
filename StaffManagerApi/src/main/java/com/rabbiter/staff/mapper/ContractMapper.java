package com.rabbiter.staff.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rabbiter.staff.entity.Contract;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rabbiter.staff.entity.vo.ContractQueryVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 合同表 Mapper 接口
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
public interface ContractMapper extends BaseMapper<Contract> {

    IPage<Contract> pageListQuery(Page<Contract> clerkPage,@Param("contractQueryVo")ContractQueryVo contractQueryVo);
}
