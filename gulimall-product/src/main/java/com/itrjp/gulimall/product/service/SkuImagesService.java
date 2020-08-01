package com.itrjp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itrjp.gulimall.common.utils.PageUtils;
import com.itrjp.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author renjp
 * @email r979668507@gmail.com
 * @date 2020-08-01 17:55:49
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

