package com.ss.ssmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.common.utils.PageUtils;
import com.ss.ssmall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-04 17:11:16
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

