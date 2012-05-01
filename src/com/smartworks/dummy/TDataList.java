package com.smartworks.dummy;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "DataList")
public class TDataList {
	
	@XmlElement(name = "employee", required = true)
	private List<TEmployee> listObjects;

	public List<TEmployee> getListObjects() {
		return listObjects;
	}

	public void setListObjects(List<TEmployee> listObjects) {
		this.listObjects = listObjects;
	}
	
	
}
