package org.bp.travel;

import org.apache.camel.builder.RouteBuilder;

public class TravelBookingService extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		gateway();
	}

	private void gateway() {
		
	}
}
