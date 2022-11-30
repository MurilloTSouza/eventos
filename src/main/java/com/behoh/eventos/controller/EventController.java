package com.behoh.eventos.controller;

import org.javamoney.moneta.Money;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
	
	@RequestMapping("/test")
	public ResponseEntity<Money> test(){
		
		Money money = Money.of(12.999, "BRL");
		
		return ResponseEntity.ok(money);
	}

}
