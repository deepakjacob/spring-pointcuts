package spring.pointcuts.aspect;

import org.aspectj.lang.JoinPoint;

public class BeforeAspect {
    public void logBeforeSayHello(JoinPoint joinPoint, String name){
        System.out.println("Intercepted " + joinPoint.toLongString() + ", Name : " + name);
    }

}
