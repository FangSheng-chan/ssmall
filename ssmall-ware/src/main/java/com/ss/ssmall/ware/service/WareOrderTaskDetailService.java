package com.ss.ssmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.common.utils.PageUtils;
import com.ss.ssmall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-04 17:30:26
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

