/*
 * ClienteDAO.java
 *
 * Created on 18 de Dezembro de 2008, 18:57
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.ba.exemplojdbc.persistencia;

import br.ba.exemplojdbc.beans.CategoriaBean;
import br.ba.exemplojdbc.beans.ClienteBeans;
import br.ba.exemplojdbc.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Portugal
 */
public class ClienteDAO implements ClienteDAOListener {
    Connection conn;

    public ClienteDAO()throws Exception{
        try {
            this.conn = Conexao.getConnection( );
        } catch( Exception e ) {
            throw new Exception( "Erro: " +  ":\n" + e.getMessage( ) );
        }
    }
    @Override
    public void salvar(ClienteBeans cliente)  throws Exception{
        PreparedStatement ps = null;
        Connection conn = null;
        if (cliente == null)
            throw new Exception("O valor passado não pode ser nulo");
        try {
            
            String SQL = "INSERT INTO cliente (nome, endereco, codigocat) "+ "values (?, ?, ?)";
            conn = this.conn;
            ps = conn.prepareStatement(SQL);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setInt(3, cliente.getCategoriaBean().getCodigocat());
            ps.executeUpdate( );
        } catch (SQLException sqle) {
            throw new
                    Exception("Erro ao inserir dados "+ sqle);
        } finally {
            Conexao.closeConnection(conn, ps);
        }
    }
    
    /**
     * Método que exclui uma linha na tabela cliente
     * @param cliente - recebe o objeto ClienteBeans
     * @throws  se não for possível excluir o cliente
   */
    @Override
    public void excluir(ClienteBeans cliente) throws Exception {
        PreparedStatement ps = null;
        Connection conn = null;
        if (cliente == null)
            throw new
                    Exception("O valor passado não pode ser nulo");
        try {
            conn = this.conn;
            ps = conn.prepareStatement("delete from cliente where codigo=?");
            ps.setInt(1, cliente.getCodigo( ));
            ps.executeUpdate( );
        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados:" + sqle);
        } finally {
            Conexao.closeConnection(conn, ps);
        }
        
    }
    
    /**
     * Método que atualiza os dados na tabela cliente
     * @param cliente - recebe o objeto ClienteBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
    @Override
    public void atualizar(ClienteBeans cliente)  throws Exception {
        PreparedStatement ps = null;
        Connection conn = null;
        if (cliente == null)
            throw new Exception("O valor passado não pode ser nulo");
        
        try {
            String SQL = "UPDATE cliente SET nome=?, " + "endereco=?, codigocat=? " + "where codigo=?";
            conn = this.conn;
            ps = conn.prepareStatement(SQL);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setInt(3, cliente.getCategoriaBean().getCodigocat());
            ps.setInt(4, cliente.getCodigo());
            ps.executeUpdate( );
        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados: "+ sqle);
        } finally {
            Conexao.closeConnection(conn, ps);
            
        }
    }
    
    /**
     * Método que retorna todos os clientes
     * @return objeto List
     * @throws java.lang.Exception se não for possível retornar o objeto List
     */
    @Override
    public List todosClientes( )  throws Exception{
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = this.conn;
            ps = conn.prepareStatement("select * from cliente");
            rs = ps.executeQuery( );
            List<ClienteBeans> list = new ArrayList<ClienteBeans>();
            while( rs.next( ) ) {
                Integer codigo = rs.getInt(1);
                String nome = rs.getString(2);
                String endereco = rs.getString(3);
                //CategoriaBean categoria = procurarCategoria(rs.getInt(4));
                //list.add(new ClienteBeans(codigo,nome,endereco,categoria) );
                list.add(new ClienteBeans(codigo,nome,endereco) );
            }
            return list;
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            Conexao.closeConnection(conn, ps, rs);
        }
    }
    @Override
    public List todasCategorias( )  throws Exception{
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = this.conn;
            ps = conn.prepareStatement("select * from categoria");
            rs = ps.executeQuery( );
            List<CategoriaBean> list = new ArrayList<CategoriaBean>();
            while( rs.next( ) ) {
                Integer codigocat = rs.getInt(1);
                String nomecat = rs.getString(2);
                list.add(new CategoriaBean(codigocat,nomecat) );
            }
            return list;
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            Conexao.closeConnection(conn, ps, rs);
        }
    }
    
    /**
     * Método responsável por pesquisar um cliente
     * @param id - recebe um Inteiro como parâmetro para pesquisar
     * pelo campo codigo
     * @return objeto ClienteBeans
     * @throws java.lang.Exception se não for possível retornar o objeto cliente
     */
    @Override
    public ClienteBeans procurarCliente(Integer id) throws  Exception {
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = this.conn;
            ps = conn.prepareStatement("select * from cliente where codigo=?");
            ps.setInt(1, id);
            rs = ps.executeQuery( );
            if( !rs.next( ) ) {
                throw new Exception( "Não foi encontrado nenhum" + " registro com o ID: " + id );
            }
            String nome = rs.getString( 2 );
            String endereco = rs.getString( 3 );
            CategoriaBean categoria = procurarCategoria(rs.getInt(4));
            return new ClienteBeans(id, nome, endereco,categoria) ;
        } catch (SQLException sqle) {
            throw new  Exception(sqle);
        } finally {
            Conexao.closeConnection(conn, ps, rs);
        }
    }
    public CategoriaBean procurarCategoria(Integer id) throws  Exception {
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = this.conn;
            ps = conn.prepareStatement("select * from categoria where codigocat=?");
            ps.setInt(1, id);
            rs = ps.executeQuery( );
            if( !rs.next( ) ) {
                throw new Exception( "Não foi encontrado nenhum" + " registro com o ID: " + id );
            }
            String nome = rs.getString( 2 );
            return new CategoriaBean(id, nome) ;
        } catch (SQLException sqle) {
            throw new  Exception(sqle);
        } finally {
            Conexao.closeConnection(conn, ps, rs);
        }
    }
}
