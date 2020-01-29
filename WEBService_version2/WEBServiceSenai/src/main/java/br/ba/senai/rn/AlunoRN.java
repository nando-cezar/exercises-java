/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.rn;

import br.ba.senai.dao.AlunoDAO;
import br.ba.senai.mapeamento.Aluno;
import br.ba.senai.util.FabricaDAO;
import br.ba.senai.util.HibernateUtil;

/**
 *
 * @author André Portugal
 */
public class AlunoRN {

    private AlunoDAO alunoDAO;

    public AlunoRN(HibernateUtil hb) {

        this.alunoDAO = FabricaDAO.criarAlunoDAO(hb);

    }

    public void salvar(Aluno al) {
        
        this.alunoDAO.salvar(al);
    }

    public void alterar(Aluno aluno) {
        this.alunoDAO.alterar(aluno);
    }

}
