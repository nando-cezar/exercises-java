/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.webservicesenai;

import br.ba.senai.rn.AlunoRN;
import br.ba.senai.util.HibernateUtil;
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
import org.hibernate.Hibernate;

/**
 * REST Web Service
 *
 * @author André Portugal
 */
@Path("exemplo")
public class ExemploResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ExemploResource
     */
    public ExemploResource() {
    }

    /**
     * Retrieves representation of an instance of br.ba.fvc.webservicesenai.ExemploResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getXml() {
        //TODO return proper representation object
        return "teste";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/somar")
    public String getSomar(@QueryParam("v1")String v1, @QueryParam("v2")String v2) {
        //TODO return proper representation object
        return String.valueOf(Integer.parseInt(v1)+Integer.parseInt(v2));
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/subtrair")
    public String getSubtrair(@QueryParam("v1")String v1, @QueryParam("v2")String v2) {
        //TODO return proper representation object
        return String.valueOf(Integer.parseInt(v1)-Integer.parseInt(v2));
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes("application/json;charset=UTF-8")
    @Path("/objeto")
    public Aluno getObjeto(@QueryParam("nome")String nome) {
        //TODO return proper representation object
        
        return new Aluno(1, nome);
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes("application/json")
    @Path("/objeto2")
    public Aluno getObjeto(Aluno a) {
        //TODO return proper representation object
        HibernateUtil hbutil = new HibernateUtil();
        AlunoRN rn = new AlunoRN(hbutil);
        rn.salvar(new br.ba.senai.mapeamento.Aluno(a.getCodigo(), a.getNome()));
        return a;
    }

    /**
     * PUT method for updating or creating an instance of ExemploResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
