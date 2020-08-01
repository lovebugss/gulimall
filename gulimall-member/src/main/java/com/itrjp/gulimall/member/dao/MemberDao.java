package com.itrjp.gulimall.member.dao;

import com.itrjp.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author renjp
 * @email r979668507@gmail.com
 * @date 2020-08-01 21:05:26
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
