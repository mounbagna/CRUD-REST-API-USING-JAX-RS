package org.restapi.BookCrud.crud.resource;

import java.sql.SQLException;
import java.util.ArrayList;
import org.restapi.BookCrud.crud.model.crudmodel;
import org.restapi.BookCrud.crud.service.crudservice;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/crud")
public class crudresource {
	
	crudservice service = new crudservice();
	
	@Path("/insertion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public crudmodel addBook(crudmodel book) {
		 return service.createBook(book);
		
	}
	
	@Path("/retrieve")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<crudmodel>  getBook() throws SQLException {
		 return service.getBook();
		
	}
	
	@Path("/retrieveById/{bid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<crudmodel>  getUser(@PathParam("bid") int id) throws SQLException {
		return service.getBookById(id);
		
	}
	

	
	@Path("/updateBook")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public crudmodel updateBook(crudmodel book) {
		 return service.updatetBook(book);
		
	}
	
	@Path("/deleteUserById/{bid}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public int deleteBook(@PathParam("bid") int id) {
		return service.deletetBook(id);
		
	}

	
	
}
