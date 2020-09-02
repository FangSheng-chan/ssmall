package com.ss.ssmall.product;

import com.ss.ssmall.product.entity.BrandEntity;
import com.ss.ssmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.swing.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsmallProductApplicationTests {

    @Resource
    BrandService brandService;


    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("apple");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
