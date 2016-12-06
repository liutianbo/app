package com.liu.fw.web.except;

/**
 * 逻辑异常
 * @author liutianbo
 *
 */
public class BusinessException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8751142774957009856L;
	
	public BusinessException(String info){
		super(info);
	}
}
