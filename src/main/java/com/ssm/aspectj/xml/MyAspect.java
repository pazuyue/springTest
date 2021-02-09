package com.ssm.aspectj.xml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    //前置通知
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知，模拟执行权限检查");
        System.out.println("目标类是："+joinPoint.getTarget());
        System.out.println(",被植入增强处理的目标方法为："+joinPoint.getSignature().getName());
    }

    //后置通知
    public void myAfterReturning(JoinPoint joinPoint,String returnVal){
        System.out.println("后置通知：模拟记录日记..."+returnVal);
        System.out.println("被植入增强处理的目标为："+joinPoint.getSignature().getName());
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint 是 JoinPoint的子接口，表示可执行目标方法
     *                            1.必须是object类型返回
     *                            2.必须接收一个参数
     *                            3.必须是throws Throwable
     * @return
     * @throws Throwable
     */
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕开始，执行目标方法前，模拟开启事务...");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("环绕结束，执行目标方法之后，模拟关闭事务...");
        return object;
    }

    //异常通知
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("异常通知，出错了"+e.getMessage());
    }

    //最终通知
    public void myAfter(){
        System.out.println("最终通知：模拟方法结束后释放资源");
    }
}
