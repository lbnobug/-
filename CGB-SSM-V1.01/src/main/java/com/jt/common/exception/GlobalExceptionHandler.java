package com.jt.common.exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**全局异常处理类
 * 当基于某个url出现异常以后,首先会检测
 * 当前url对应的controller中有没有异常
 * 处理方法,假如有则执行当前controller的
 * 异常处理方法,假如没有,则检测当前controller
 * 的父类中有没有对应的异常处理方法,假如
 * 有则直接访问父类的异常处理方法,假如没有
 * 则检测系统中有没有全局的异常处理方法,
 * 有则直接访问全局异常处理方法
 * */
@ControllerAdvice
public class GlobalExceptionHandler {
	  @ExceptionHandler(Exception.class)
	  @ResponseBody
	  public String handleException(
			  Exception e){
		return e.getMessage();  
	  }
}




