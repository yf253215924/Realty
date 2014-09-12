package com.realty.base.model;

// Generated 2014-4-13 11:32:40 by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;

/**
 * BuildingDecorate generated by hbm2java
 */
public class BuildingDecorate implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int decorateId;
	private String decorateName;

	public BuildingDecorate() {
	}

	public BuildingDecorate(int decorateId) {
		this.decorateId = decorateId;
	}

	public BuildingDecorate(int decorateId, String decorateName) {
		this.decorateId = decorateId;
		this.decorateName = decorateName;
	}

	public int getDecorateId() {
		return this.decorateId;
	}

	public void setDecorateId(int decorateId) {
		this.decorateId = decorateId;
	}

	public String getDecorateName() {
		return this.decorateName;
	}

	public void setDecorateName(String decorateName) {
		this.decorateName = decorateName;
	}

}