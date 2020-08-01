package com.itrjp.gulimaill.product;

import com.itrjp.gulimall.product.GulimaillProductApplication;
import com.itrjp.gulimall.product.entity.BrandEntity;
import com.itrjp.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GulimaillProductApplication.class)
class GulimaillProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
    }

}
