package com.wipro.coe.microservices.data.promotions.entity;

public class Offer implements java.io.Serializable{


	private String offerId;
	

	private String offerDescription;


	public String getOfferId() {
		return offerId;
	}


	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}


	public String getOfferDescription() {
		return offerDescription;
	}


	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}
	
	
	
}
