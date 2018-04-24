package com.wipro.coe.microservices.data.promotions;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wipro.coe.microservices.data.promotions.entity.Offer;
import com.wipro.coe.microservices.data.promotions.entity.Promotion;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class CoeSpringDataMysqlRestApplicationTests {

	//@Test
	public void contextLoads() {
	}

	
	//@Test
	public void TestInsertPromotions()
	
	{
		
		List<Offer> offers = new ArrayList<Offer>();
		Offer offer ;
		
		offer = new Offer();
		offer.setOfferId("1");
		offer.setOfferDescription("Description1");
		offers.add(offer);
		
		offer = new Offer();
		offer.setOfferId("2");
		offer.setOfferDescription("Description2");
		
		offers.add(offer);
		
		Promotion promotion = new Promotion();
		
		promotion.setId(1L);
		
		promotion.setDescription("PromotionDescription");
		
		promotion.setLastAction("ranajit");
		//promotion.setOffers(offers);
		promotion.setLastAction("added");
		promotion.setPromotionEndDate(new Date(88888888));
		promotion.setPromotionStartDate(new Date(8888889));
		promotion.setPromotionOwnerName("ranajit");
		
		
		
	}
}
