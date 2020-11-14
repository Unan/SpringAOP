package root.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class BeforeAfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * root.subject.*.*(..))")
    public void callSubjectService() {
    }

    @Before("callSubjectService()")
    public void beforeCall(JoinPoint jp) {
        logger.info("before " + jp.toString() + ", args=" + Arrays.toString(jp.getArgs()));
    }

    @After("callSubjectService()")
    public void afterCall(JoinPoint jp) {
        logger.info("after " + jp.toString() + ", args=" + Arrays.toString(jp.getArgs()));
    }
}