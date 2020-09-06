package com.ss.ssmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.common.utils.PageUtils;
import com.ss.ssmall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-03 11:34:10
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

