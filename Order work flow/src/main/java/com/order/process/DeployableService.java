package com.order.process;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class DeployableService implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String netWorkstate;
	public String getId() {
		return id;
	}
	@XmlElement
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getNetWorkstate() {
		return netWorkstate;
	}
	@XmlElement
	public void setNetWorkstate(String netWorkstate) {
		this.netWorkstate = netWorkstate;
	}
	@Override
	public String toString() {
		return "DeployableService [id=" + id + ", name=" + name
				+ ", netWorkstate=" + netWorkstate + "]";
	}
	
	

}
