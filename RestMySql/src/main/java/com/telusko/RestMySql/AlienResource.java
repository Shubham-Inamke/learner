package com.telusko.RestMySql;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("aliens")
public class AlienResource 
{
	AlienRepository repo = new AlienRepository();
	
    @GET		// to retrieve or read the GET request
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Alien> getAliens() 
    {
    	System.out.println("getAliens() called...");
		return repo.getAliens();
    }
    
    @GET
    @Path("alien/{id}") // why {id}-> to get id in any format. eg string,int etc..
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})// to get o/p in any format
    public Alien getAlien(@PathParam("id") int id) 
 // why @PathParam to get the path parameter and get the details of the id
    {
    	return repo.getAlien(id);
    }
    
    
    @POST	// to create a resource or to store in db 
    @Path("alien")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})  // used for post requ. to send and accept the request
    public Alien createAlien(Alien a1)
    {
    	System.out.println(a1);
    	repo.create(a1);
    	return a1;
    }
    
    @PUT
    @Path("alien")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Alien updateAlien(Alien a1)
    {
    	System.out.println(a1);
    	if(repo.getAlien(a1.getId()).getId()==0)
    	{
    		repo.create(a1);
    	}
    	else
    	{
    	repo.update(a1);
    	}
    	return a1;
    }
    
    @DELETE
    @Path("alien/{id}")
    public Alien deleteAlien(@PathParam("id")int id)
    {
    	Alien a = repo.getAlien(id);
    	if(a.getId()!=0)
    	 repo.delete(id);
    	return a;
    }
}
