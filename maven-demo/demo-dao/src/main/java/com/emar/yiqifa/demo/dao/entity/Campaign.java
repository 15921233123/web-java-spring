/**
 * 
 */
package com.emar.yiqifa.demo.dao.entity;

import java.io.Serializable;

/**
 * 活动
 * @author houyefeng
 *
 */
public class Campaign implements Serializable {
	private static final long serialVersionUID = -1117524016869240270L;
	/**
	 * 活动ID
	 */
	private long id;	
	/**
	 * 活动名称
	 */
	private String campaignName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
}
