package com.kafka.cabbookdriver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.cabbookdriver.constant.AppConstant;

@Service
public class CabLocationService {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean UpdateLocation(String location) {
		kafkaTemplate.send(AppConstant.CAB_LOCATION, location);
		return true;
	}
}
