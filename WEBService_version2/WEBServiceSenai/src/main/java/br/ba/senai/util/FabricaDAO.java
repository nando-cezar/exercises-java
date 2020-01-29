/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.util;

import br.ba.senai.dao.AlunoDAO;

/**
 *
 * @author André Portugal
 */
public class FabricaDAO {
        public static AlunoDAO criarAlunoDAO(HibernateUtil hb){
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.setSessao(hb.getSessionFactory().openSession());
        return alunoDAO;
    }

}
