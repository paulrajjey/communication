package com.order.process;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Error implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorType;
	private String message;
	private String errorCode;
	public String getErrorType() {
		return errorType;
	}
	@XmlElement
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getMessage() {
		return message;
	}
	@XmlElement
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	@XmlElement
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	@Override
	public String toString() {
		return "Error [errorType=" + errorType + ", message=" + message
				+ ", errorCode=" + errorCode + "]";
	}
	
	

}
