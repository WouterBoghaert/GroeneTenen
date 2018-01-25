package be.vdab.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect	
@Component
class PointcutExpressions {
	@Pointcut("execution(* be.vdab.services.*.*(..))")
	void services() {}
	
	@Pointcut("execution(* be.vdab.services.*.*(..)) " +
	"|| execution(* org.springframework.transactions.*.*(..))")
	void servicesEnTransacties() {}
}
