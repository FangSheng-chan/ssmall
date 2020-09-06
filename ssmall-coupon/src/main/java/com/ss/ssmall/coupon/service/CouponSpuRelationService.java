package com.ss.ssmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.common.utils.PageUtils;
import com.ss.ssmall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-03 11:34:11
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

