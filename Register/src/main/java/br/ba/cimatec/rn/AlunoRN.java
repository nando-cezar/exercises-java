/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.rn;

import br.ba.cimatec.dao.AlunoDaoListener;
import br.ba.cimatec.mapeamento.Aluno;
import br.ba.cimatec.util.FabricaDAO;
import java.util.List;

/**
 *
 * @author Windows
 */
public class AlunoRN {
    
    private AlunoDaoListener alunoDao;
    
    public AlunoRN() {
        this.alunoDao = FabricaDAO.criarAlunoDAO();
    }
    public void alterar(Aluno al){
        this.alunoDao.alterar(al);
    }
    public Aluno buscarAlunoporNome(String nome){
        return this.alunoDao.buscarAlunoporNome(nome);
    }
    public Aluno consultar(int matricula){
        return this.alunoDao.consultar(matricula);
    }
    public void excluir(Aluno al){
        this.alunoDao.excluir(al);
    }
    public List<Aluno> listarAlunosPorLike(String part){
        return this.alunoDao.listarAlunosPorLike(part);
    }
    public List<Aluno> listarAlunosporFaixa(int ini, int fim){
        return this.alunoDao.listarAlunosporFaixa(ini, fim);
    }
    public List<Aluno> listarSemFiltro(){
        return this.alunoDao.listarSemFiltro();
    }
    public void salvar(Aluno al){
        this.alunoDao.salvar(al);
    }
    
    public void atualizar(Aluno al){
        if (al.getMatricula() != null){
            this.alunoDao.alterar(al);
        }
        else{
            this.alunoDao.salvar(al);
        }
    }
}
