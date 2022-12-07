package com.behoh.eventos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.behoh.eventos.getnet.properties.GetnetProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private GetnetProperties getnetProps;

	@Override
	public void run(String... args) throws Exception {
		log.info(getnetProps.getClient().getLogin());
	}
	

}
