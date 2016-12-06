package com.liu.fw.web.entity;

/**
 * 用于返回结果的对象
 * @author liutianbo
 *
 */
public class ResultCode<T> {
	
	public ResultCode(){
		this.resultCode = "0";
		this.obj = null;
	}
	
	public ResultCode(T o, String resultCode){
		this.resultCode = resultCode;
		this.obj = o;
	}
	
	public ResultCode(String resultCode){
		this.resultCode = resultCode;
		this.obj = null;
	}
	
	
	/**
	 * 返回状态码  0 失败  1成功
	 */
	private String resultCode;
	
	private Object obj;
	
	private String errorInfo;
	
	public void setTrue(){
		this.resultCode = "1";
	}
	
	public void setTrue(T o){
		this.resultCode = "1";
		this.obj = o;
	}
	
	public void setFalse(String errorInfo){
		this.resultCode = "0";
		this.errorInfo = errorInfo;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	
	
	
}
