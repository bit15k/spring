package com.spring.aopAspectJ.Service.impl;

import com.spring.aopAspectJ.Service.IIntroductionService;

public class IntroductiondService implements IIntroductionService {
    public void induct() {
        System.out.println("=========introduction");
    }
}
