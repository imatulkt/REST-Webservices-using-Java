package com.atul.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/*
 * Creating a simple REST API in Java
 * It is capable to give response in form of HTML or JSON or XML as per client request.
 */

/// Actual path would be :
// http://localhost:8081/customerrest/hello
@Path("/hello")
public class HelloResource {

	@GET
	@Produces("text/plain")
	public String sayTextHello() {
		return "Hello World";
	}
	
	@GET
	@Produces("application/json")
	public String sayJSONHello() {
		return "{\"message\" :\"Hello World\" }";
	}
	
	@GET
	@Produces({"text/html","application/xml"})
	public String sayHTMLHello() {
		return "<h2>Hello World</h2>";
	}
}