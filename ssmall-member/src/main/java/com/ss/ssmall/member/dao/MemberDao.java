package com.ss.ssmall.member.dao;

import com.ss.ssmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fangsheng
 * @email 445317262@qq.com
 * @date 2020-09-04 17:11:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
