package com.spring.aopSchema.service.impl;

import com.spring.aopSchema.service.IIntroductionService;

/**
 * 引入接口实现类
 */
public class IntroductiondService implements IIntroductionService {
    public void induct() {
        System.out.println("引入...");
    }
}
