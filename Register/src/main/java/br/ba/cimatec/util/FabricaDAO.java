/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.util;

import br.ba.cimatec.dao.AlunoDAO;
import br.ba.cimatec.dao.AlunoDaoListener;

/**
 *
 * @author Windows
 */
public class FabricaDAO {
     public static AlunoDaoListener criarAlunoDAO(){
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.setSessao(HibernateUtil.getSessionFactory().getCurrentSession());
        return alunoDAO;
    }
}
