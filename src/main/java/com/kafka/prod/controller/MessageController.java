package com.kafka.prod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.prod.service.SendMessage;

@RestController
@RequestMapping("/order")
public class MessageController {
	@Autowired
	SendMessage sendMessage;
	
	@GetMapping("/send/{message}")
	public String message(@PathVariable(name="message") String message) {
		return sendMessage.notification(message);
	}

}
