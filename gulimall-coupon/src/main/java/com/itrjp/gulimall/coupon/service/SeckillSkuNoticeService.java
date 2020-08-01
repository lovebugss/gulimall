package com.itrjp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itrjp.gulimall.common.utils.PageUtils;
import com.itrjp.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author renjp
 * @email r979668507@gmail.com
 * @date 2020-08-01 21:03:05
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

