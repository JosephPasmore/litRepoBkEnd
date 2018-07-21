package com.jwt.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/service")
public class RetrieveNapReference {

    @GET
    @Path("/{retrieveNaps}")
    public Response retrieveNaps() {

        String output = "Welcome  Joseph";

        return Response.status(200).entity(output).build();
    }
}