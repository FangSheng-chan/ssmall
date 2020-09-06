package com.ss.ssmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.common.utils.PageUtils;
import com.ss.ssmall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-03 11:34:09
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

