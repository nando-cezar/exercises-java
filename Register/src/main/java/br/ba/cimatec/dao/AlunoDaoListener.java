/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.dao;

import br.ba.cimatec.mapeamento.Aluno;
import java.util.List;

/**
 *
 * @author Windows
 */
public interface AlunoDaoListener {

    void alterar(Aluno al);

    Aluno buscarAlunoporNome(String nome);

    Aluno consultar(int matricula);

    void excluir(Aluno al);

    List<Aluno> listarAlunosPorLike(String part);

    List<Aluno> listarAlunosporFaixa(int ini, int fim);

    List<Aluno> listarSemFiltro();

    void salvar(Aluno al);
    
}
