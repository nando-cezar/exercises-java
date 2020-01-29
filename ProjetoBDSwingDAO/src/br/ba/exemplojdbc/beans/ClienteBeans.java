/*
 * ClienteBeans.java
 *
 * Created on 18 de Dezembro de 2008, 18:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.ba.exemplojdbc.beans;

/**
 *
 * @author Portugal
 */
public class ClienteBeans {
    
    /**
     * Creates a new instance of ClienteBeans
     */
    public ClienteBeans() {
    }

    public ClienteBeans(int codig, String nom, String ender) {
        
        this.codigo=codig;
        this.nome=nom;
        this.endereco=ender;
        
    }

    public ClienteBeans(int codigo, String nome, String endereco, CategoriaBean categoriaBean) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.categoriaBean = categoriaBean;
    }
  
    
    private int codigo;

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Mantém o valor da propriedade nome.
     */
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Mantém o valor da propriedade endereco.
     */
    private String endereco;

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    private CategoriaBean categoriaBean;

    public CategoriaBean getCategoriaBean() {
        return categoriaBean;
    }

    public void setCategoriaBean(CategoriaBean categoriaBean) {
        this.categoriaBean = categoriaBean;
    }
    
    
}
