package com.ss.ssmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.common.utils.PageUtils;
import com.ss.ssmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-02 16:06:51
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

