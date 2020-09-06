package com.ss.ssmall.order.dao;

import com.ss.ssmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-04 17:24:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
