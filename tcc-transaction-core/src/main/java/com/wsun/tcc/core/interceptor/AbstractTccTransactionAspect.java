package com.wsun.tcc.core.interceptor;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AbstractTccTransactionAspect {

    private TccTransactionInterceptor tccTransactionInterceptor;

    public void setTccTransactionInterceptor(TccTransactionInterceptor tccTransactionInterceptor) {
        this.tccTransactionInterceptor = tccTransactionInterceptor;
    }


    @Pointcut("@annotation(com.wsun.tcc.common.annatation.Tcc)")
    public void txInterceptor() {

    }


    @Around("txInterceptor()")
    public Object interceptCompensableMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 委托给具体的拦截器处理
        return tccTransactionInterceptor.intercept(proceedingJoinPoint);
    }

}
