package com.kawarides.admin.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
 
	
	private static Logger logger=Logger.getLogger(LoggerAspect.class);
     
	 @Pointcut("execution( * com.kawarides .*.*.*(..))")
	 private void generalPointcut(){
		 
	 }
	 
	 @AfterThrowing(pointcut="generalPointcut() throws Exception" , throwing="ex")
	 public void exceptionLog(JoinPoint joinPoint,Exception ex) throws Exception{
		 logger.info(joinPoint.getTarget().getClass().getSimpleName()+ " : " +joinPoint.getSignature().getName() + " : "
	    + ex.getMessage() );
	 }
	 
	 @Before("generalPointcut()")
	 public void infolog(JoinPoint joinPoint){
		 logger.info(joinPoint.getTarget().getClass().getSimpleName()+ " : " +joinPoint.getSignature().getName() );
	 }
	 
}
