package com.behoh.eventos.serialization;

import java.io.IOException;
import java.math.RoundingMode;

import org.javamoney.moneta.Money;
import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@JsonComponent
public class MoneyJsonSerializer extends JsonSerializer<Money> {

	@Override
	public void serialize(Money value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		if (value == null) {
			gen.writeNull();
			
		} else {
			gen.writeStartObject();
			gen.writeObjectField("currency", value.getCurrency().getCurrencyCode());
			gen.writeObjectField("value", value.getNumberStripped().setScale(2, RoundingMode.DOWN));
			gen.writeEndObject();
		}
	}

}
