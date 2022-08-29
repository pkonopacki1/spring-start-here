package com.konopackipio1.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.konopackipio1.models.Comment;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.konopackipio1.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method will execute");
        Object[] args = joinPoint.getArgs();
        for (Object object : args) {
            if (object instanceof Comment) {
                inerceptComment(object);
            }
        }
        joinPoint.proceed();
        logger.info("Method executed");
    }

    private void inerceptComment(Object object) {
        Comment comment = (Comment) object;
        comment.setText(comment.getText() + " busted!");
    }

}
