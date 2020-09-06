package com.ss.ssmall.coupon.dao;

import com.ss.ssmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-03 11:34:10
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
