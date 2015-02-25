package com.order.process;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Notification implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String department;
	String type;
	String userid;
	String emailid;
	String message;
	String description;
	public String getDepartment() {
		return department;
	}
	@XmlElement
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getType() {
		return type;
	}
	@XmlElement
	public void setType(String type) {
		this.type = type;
	}
	public String getUserid() {
		return userid;
	}
	@XmlElement
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmailid() {
		return emailid;
	}
	@XmlElement
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Notification [department=" + department + ", type=" + type
				+ ", userid=" + userid + ", emailid=" + emailid + ", message="
				+ message + ", description=" + description + "]";
	}
	
	

}
