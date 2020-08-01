package com.itrjp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itrjp.gulimall.common.utils.PageUtils;
import com.itrjp.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author renjp
 * @email r979668507@gmail.com
 * @date 2020-08-01 21:12:04
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

