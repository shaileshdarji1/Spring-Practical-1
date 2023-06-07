package com.springboot.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ProductAspect {
    Logger logger = LoggerFactory.getLogger(ProductAspect.class);

    @Around("execution()")
}
