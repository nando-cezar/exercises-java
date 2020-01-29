/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.filtro;

import br.ba.cimatec.util.HibernateUtil;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.Filter;
import org.hibernate.SessionFactory;

/**
 *
 * @author Windows
 */
public class FiltroConexaoHibernate implements Filter{
    private SessionFactory sf;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.sf = HibernateUtil.getSessionFactory();
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        try {
            this.sf.getCurrentSession().beginTransaction();
            chain.doFilter(request, response);
            this.sf.getCurrentSession().getTransaction().commit();
            this.sf.getCurrentSession().close();
        } catch (Throwable e) {
            try {
                if (this.sf.getCurrentSession().getTransaction().isActive()){
                    this.sf.getCurrentSession().getTransaction().rollback();
                }
            } catch (Throwable t) {
                t.printStackTrace();
            }        }
    }
    @Override
    public void destroy() {
        
    }
}
