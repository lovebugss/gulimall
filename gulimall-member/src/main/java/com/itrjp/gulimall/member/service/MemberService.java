package com.itrjp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itrjp.gulimall.common.utils.PageUtils;
import com.itrjp.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author renjp
 * @email r979668507@gmail.com
 * @date 2020-08-01 21:05:26
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

