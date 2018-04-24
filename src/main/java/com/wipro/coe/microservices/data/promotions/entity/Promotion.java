package com.wipro.coe.microservices.data.promotions.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "promotion")
public class Promotion implements java.io.Serializable{
	
	@Id
	//@PrimaryKeyColumn (name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String description;

	@Column(name="PROMOTIONSTARTDATE")
	private Date promotionStartDate;

	@Column(name="PROMOTIONENDDATE")
	private Date promotionEndDate;
	
	@Column(name="PROMOTIONOWNERNAME")
	private String promotionOwnerName;
	
	
	@Column
	private String lastAction;
	
	
	@Column
	private String lastActionBy;

//	@RestResource(exported = false)
//	@Column
//	private List<Offer> offers ;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPromotionStartDate() {
		return promotionStartDate;
	}

	public void setPromotionStartDate(Date promotionStartDate) {
		this.promotionStartDate = promotionStartDate;
	}

	public Date getPromotionEndDate() {
		return promotionEndDate;
	}

	public void setPromotionEndDate(Date promotionEndDate) {
		this.promotionEndDate = promotionEndDate;
	}

	public String getPromotionOwnerName() {
		return promotionOwnerName;
	}

	public void setPromotionOwnerName(String promotionOwnerName) {
		this.promotionOwnerName = promotionOwnerName;
	}

	public String getLastAction() {
		return lastAction;
	}

	public void setLastAction(String lastAction) {
		this.lastAction = lastAction;
	}

	public String getLastActionBy() {
		return lastActionBy;
	}

	public void setLastActionBy(String lastActionBy) {
		this.lastActionBy = lastActionBy;
	}

//	public List<Offer> getOffers() {
//		return offers;
//	}
//
//	public void setOffers(List<Offer> offers) {
//		this.offers = offers;
//	}
	
	
	

}
