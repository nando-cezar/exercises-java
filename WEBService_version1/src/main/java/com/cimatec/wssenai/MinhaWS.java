/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cimatec.wssenai;

import com.cimatec.wssenai.objetos.Aluno;
import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Windows
 */
@Path("meucaminho")
public class MinhaWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MinhaWS
     */
    public MinhaWS() {
    }

    /**
     * Retrieves representation of an instance of com.cimatec.wssenai.MinhaWS
     * @return an instance of java.lang.String
     */
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getXml() {
//        //TODO return proper representation object
//        return "Eu amo VCS!!!";
//    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/somar")
    public String somar(@QueryParam("v1") String v1, @QueryParam("v2") String v2) {
        //TODO return proper representation object
        double valor1 = Double.parseDouble(v1);
        double valor2 = Double.parseDouble(v2);
        double res = valor1 + valor2;
        return String.valueOf(res);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/multiplicar")
    public String multiplicar(@QueryParam("v1") String v1, @QueryParam("v2") String v2) {
        //TODO return proper representation object
        double valor1 = Double.parseDouble(v1);
        double valor2 = Double.parseDouble(v2);
        double res = valor1 * valor2;
        return String.valueOf(res);
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes("application/json;charset=UTF-8")
    @Path("/objeto")
    public String getObjeto(@QueryParam("nome") String nome){
        //TODO return proper representation object      
        
        Gson g = new Gson();
        return g.toJson(new Aluno(nome, 30));
    }

    /**
     * PUT method for updating or creating an instance of MinhaWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
