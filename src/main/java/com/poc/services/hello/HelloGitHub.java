package com.poc.services.hello;

@javax.ws.rs.Path("/hello")
public class HelloGitHub {

	@javax.inject.Inject
	HelloService service;
	
	@javax.ws.rs.Path("/text")
	@javax.ws.rs.GET @javax.ws.rs.Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String text(@javax.ws.rs.QueryParam("name") String name) {
		return service.message(name);
	}

	@javax.ws.rs.Path("/xml")
	@javax.ws.rs.GET @javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public javax.ws.rs.core.Response xml(@javax.ws.rs.QueryParam("name") String name) {
		String result = "<xml><result>" + service.message(name) + "</result></xml>";
		return javax.ws.rs.core.Response.status(java.net.HttpURLConnection.HTTP_OK)
					.entity(result).build();
	}

	@javax.ws.rs.Path("/json")
	@javax.ws.rs.GET @javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response json(@javax.ws.rs.QueryParam("name") String name) {
		String result = "{\"result\":\"" + service.message(name) + "\"}";

		return javax.ws.rs.core.Response.status(java.net.HttpURLConnection.HTTP_OK)
				.entity(result).build();
	}

}
