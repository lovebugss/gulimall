package com.itrjp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itrjp.gulimall.common.utils.PageUtils;
import com.itrjp.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author renjp
 * @email r979668507@gmail.com
 * @date 2020-08-01 21:03:05
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

