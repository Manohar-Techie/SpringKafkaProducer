package com.kafka.prod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendMessage {
	
	@Autowired
	KafkaTemplate kafkaTemplate;

	public String notification (String message) {
		kafkaTemplate.send("orders",message);
		return "order event published";
	}

}
