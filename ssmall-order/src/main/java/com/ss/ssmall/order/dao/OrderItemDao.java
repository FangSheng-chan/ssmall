package com.ss.ssmall.order.dao;

import com.ss.ssmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-04 17:24:53
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
