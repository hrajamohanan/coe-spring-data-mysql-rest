package com.wipro.coe.microservices.data.promotions;


//package com.wipro.coe.microservices.data.promotions;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.coe.microservices.data.promotions.entity.Promotion;


@Transactional

public interface PromotionRepository extends JpaRepository <Promotion, Long>{
	



}
