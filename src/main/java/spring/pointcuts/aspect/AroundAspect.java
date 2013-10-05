package spring.pointcuts.aspect;


import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Deepak Jacob
 */

public class AroundAspect {
    /**
     * The actual method that wraps around the target method
     *
     * @param pjp  ProceedingJoinPoint exposes the proceed(..) method
     *             in order to support around advice in @AJ aspects
     * @param name the method parameters
     * @return the return value from the actual method
     *
     */
    public Object aroundAdvice(ProceedingJoinPoint pjp, String name) {

        // Any statements/ expressions that you want to execute
        // prior to the actual/ target method that's being advised.
        System.out.println("This should get printed before method invocation");

        Object retValue;
        try {
            retValue = pjp.proceed();
            boolean user = ((String) retValue).contains("Admin");
            String value = user ? " is an ADMIN" : " is a USER";
            System.out.println("Message from aspect -> " + name + value);

        } catch (Throwable t) {
            throw new RuntimeException("Error while invoking method : " + pjp.getStaticPart(), t);
        }

        // Any statements/ expressions that you want to execute
        // after to the actual/ target method that's being advised.
        System.out.println("This should get printed after method invocation");

        return retValue;
    }
}
