package com.itrjp.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.itrjp.gulimall.member.feign.MemberFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.itrjp.gulimall.member.entity.MemberEntity;
import com.itrjp.gulimall.member.service.MemberService;
import com.itrjp.gulimall.common.utils.PageUtils;
import com.itrjp.gulimall.common.utils.R;


/**
 * 会员
 *
 * @author renjp
 * @email r979668507@gmail.com
 * @date 2020-08-01 21:05:26
 */
@RefreshScope
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberFeignService memberFeignService;

    @Value("${member.user.name}")
    private String name;
    @Value("${member.user.age}")
    private Integer age;

    @GetMapping("test")
    public R test() {
        return R.ok().put("user", name).put("age", age);
    }

    @RequestMapping("/coupons")
    public R coupons() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");
        Object coupons = memberFeignService.memberCoupons().get("coupons");
        return R.ok().put("member", memberEntity).put("coupon", coupons);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id) {
        MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids) {
        memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
