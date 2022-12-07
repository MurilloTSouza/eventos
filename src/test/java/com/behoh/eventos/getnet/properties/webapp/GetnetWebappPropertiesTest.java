package com.behoh.eventos.getnet.properties.webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.behoh.eventos.getnet.properties.GetnetProperties;

@SpringBootTest
@ActiveProfiles("dev")
class GetnetWebappPropertiesTest {
	
	@Autowired
	private GetnetProperties getnetProps;

	@Test
	void test() {
		assertEquals("7a62a9fa-456d-418b-83f0-87117c13ca98", getnetProps.getClient().getLogin());
		assertEquals("ac78e953-c800-442b-a70c-cd2bd04e86ac", getnetProps.getClient().getPassword());
	}

}
