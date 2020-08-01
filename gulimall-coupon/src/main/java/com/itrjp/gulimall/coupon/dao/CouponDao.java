package com.itrjp.gulimall.coupon.dao;

import com.itrjp.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author renjp
 * @email r979668507@gmail.com
 * @date 2020-08-01 21:03:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
