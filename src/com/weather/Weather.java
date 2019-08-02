package com.weather;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/weather")
public class Weather {
	
	@GET
	@Produces(MediaType.TEXT_XML)
	
	public String getWeather() {
		String response="<?xml version='1.0' encoding='UTF-8'?>" + 
				"<data><place>Bloomington</place><temp>80</temp></data>";
				
		return response;
		
	}

}

