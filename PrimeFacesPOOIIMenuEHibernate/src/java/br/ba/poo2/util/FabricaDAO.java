/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.poo2.util;

import br.ba.poo2.dao.AlunoDAO;
import br.ba.poo2.dao.AlunoDAOListener;

/**
 *
 * @author André Portugal
 */

/*
CREATE TABLE `aluno` (
  `matricula` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `datanasc` datetime DEFAULT NULL,
  `valormensal` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


*/
public class FabricaDAO {

    public static AlunoDAOListener criarAlunoDAO(){
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.setSessao(HibernateUtil.getSessionFactory().getCurrentSession());
        return alunoDAO;
    }
}
