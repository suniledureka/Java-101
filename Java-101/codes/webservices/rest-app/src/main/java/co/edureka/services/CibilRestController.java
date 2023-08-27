package co.edureka.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/cibil")
public class CibilRestController {
	@GET
	@Produces("text/plain")
	@Path("/score")
	public String getCibilScore(@QueryParam("name") String name, @QueryParam("pan") String pan) {
		String responseText ="";
		if(pan.length() == 10) {
			//logic to get the score from DB
			responseText = "Hi "+name+", your PAN is "+pan.toUpperCase()+", and your Cibil Score is 803";
		}
		else {
			responseText = "Hi "+name+", please submit a correct PAN number";
		}
		
		return responseText;
	}
}
