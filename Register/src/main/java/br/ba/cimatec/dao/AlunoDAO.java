/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.dao;

import br.ba.cimatec.mapeamento.Aluno;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Windows
 */
public class AlunoDAO implements AlunoDaoListener {
     private Session sessao;
    public void setSessao(Session sessao) {
        this.sessao = sessao;
    }
    
    @Override
    public void salvar(Aluno al){
        this.sessao.save(al);
    }
    
    @Override
    public void alterar(Aluno al){
        this.sessao.update(al);
    }
    
    @Override
    public void excluir(Aluno al){
        this.sessao.delete(al);
    }
    
    @Override
    public List<Aluno> listarSemFiltro(){
        return this.sessao.createCriteria(Aluno.class).list();
    }
    
    @Override
    public Aluno consultar(int matricula){
        return (Aluno) this.sessao.get(Aluno.class,matricula);
    }
    
    @Override
    public Aluno buscarAlunoporNome(String nome) {
        String hql = "select t from Aluno t where t.nome = :nomeA";
        Query consulta = this.sessao.createQuery(hql);
        consulta.setString("nomeA", nome);
        return (Aluno) consulta.uniqueResult();
    }
    
    @Override
    public List<Aluno> listarAlunosporFaixa(int ini, int fim) {
        String hql = "select t from Aluno t where t.matricula >= :ini and t.matricula <= :fim";
    Query consulta = this.sessao.createQuery(hql);
    consulta.setInteger("ini", ini);
    consulta.setInteger("fim", fim);
    return (List<Aluno>) consulta.list();
    }
    
    @Override
    public List<Aluno> listarAlunosPorLike(String part){
        Criteria crit = this.sessao.createCriteria(Aluno.class);
        crit.add(Restrictions.like("nome","%"+part+"%"));
        return (List<Aluno>) crit.list();
    
    }
}
