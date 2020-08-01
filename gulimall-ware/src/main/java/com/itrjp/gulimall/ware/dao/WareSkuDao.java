package com.itrjp.gulimall.ware.dao;

import com.itrjp.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author renjp
 * @email r979668507@gmail.com
 * @date 2020-08-01 21:13:22
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
