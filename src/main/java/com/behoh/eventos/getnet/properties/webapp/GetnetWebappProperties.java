package com.behoh.eventos.getnet.properties.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.behoh.eventos.getnet.properties.GetnetProperties;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
@ConfigurationProperties("getnet")
public class GetnetWebappProperties implements GetnetProperties{

	@Autowired
	private GetnetClientWebappProperties client;

}
