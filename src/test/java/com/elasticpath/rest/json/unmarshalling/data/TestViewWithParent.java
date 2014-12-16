package com.elasticpath.rest.json.unmarshalling.data;

import com.elasticpath.rest.json.unmarshalling.annotations.JsonPath;


public class TestViewWithParent extends MixedAnnotationsSuperClass {

	@JsonPath("$._total[0].cost[0].currency")
	private String currency;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(final String currency) {
		this.currency = currency;
	}
}