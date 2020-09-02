package com.ss.ssmall.product;

import com.ss.ssmall.product.entity.BrandEntity;
import com.ss.ssmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SsmallProductApplicationTests {

    @Resource
    BrandService brandService;


    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("apple");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
