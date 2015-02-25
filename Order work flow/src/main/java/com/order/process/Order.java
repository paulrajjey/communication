package com.order.process;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String prodcutid;
	private String ipAddress;
	private String prodcutName;
	private String jobType;
	private DeployableService service;
    private List<Notification> notifcation;
    
	public String getProdcutid() {
		return prodcutid;
	}
	@XmlElement
	public void setProdcutid(String prodcutid) {
		this.prodcutid = prodcutid;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	@XmlElement
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getProdcutName() {
		return prodcutName;
	}
	@XmlElement
	public void setProdcutName(String prodcutName) {
		this.prodcutName = prodcutName;
	}
	public String getJobType() {
		return jobType;
	}
	@XmlElement
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public DeployableService getService() {
		return service;
	}
	@XmlElement
	public void setService(DeployableService service) {
		this.service = service;
	}
	
	public List<Notification> getNotifcation() {
		return notifcation;
	}
	@XmlElement
	public void setNotifcation(List<Notification> notifcation) {
		this.notifcation = notifcation;
	}
	@Override
	public String toString() {
		return "Order [prodcutid=" + prodcutid + ", ipAddress=" + ipAddress
				+ ", prodcutName=" + prodcutName + ", jobType=" + jobType
				+ ", service=" + service + ", notifcation=" + notifcation + "]";
	}
	

	
}
