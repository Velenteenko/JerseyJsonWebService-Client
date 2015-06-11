package ua.vde.rest.jersey.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ua.vde.rest.jersey.object.Student;


@Path("/StudentServiceApi")
public class StudentJerseyRestService {
	
	
	@GET
	@Path("/getJson/{firstName}/{lastName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student produceJSON(@PathParam("firstName") String firstName,
			@PathParam("lastName") String lastName) {

		Student st = new Student(1, firstName, lastName, 20);
		return st;
	}

	@GET
	@Path("/getJson/{firstName}/{lastName}/{age}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student produceJSON(@PathParam("firstName") String firstName,
			@PathParam("lastName") String lastName, @PathParam("age") int age) {
		
		Student st = new Student(1, firstName, lastName, age);
		return st;
	}

}
