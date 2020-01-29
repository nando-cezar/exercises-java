/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.exemplojdbc.beans;

/**
 *
 * @author André Portugal
 */
public class CategoriaBean {
    private int codigocat;
    private String nomecat;
    public CategoriaBean() {
    }
    public CategoriaBean(int codigocat, String nomecat) {
        this.codigocat = codigocat;
        this.nomecat = nomecat;
    }
    public int getCodigocat() {
        return codigocat;
    }
    public void setCodigocat(int codigocat) {
        this.codigocat = codigocat;
    }
    public String getNomecat() {
        return nomecat;
    }
    public void setNomecat(String nomecat) {
        this.nomecat = nomecat;
    }

    @Override
    public String toString() {
        return nomecat; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codigocat;
        hash = 29 * hash + (this.nomecat != null ? this.nomecat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CategoriaBean other = (CategoriaBean) obj;
        if (this.codigocat != other.codigocat) {
            return false;
        }
        if ((this.nomecat == null) ? (other.nomecat != null) : !this.nomecat.equals(other.nomecat)) {
            return false;
        }
        return true;
    }
    
    
}
