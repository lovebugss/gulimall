package com.itrjp.gulimall.member.feign;

import com.itrjp.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : renjp
 * @date : 2020-08-01 22:03
 **/
@FeignClient("gulimall-coupon")
public interface MemberFeignService {
    @RequestMapping("coupon/coupon/member/coupons")
    public R memberCoupons();
}
