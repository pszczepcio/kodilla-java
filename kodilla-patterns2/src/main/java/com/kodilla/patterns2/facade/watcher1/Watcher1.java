package com.kodilla.patterns2.facade.watcher1;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class Watcher1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher1.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
                "&& args(orderNumber, userId) && target(object)")
    private void logEvent(OrderDto orderNumber, Long userId , Object object){
        LOGGER.info("Log Event :" + "\n" +
                "Order size: " + orderNumber.getItems().size() + "\n" +
                "User Id: " + userId + "\n"+
                "Class: " + object.getClass().getName());
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (end - begin) + "[ms]");
        }catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
