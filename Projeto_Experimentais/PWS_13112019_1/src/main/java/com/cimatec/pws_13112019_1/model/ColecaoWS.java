/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cimatec.pws_13112019_1.model;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
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
@Path("colecao")
public class ColecaoWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of colecaoWS
     */
    public ColecaoWS() {
    }

    /**
     * Retrieves representation of an instance of com.cimatec.pws_13112019_1.model.ColecaoWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        //TODO return proper representation object
        return "Boa Noite";
    }
   
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
    @Path("/objeto1")
    public String getObjeto1(@QueryParam("nome") String nome){
        //TODO return proper representation object      
        
        Gson g = new Gson();
        return g.toJson(new Aluno(nome, 30));
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes("application/json;charset=UTF-8")
    @Path("/objeto2")
    public String getObjeto2(@QueryParam("nome") String nome, @QueryParam("idade") Integer idade){
        //TODO return proper representation object      
        
        Gson g = new Gson();
        return g.toJson(new Aluno(nome, idade));
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/objeto3")
    public String getObjeto3(String aluno) {
        //TODO return proper representation object      
        Gson g = new Gson();
        Aluno a = g.fromJson(aluno, Aluno.class);
        return g.toJson(a);
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes("application/json;charset=UTF-8")
    @Path("/objeto4")
    public Aluno getObjeto4(Aluno aluno) {
        //TODO return proper representation object      
        
        return aluno;
    }
    
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}
