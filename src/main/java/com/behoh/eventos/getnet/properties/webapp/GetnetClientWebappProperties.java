package com.behoh.eventos.getnet.properties.webapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.behoh.eventos.getnet.properties.GetnetClientProperties;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
@ConfigurationProperties("client")
public class GetnetClientWebappProperties implements GetnetClientProperties {
	
	private String login;
	private String password;

}
