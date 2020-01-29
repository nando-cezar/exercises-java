/*
 * ClienteDAOListener.java
 *
 * Created on 18 de Dezembro de 2008, 19:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.ba.exemplojdbc.persistencia;

import br.ba.exemplojdbc.beans.ClienteBeans;
import java.util.List;

/**
 *
 * @author Portugal
 */
public interface ClienteDAOListener {
    /**
     * Método que atualiza os dados na tabela cliente
     * 
     * @param cliente - recebe o objeto ClienteBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
    void atualizar(ClienteBeans cliente) throws Exception;

    /**
     * Método que exclui uma linha na tabela cliente
     * 
     * @param cliente - recebe o objeto ClienteBeans
     * @throws se não for possível excluir o cliente
     */
    void excluir(ClienteBeans cliente) throws Exception;

    /**
     * Método responsável por pesquisar um cliente
     * 
     * @param id - recebe um Inteiro como parâmetro para pesquisar
     * pelo campo codigo
     * @return objeto ClienteBeans
     * @throws java.lang.Exception se não for possível retornar o objeto cliente
     */
    ClienteBeans procurarCliente(Integer id) throws Exception;

    void salvar(ClienteBeans cliente) throws Exception;

    /**
     * Método que retorna todos os clientes
     * 
     * @return objeto List
     * @throws java.lang.Exception se não for possível retornar o objeto List
     */
    List todosClientes() throws Exception;
   
    public List todasCategorias( )  throws Exception;
}
