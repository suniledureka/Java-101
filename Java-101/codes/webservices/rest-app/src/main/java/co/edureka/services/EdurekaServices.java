package co.edureka.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/plain")
	public String indiaCustomerService() {
		return "Welcome to Edureka's India Customer Service";
	}
	
	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalCustomerService() {
		return "<p style=font-size:25px;color:blue>Welcome to Edureka's International Customer Service</p>";
	}	
}
